package com.careerdevs.game;

import com.careerdevs.actors.Actor;
import com.careerdevs.actors.Dealer;
import com.careerdevs.actors.Player;
import com.careerdevs.cards.Card;
import com.careerdevs.cards.Deck;
import com.careerdevs.cards.GameDeck;
import com.careerdevs.cards.SingleCard;
import com.careerdevs.cards.Hand;

public class Game {

	public static void playGame() {
		System.out.println("Start");
		Deck deck = new GameDeck();
		// Deck deck = new SingleCard();
		deck.shuffle();
		Actor dealer=new Dealer();
		Hand myHand = new Hand(new Player());
		Hand dealerHand = new Hand(dealer);
		
		dealerHand.getCard(new Card(13,"C"));
		dealerHand.getCard(new Card(7,"H"));
		myHand.getCard(new Card(10,"S"));
		myHand.getCard(new Card(1,"D"));
		
		showTable(dealerHand, myHand);
		int choice=dealer.getAction(dealerHand.addUpCards());
		System.out.println("dealer -> "+choice);
//		dealerHand.getCard(deck.draw());
//		dealerHand.getCard(deck.draw());
//		myHand.getCard(deck.draw());
//		myHand.getCard(deck.draw());
//		showTable(dealerHand, myHand);
		//System.out.print(myHand.getName() + ": ");
//		myHand.showHand();
//		System.out.println(myHand.addUpCards());
		
		// System.out.println(myHand.getActor().getAction(myHand.addUpCards()));

//		for (int idx = 0; idx < 4; idx++) {
//			if (idx % 2 == 0) {
//				playerHand.dealCard(deck.draw());
//			} else {
//				dealerHand.dealCard(deck.draw());
//			}
//
//		}
//
//		showTable(dealerHand, playerHand);

		// int bet = player.getBet();
		// int dBet=dealer.setBet();
		// System.out.println("bet: " +bet);
		// int dealerChoice=dealer.getAction(dealerHand.addUpCards());
		// showTable(dealerHand, playerHand);

		System.out.println("end of line");
	}

	private static void showTable(Hand dealerHand, Hand playerHand) {
		System.out.print(playerHand.getName() + " -> ");
		playerHand.showHand();
		System.out.println(" Hand total: " + playerHand.addUpCards());
		System.out.print(dealerHand.getName() + " -> ");
		dealerHand.showHand();
		System.out.println(" Hand total: " + dealerHand.addUpCards());
	}
}
