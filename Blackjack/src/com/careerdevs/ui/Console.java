package com.careerdevs.ui;

import com.careerdevs.objects.Deck;

public class Console {

	public static void displayCard(Deck deck, int index) {
		System.out.print(deck.getDeck().get(index).getValue()+deck.getDeck().get(index).getSuitSym()+" ");
	}
	
	public static void horzLine() {
		System.out.println("\n-----------------------------------------------------------------------------\n");
	}
	public static void displayDeck(Deck deck) {
	for (int idx = 0; idx < deck.getDeck().size(); idx++) {
		Console.displayCard(deck, idx);
	}
	}
}
