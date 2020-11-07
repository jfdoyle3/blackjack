package com.careerdevs.game;

import com.careerdevs.objects.Deck;
import com.careerdevs.ui.Console;

public class Game {

	public static void playGame() {

		Deck deck = new Deck();
		deck.shuffleCards();
		

		for (int i = 0; i < deck.getDeck().size(); i++) {
			Console.displayCard(deck, i);
		}

	}

}
