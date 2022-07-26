package com.crud.dao;

import java.util.List;

import com.crud.domain.BoardVO;

public interface BoardDAO {
	public void create(BoardVO vo) throws Exception;
	public BoardVO read(Integer no) throws Exception;
	public void updateHits(Integer no) throws Exception;
	public void update(BoardVO vo) throws Exception;
	public void delete(Integer no) throws Exception;
	public List<BoardVO> listAll() throws Exception;
}