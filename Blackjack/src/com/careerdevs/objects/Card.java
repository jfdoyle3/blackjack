package com.careerdevs.objects;



public class Card {
	private int value;
	private String suit;

	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
	}

	public String toString() {
		String output = "";
		switch (value) {
		case 1:
			output = "A"+suit;
			break;
		case 11:
			output = "J"+suit;
			break;
		case 12:
			output = "Q"+suit;
			break;
		case 13:
			output = "K"+suit;
			break;
		default:
			output = value == 10 ? Integer.toString(value) : "" +value+suit;
		}
		return output;
	}
	
	public int getValue() {
		return this.value;
	}
	

}
