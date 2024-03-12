package com.board.boardbackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.boardbackend.repository.BoardRepository;
import com.board.boardbackend.service.BoardService;
import com.board.boardbackend.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {

  @Autowired
  private BoardRepository boardRepository;

  @Override
  public List<BoardVo> getAllBoard() {
    return boardRepository.getAllBoard();
  }
  
}
