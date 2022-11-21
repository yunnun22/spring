package controller;

import org.springframework.stereotype.Controller;

import dto.pageDTO;
import service.BoardService;

@Controller
public class BoardController {

	private BoardService service;
	private pageDTO pdto;
	private int currentPage;
	
	public BoardController() {
	
	}
	
	
}
