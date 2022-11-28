package part01.controller;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	
	//http://localhost:8090/myapp/list.do
	@RequestMapping("/list.do")
	public String listProcess() {
	System.out.println("list Controller");
	return "part01/list";
	}


//http://localhost:8090/myapp/view.do
	@RequestMapping("/view.do")
public String viewProcess() {
	System.out.println("view Controller");
	return "part01/view";
	
}

	//http://localhost:8090/myapp/write.do
	@RequestMapping("/write.do")
	public String writeProcess() {
		System.out.println("write Controller");
		return "part01/write";
	}

}//class
