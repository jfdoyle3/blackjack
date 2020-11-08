package com.careerdevs.objects;



public class Card {
	private int value;
	private int suit;
	private String[] suits = { "S", "H", "C", "D" };
	public String[] royal = { "J", "Q", "K" };
	public boolean Ace;

	// TODO Need to add in J Q K A , replacing 11,12,13,14 : All Faces are 10
	// TODO Ace to be a Boolean method True for High / False for Low : either
	
//	char aa='A';
//	
//	int a=aa;
//	System.out.println(a);   //outputs acsii 
//	System.out.println((char)a); //output char
//	int[] r= {74,81,75};
//	int ace=65;

	public Card(int value, int suit) {
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
}
