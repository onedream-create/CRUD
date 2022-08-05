package com.crud.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crud.domain.BoardVO;
import com.crud.dao.BoardDAO;

import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@ToString
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO boardDAO;
	
	@Override
	public void register(BoardVO board) throws Exception {
		boardDAO.create(board);
	}

	@Override
	public BoardVO read(Integer no) throws Exception {
		boardDAO.updateHits(no);
		return boardDAO.read(no);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		boardDAO.update(board);
	}

	@Override
	public void remove(Integer no) throws Exception {
		boardDAO.delete(no);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return boardDAO.listAll();
	}
}
