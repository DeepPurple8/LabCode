package com.poc.x311.model;

public class Hand {
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCard1() {
		return card1;
	}

	public void setCard1(String card1) {
		this.card1 = card1;
	}

	public String getCard2() {
		return card2;
	}

	public void setCard2(String card2) {
		this.card2 = card2;
	}

	private Integer id;
	private String card1;
	private String card2;
	
	public Hand() {};
	
	public Hand(Integer a, String b, String c) {
		id = a;
		card1 = b;
		card2 = c;
	}
	
}
