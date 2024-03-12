package com.board.boardbackend.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.boardbackend.vo.BoardVo;

@Mapper
public interface BoardRepository {
  List<BoardVo> getAllBoard();
}
