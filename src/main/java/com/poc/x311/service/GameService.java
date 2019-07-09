package com.poc.x311.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.x311.model.Hand;

@Service
public class GameService {
	private List<Hand> hands = Arrays.asList(new Hand());
	
	public List<Hand> getHands() { return hands; }
	
	public Hand getHand(Integer id) {
		return hands.stream()
				.filter(h -> h.getId().equals(id))
				.findFirst()
				.get();
	}
	
	public void addHand(Hand h) {
		hands.add(h);
	}
	
	public void deleteHand(Integer id) {
		hands.removeIf(h -> h.getId().equals(id));
	}
	
}
