package com.careerdevs.game;

import com.careerdevs.cards.Card;
import com.careerdevs.cards.Deck;
import com.careerdevs.cards.GameDeck;
import com.careerdevs.cards.SingleCard;
import com.careerdevs.cards.Hand;
import com.careerdevs.objects.Actor;
import com.careerdevs.objects.Dealer;

public class Game {
	
	

	public static void playGame() {

	Deck deck = new GameDeck();
//	Deck deck = new SingleCard();
	deck.shuffle();
	
	Actor dealer=new Dealer();
	Hand hand=new Hand(dealer);
	hand.addCard(new Card(1,"♠"));
	hand.addCard(new Card(13,"♠"));
	hand.addCard(new Card(12,"♠"));
	hand.showHand();
	System.out.println(" ---> "+hand.addUpCards());
	hand.showHand();
	System.out.println(" ---> "+hand.addUpCards());
	}

}
