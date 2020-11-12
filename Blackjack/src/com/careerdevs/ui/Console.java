package com.careerdevs.ui;

import com.careerdevs.objects.Card;


public class Console {

	public static void displayCard(Card card) {
		System.out.print(card.toString()+" ");
	}
	
	public static void horzLine() {
		System.out.println("\n-----------------------------------------------------------------------------\n");
	}
	
	public static void askPlayName() {
		System.out.print("What is the player name? ");
	}

	public static void welcomePlayer(String name, int wallet) {
		System.out.printf("Welcome %s to the game. You have %d chips to start\n\n\n",name,wallet);
	}
}
