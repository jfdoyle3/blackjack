package com.careerdevs.objects;

import java.util.List;

import java.util.List;

import java.util.List;

import com.careerdevs.ui.Console;

public class Card {
	private int value;
	private String suit;
	private static boolean aceHigh;

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
		return this.value;
	}
	
	public static boolean findAce(List<Card> hand) {
		int ace = hand.stream().mapToInt(card -> card.getValue()).min().getAsInt();
		if(ace==1) {
			aceHigh=true;
		}
		return aceHigh;
		
	}
	

}
