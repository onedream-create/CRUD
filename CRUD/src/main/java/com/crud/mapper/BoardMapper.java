package com.crud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.crud.domain.BoardVO;

@SuppressWarnings("unused")
public abstract class BoardMapper {
	public abstract List<BoardVO> listAll();
	public abstract void create(BoardVO vo);
	public abstract BoardVO read(Integer bno);
	public abstract int delete(Integer bno);
	public abstract int update(BoardVO vo);
}
