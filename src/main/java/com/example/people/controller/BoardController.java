package com.example.people.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.people.model.BoardEntity;
import com.example.people.repository.BoardRepository;

@RestController
public class BoardController {
	
	@Autowired
	public BoardRepository board;
	
	public BoardController(BoardRepository repo) {
		this.board = repo;
	}
	@GetMapping(value = "/board")
	public List<BoardEntity> getBoard() {
		List<BoardEntity> list = board.findAll();
		return list;
	}
	
	
}
