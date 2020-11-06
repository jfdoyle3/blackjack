package com.careerdevs.ui;

import com.careerdevs.objects.Deck;

public class Console {

	public static void displayCard(Deck deck, int index) {
		System.out.println(deck.getDeck().get(index).getValue()+deck.getDeck().get(index).getSuitSym());
	}
}
