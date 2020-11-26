package com.careerdevs.objects;



public class Card {
	private int value;
	private String suit;
	private boolean aceHigh;

	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
		this.aceHigh=false;
	}

	public String toString() {
		String output = "";
		switch (value) {
		case 1:
			output = "A";
			break;
		case 11:
			output = "J";
			break;
		case 12:
			output = "Q";
			break;
		case 13:
			output = "K";
			break;
		default:
			output = value == 10 ? Integer.toString(value) : "" +value;
		}
		return output+suit;
	}
	
	public int getValue() {
		if (this.value > 10) {
			this.value = 10;
		}
		if (this.value==1 && this.aceHigh==true) {
			this.value=11;
		}
		return this.value;
	}
	
	
	

}
