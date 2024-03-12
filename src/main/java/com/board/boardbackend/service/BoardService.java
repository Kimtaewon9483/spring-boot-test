package com.board.boardbackend.service;

import java.util.List;

import com.board.boardbackend.vo.BoardVo;

public interface BoardService {

  public List<BoardVo> getAllBoard();
}