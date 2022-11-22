package dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dto.BoardDTO;
import dto.PageDTO;

public class BoardDaoImp  implements BoardDAO{
	private SqlSessionTemplate sqlSession;
	
	public BoardDaoImp() {
		
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int count() {
		
		return sqlSession.selectOne("board.count");
	}

	@Override
	public List<BoardDTO> list(PageDTO pv) {
		return sqlSession.selectList("board.list",pv);
	}

	@Override
	public void readCount(int num) {
		sqlSession.update("board.readCount", num);
		
	}

	@Override
	public BoardDTO content(int num) {
		return sqlSession.selectOne("board.view", num);
	}

	@Override
	public void reStepCount(BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(BoardDTO dto) {
		sqlSession.insert("board.save",dto);
		
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
		
		return sqlSession.selectOne("board.uploadFile", num);
	}

}
