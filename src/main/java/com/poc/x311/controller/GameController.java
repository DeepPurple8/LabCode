package com.poc.x311.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.x311.model.Hand;
import com.poc.x311.service.GameService;

@RestController

public class GameController {
	
	@Autowired
	private GameService gameSvc;
	
	@GetMapping("/getAll")
	public List<Hand> getAllHands() {
		return gameSvc.getHands();
	}

	@GetMapping("/{id}")
	public Hand getHand(@PathVariable Integer id) {
		return gameSvc.getHand(id);
	}
	
	@PostMapping("/dealMe") 
	public void addHand(@RequestBody Hand hand) {
		gameSvc.addHand(hand);
	}
	
	@DeleteMapping("/busted/{id}")
	public void deleteHand(@PathVariable Integer id) {
		gameSvc.deleteHand(id);
	}
	
}
