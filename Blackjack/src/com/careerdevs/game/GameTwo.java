package com.careerdevs.game;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.objects.Card;
import com.careerdevs.objects.Deck;
import com.careerdevs.ui.Console;

public class GameTwo {

	public static void gameTwo() {
		
		
		Deck deck = new Deck();
		//Console.displayDeck(deck);
		
		deck.shuffleDeck();
		
		
		
		Console.displayDeck(deck);
		Console.horzLine();
		List<Card> hand=new ArrayList<>();
		for (int i=0; i<4; i++) {

			hand.add();
		}
		deck.removeCard(0);
		
		Console.displayDeck(deck);
		Console.horzLine();
		System.out.println(deck.getDeck().get(0).getValue());
		
	}
}
