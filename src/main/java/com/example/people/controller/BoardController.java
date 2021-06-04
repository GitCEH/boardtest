package com.example.people.controller;

<<<<<<< HEAD
import java.util.List;
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> 4a8b32a62bc1c4ba28931cc253e7be272d3e1b00

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.people.model.BoardEntity;
import com.example.people.repository.BoardRepository;

<<<<<<< HEAD
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
	
	
=======

>>>>>>> 4a8b32a62bc1c4ba28931cc253e7be272d3e1b00
}
