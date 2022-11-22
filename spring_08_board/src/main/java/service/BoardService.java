package service;

import java.util.List;

import dto.BoardDTO;
import dto.PageDTO;

public interface BoardService {
	
	public int countProcess();
	public  List<BoardDTO> listProcess(PageDTO tv);
	public  void insertProcess(BoardDTO dto);
	public  BoardDTO contentProcess(int num);
	public  void reStepProcess(BoardDTO dto);
	public BoardDTO updateSelectProcess(int num);
	public  BoardDTO updateSelectProcess(BoardDTO dto, String urlpath);
	public  void deleteProcess(int num, String urlpath);
	public  String fileSelectProcess(int num);

}
