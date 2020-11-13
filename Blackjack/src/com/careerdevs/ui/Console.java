package com.careerdevs.ui;

import com.careerdevs.objects.Card;

public class Console {

	public static void displayCard(Card card) {
		System.out.print(card.toString() + " ");
	}

	public static void horzLine() {
		System.out.println("\n-----------------------------------------------------------------------------\n");
	}

	public static void askPlayerName() {
		System.out.print("What is the player name? ");
	}

	public static void welcomePlayer(String name, int chips) {
		System.out.printf("Welcome %s to the game. You have %d chips to start", name, chips);
	}

	public static void cardFaceDown(int numberOfCards) {
		for (int idx = 0; idx < numberOfCards; idx++) {
			System.out.println("##");
		}
	}

	public static void bet(int chips) {
		System.out.printf("You have %d chips. How much do you want to bet? ", chips);
	}

	public static void consoleHit(int totalCardCount) {
		System.out.printf("You have %d showing. Do you want to Hit or Stand?", totalCardCount);
	}
	
	public static void placedBet(int betAmount ) {
		System.out.printf("placed Bet: %d chips ",betAmount);
	}

}
