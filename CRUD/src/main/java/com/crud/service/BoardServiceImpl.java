package com.crud.service;

import java.util.List;

import javax.inject.Inject;

import com.crud.domain.BoardVO;
import com.crud.persistence.BoardDAO;

public class BoardServiceImpl {
	@Inject
	  private BoardDAO dao;
	
//	@Override
//	public void regist(BoardVO board) throws Exception {
//		dao.create(board);
//	}
//	
//	@Override
//	public BoardVO read(Integer bno) throws Exception {
//		return dao.read(bno);
//	}
//	
//	@Override
//	public void modify(BoardVO board) throws Exception {
//		dao.update(board);
//	}
//	
//	@Override
//	public void remove(Integer bno) throws Exception {
//		dao.delete(bno);
//	}
//	
//	@Override
//	public List<BoardVO> listAll() throws Exception {
//		return dao.listAll();
	//}
}
