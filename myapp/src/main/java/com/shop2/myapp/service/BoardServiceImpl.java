package com.shop2.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop2.myapp.dto.BoardDTO;
import com.shop2.myapp.model.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardMapper.boardList();
	}
	
	@Override
	public BoardDTO boardDetail(int seq) throws Exception {
		return boardMapper.boardDetail(seq);
	}
	
	public void boardInsert(BoardDTO dto) throws Exception {
		boardMapper.boardInsert(dto);
	}
	
	@Override
	public void boardDelete(int seq) throws Exception {
		boardMapper.boardDelete(seq);
	}
	
	@Override
	public void boardEdit(BoardDTO dto) throws Exception {
		boardMapper.boardEdit(dto);
	}

}
