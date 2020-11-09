package com.careerdevs.game;

import com.careerdevs.objects.Deck;
import com.careerdevs.ui.Console;

public class GameTwo {

	public static void gameTwo() {
		Deck deck = new Deck();
		deck.shuffleDeck();
		Console.displayDeck(deck);
		Console.horzLine();
		
		System.out.println(deck.getDeck().get(0).getValue());
		
		
	}
}
