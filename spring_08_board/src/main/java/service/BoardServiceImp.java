package service;

import java.util.List;

import dao.BoardDAO;
import dto.BoardDTO;
import dto.pageDTO;

public class BoardServiceImp implements BoardDAO{
	private BoardDAO dao;
	
	
	
	public BoardServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDAO> list(pageDTO pv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readCount(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardDTO content(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reStepCount(BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardDTO updateNum(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFile(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
