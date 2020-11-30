package com.careerdevs.objects;

import java.util.List;

import com.careerdevs.ui.Console;

public class Card {
	private int value;
	private String suit;
	private boolean aceHigh;

	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
		
	}

	public String toString() {
		String output = "";
		switch (value) {
		case 1:
		case 11:
			output = "A";
			break;
		case 12:
			output = "J";
			break;
		case 13:
			output = "Q";
			break;
		case 14:
			output = "K";
			break;
		default:
			output = value == 10 ? Integer.toString(value) : "" + value;
		}
		return output + suit;
	}

	public int getValue() {
		if (this.value > 12) {
			this.value = 10;
		}
		boolean aceValue=getAce(this.value);
		System.out.print ("AH: "+aceHigh);
		if (this.aceHigh) {
			this.value = 11;
		}
		return this.value;
	}

	public String getSuit() {
		return this.suit;
	}

//	public boolean setAceHigh() {
//		this.aceHigh=true;
//		return this.aceHigh;
//
//	}
//
//	public boolean setAceLow() {
//		this.aceHigh=false;
//		return this.aceHigh;
//	}

	public  boolean getAce(int aceLow) {
		// int findAceLow = hand.stream().mapToInt(card -> card.getValue()).min().getAsInt();
		System.out.println("Ace Value "+aceLow);
		if (aceLow == 1) {
			return this.aceHigh=true;
		}
		return this.aceHigh=false;

	}

}