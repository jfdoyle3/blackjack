package com.careerdevs.game;

import com.careerdevs.cards.Deck;
import com.careerdevs.cards.GameDeck;
import com.careerdevs.cards.Hand;
import com.careerdevs.objects.Player;

public class Game {
	
	public static void playGame() {

	Deck deck = new GameDeck();
	deck.shuffle();
	Hand hand=new Hand(Dealer);
	hand.dealCards(deck, 3);
	//hand.showHand();
	//System.out.println("\ntotal: "+hand.addUpCards());
	
	Player player1=new Player("Player1",2);
	
	System.out.println("Player1 : ");

	System.out.println("\nend of Line");
	}

}
