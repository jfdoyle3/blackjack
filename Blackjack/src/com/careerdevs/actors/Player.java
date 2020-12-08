package com.careerdevs.actors;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.cards.Card;
import com.careerdevs.cards.Deck;
import com.careerdevs.cards.Hand;
import com.careerdevs.ui.Console;
import com.careerdevs.ui.ErrorConsole;
import com.careerdevs.ui.Input;

public class Player implements Actor {

	private int bet;
	private Hand hand;
	private String type;
	private Input input=new Input();
	private String playerName;
	static int HIT=1, STAND=2, DOUBLE=3, SPLIT=4;
	private int cash;

	public Player() {
		this.playerName = input.inputString("What is your name? ");
		this.cash = cash;
		
	}

//	public List<Card> dealCards(Deck deck, int card) {
//		for (int idx = 0; idx < card; idx++) {
//			hand.add(deck.draw());
//		}
//		return hand;
//	}

//	public static void hit(Deck deck, Hand hand) {
//		hand.add(deck.draw());
//	}

	public String getName() {
		return playerName;
	}

	public Hand getHand() {
		return hand;
	}

	public String getType() {
		return type;
	}

	@Override
	public int setBet() {
		boolean betPlaced = false;
		Console.bet(cash);
		do {
			 bet = Input.inputNumber("bet? ");
			if (bet > cash && bet<0) {
				betPlaced = false;
				ErrorConsole.errorBet(cash);
			} else {
				betPlaced = true;
				cash -= bet;
			}
		} while (!betPlaced);
		
		return bet;
	}

	@Override
	public int getAction(int score) {
			int option=1;
		
		return option;
	}

//	public  static void dealCards() {
//		Deck deck = new Deck();
//		deck.shuffleDeck();
//		for (int idx = 0; idx < 4; idx++) {
//			Card topCard = deck.drawCard(idx);
//			if (idx % 2 == 0) {
//				hand.add(topCard);
//			} else {
//				dealer.add(topCard);
//			}
//		}
}
