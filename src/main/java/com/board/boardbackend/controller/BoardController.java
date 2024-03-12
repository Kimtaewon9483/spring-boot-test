package com.board.boardbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.board.boardbackend.service.BoardService;
import com.board.boardbackend.vo.BoardVo;

import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class BoardController {

  @Autowired
  private BoardService boardService;

  @GetMapping("/api/boards")
  public List<BoardVo> getMethodName() {
    System.out.println("Hello World");
    return boardService.getAllBoard();
  }
  
}
