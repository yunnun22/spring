package service;

import java.util.List;

import dao.BoardDAO;
import dto.BoardDTO;
import dto.pageDTO;

public class BoardServiceImp implements BoardService{
	private BoardDAO dao;
	
	
	
	public BoardServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

	@Override
	public int countProcess() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDTO> listProcess(pageDTO tv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertProcess(BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardDTO contentProcess(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reStepProcess(BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardDTO updateSelectProcess(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO updateSelectProcess(BoardDTO dto, String urlpath) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProcess(int num, String urlpath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fileSelectProcess(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
