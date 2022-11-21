package dao;

import java.util.List;

import dto.BoardDTO;
import dto.pageDTO;

public interface BoardDAO {

	public int count();
	public List<BoardDAO> list(pageDTO pv);
	public void readCount(int num);
	public BoardDTO content(int num);
	public void reStepCount(BoardDTO dto);
	public void save(BoardDTO dto);
	public BoardDTO updateNum(int num);
	public void update(BoardDTO dto);
	public void delete(int num);
	public String getFile(int num);

}
