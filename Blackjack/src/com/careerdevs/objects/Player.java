package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.cards.Hand;
import com.careerdevs.ui.Console;
import com.careerdevs.ui.ErrorConsole;
import com.careerdevs.ui.Input;

public class Player {

	private int bet;
	private int chips;
	private Hand hand;
	private String type;
	private String playerName;

	public Player(String playerName, int chips, Hand hand){
		this.playerName=playerName;
		this.chips = chips;
		this.hand = hand;
		this.type="player";
	}


//	public List<Card> dealCards(Deck deck, int card) {
//		for (int idx = 0; idx < card; idx++) {
//			hand.add(deck.draw());
//		}
//		return hand;
//	}



	public int getBet() {
		return bet;
	}

	public int getChips() {
		return chips;
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
