package com.careerdevs.objects;

import java.util.Arrays;

public class myCard {
	private int value;
	private int suit;
	private String[] suits = { "♠", "♥", "♣", "♦" };
	private String[] royal = { "J", "Q", "K" };
	public boolean Ace=false;
	

	// TODO Need to add in J Q K A , replacing 11,12,13,14 : All Faces are 10
	// TODO Ace to be a Boolean method True for High / False for Low : either
	
//	char aa='A';
//	
//	int a=aa;
//	System.out.println(a);   //outputs acsii 
//	System.out.println((char)a); //output char
//	int[] r= {74,81,75};
//	int ace=65;

	public myCard(int value, int suit) {
		this.value = value;
		this.suit = suit;
	}

	public String royalSym(int idx) {
		return this.royal[idx];
	}

	public int getValue() {
		return value;
	}

	public String getSuitSym() {
		return this.suits[this.suit];
	}

	public String getRoyalCard(int idx) {
		return this.royal[idx];
	}

	public String toString() {
		String output="";
		switch (value) {
		case 1:
			output="AC";
			break;
		case 11:
			output="JA";
			break;
		case 12:
			output="QU";
			break;
		case 13:
			output="KI";
			break;
		default:
			output= value == 10 ? Integer.toString(value):""+value;	
		}
		return output;
	}

}
