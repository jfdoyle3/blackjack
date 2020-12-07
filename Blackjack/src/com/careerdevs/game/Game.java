package com.careerdevs.game;

import com.careerdevs.cards.Card;
import com.careerdevs.cards.Deck;
import com.careerdevs.cards.GameDeck;
import com.careerdevs.cards.SingleCard;
import com.careerdevs.cards.Hand;
import com.careerdevs.objects.Actor;
import com.careerdevs.objects.Dealer;
import com.careerdevs.objects.Player;

public class Game {

	public static void playGame() {

		Deck deck = new GameDeck();
//	Deck deck = new SingleCard();
		deck.shuffle();

		Actor dealer = new Dealer();
		Actor player = new Player("Jim", 2);
		Hand dealerHand = new Hand(dealer);
		Hand playerHand = new Hand(player);
		for (int idx = 0; idx < 4; idx++) {
			if (idx % 2 == 0) {
				playerHand.dealCard(deck.draw());
			} else {
				dealerHand.dealCard(deck.draw());
			}

		}

		showTable(dealerHand, playerHand);

		int bet = player.getBet();

		System.out.println("bet: " + bet);
		
		int dealerChoice=dealer.getAction(dealerHand.addUpCards());
		System.out.println(dealerChoice);

	}

	private static void showTable(Hand dealerHand, Hand playerHand) {
		System.out.print(playerHand.getActor().getName() + " -> ");
		playerHand.showHand();
		System.out.println(" Hand total: " + playerHand.addUpCards());
		System.out.print(dealerHand.getActor().getName() + " -> ");
		dealerHand.showHand();
		System.out.println(" Hand total: " + dealerHand.addUpCards());
	}
}
