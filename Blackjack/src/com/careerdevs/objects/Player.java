package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.ui.Console;
import com.careerdevs.ui.ErrorConsole;
import com.careerdevs.ui.Input;

public class Player {

	private static int betAmount;
	private String playerName;
	private int bet;
	private int chips;

	private static List<String> hand = new ArrayList<>();

	public Player(String playerName, int chips) {
		this.playerName = playerName;
		this.chips = chips;
	}

	public static int placeBet(int chips) {
		boolean betPlaced = false;
		Console.bet(chips);
		do {
			int betAmount = Input.inputNumber();
			if (betAmount > chips) {
				betPlaced = false;
				ErrorConsole.errorBet(chips);
			} else {
				betPlaced = true;
				return betAmount;
			}
		} while (!betPlaced);
		return betAmount;
	}

	public int getBet() {
		return bet;
	}

	public int getChips() {
		return chips;
	}

	public String getPlayerName() {
		return playerName;
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
