package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import dto.BoardDTO;
import dto.PageDTO;
import service.BoardService;

//http://localhost:8090/myapp/list.sb

@Controller
public class BoardController {

	private BoardService service;
	private PageDTO pdto;
	private int currentPage;

	public BoardController() {

	}

	public void setService(BoardService service) {
		this.service = service;
	}

	@RequestMapping("/list.sb")
	public ModelAndView listMethod(PageDTO pv, ModelAndView mav) {

		int totalRecord = service.countProcess();
		if (totalRecord >= 1) {
			if (pv.getCurrentPage() == 0)
				this.currentPage = 1;
			else
				this.currentPage = pv.getCurrentPage();

			this.pdto = new PageDTO(this.currentPage, totalRecord);
			List<BoardDTO> aList = service.listProcess(this.pdto);
			mav.addObject("aList", aList);
			mav.addObject("pv", this.pdto);

		}
		mav.setViewName("board/list");
		return mav;
	}

	@RequestMapping(value = "/write.sb", method = RequestMethod.GET)
	public ModelAndView writeMethod(BoardDTO dto, PageDTO pv, ModelAndView mav) {
		if (dto.getRef() != 0) {// 답변글이면
			mav.addObject("currentPage", pv.getCurrentPage());
			mav.addObject("dto", dto);
		}

		mav.setViewName("board/write");
		return mav;
	}

	@RequestMapping(value = "/write.sb", method = RequestMethod.POST)
	public String writeProMethod(BoardDTO dto, PageDTO pv, HttpServletRequest request) {
		MultipartFile file = dto.getFilename();
		if (!file.isEmpty()) {
			UUID random = saveCopyFile(file, request);
			dto.setUpload(random + "_" + file.getOriginalFilename());

		}

		dto.setIp(request.getRemoteAddr());

		service.insertProcess(dto);
		
		
		// 답변글이면
		if (dto.getRef() != 0) {
			return "redirect:/list.sb?currentPage=" + pv.getCurrentPage();
		} else {// 제목글
			return "redirect:/list.sb";

		}

	}//
	
	@RequestMapping(value = "/update.sb", method = RequestMethod.GET)
	public ModelAndView updateMethod(int num, int currentPage, ModelAndView mav) {
		mav.addObject("dto", service.updateSelectProcess(num));
		mav.addObject("currentPage", currentPage);
		mav.setViewName("board/update");
		return mav;
	}//updateMethod
	
	@RequestMapping(value = "/update.sb", method = RequestMethod.POST)
	public String updateProMethod(BoardDTO dto, int currentPage, HttpServletRequest request) {
		MultipartFile file = dto.getFilename();
		if(!file.isEmpty()) {
			UUID random = saveCopyFile(file, request);
			dto.setUpload(random + "_" + file.getOriginalFilename());
		}
		
		service.updateProcess(dto, urlPath(request));
		return "redirect:/list.sb?currentPage=" + currentPage;
	}//updateProMethod
	
@RequestMapping("/delete.sb")
	public String deleteMethod(int num, int currentPage, HttpServletRequest request) {
		service.deleteProcess(num, urlPath(request));
		
	    int totalRecord = service.countProcess();
	    this.pdto = new PageDTO(this.currentPage, totalRecord);
	    
		return "redirect:/list.sb?currentPage=" + this.pdto.getCurrentPage();
	}//deleteMethod
	
	
	
	

	private UUID saveCopyFile(MultipartFile file, HttpServletRequest request) {
		String fileName = file.getOriginalFilename();

		// 중복파일명을 처리하기 위해 난수 발생
		UUID random = UUID.randomUUID();

		File fe = new File(urlPath(request));
		if (!fe.exists()) {
			fe.mkdir();
		}

		File ff = new File(urlPath(request), random + "_" + fileName);

		try {
			FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(ff));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return random;
	}// savaCopyFile

	private String urlPath(HttpServletRequest request) {
		String root = request.getSession().getServletContext().getRealPath("/");
		System.out.println("root:" + root);
		String saveDirectory = root + "temp" + File.separator;
		return saveDirectory;
	}// urlPath
	
	@RequestMapping("/view.sb")
	public ModelAndView viewMethod(int currentPage, int num, ModelAndView mav) {
		mav.addObject("dto", service.contentProcess(num));
		mav.addObject("currentPage", currentPage);
		mav.setViewName("board/view");
		return mav;
	}//viewMethod
	
	@RequestMapping("/contentdownload.sb")
	public ModelAndView downMethod(int num, ModelAndView mav) {
		mav.addObject("num", num);
		mav.setViewName("download");
		return mav;
		
	}//downMethod
	

}// class
