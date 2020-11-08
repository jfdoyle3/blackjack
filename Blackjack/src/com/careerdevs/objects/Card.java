package com.careerdevs.objects;

import java.util.Random;

public class Card {
    private int value;
    private int suit;
    private String[] suits = { "S", "H", "C", "D" };
    public String[] faces = { "J", "Q", "K", "A" };
    public boolean Ace;
    


    // TODO Need to add in J Q K A , replacing 11,12,13,14 or 11 (Ace) : All Faces are 10
    // TODO Ace to be a Bool method True for High / False for Low :  either 

    public Card()
    {
        Random newCard = new Random();
        Random newSuit = new Random();
        this.value = newCard.nextInt(12)+1;
        this.suit = newSuit.nextInt(4);
    }
    
    public Card(int value, int suit)
    {
        this.value = value;
        this.suit = suit;
    }
    public String SuitSym()
    {
        return this.suits[this.suit];
    }

	public int getValue() {
		return value;
	}

    public String getSuitSym() {
    	return this.suits[this.suit];
    }
}
