package com.careerdevs.game;

import com.careerdevs.cards.Hand;
import com.careerdevs.objects.Table;

public class Game {
	
	private static Table table=new Table();
		
	public static void playGame() {
		System.out.println("Start");
		table.getDeck().shuffle();
		System.out.println();
		table.getDealersHand().getCard(table.getDeck().draw());
		
		table.getDealersHand().showHand();
		System.out.println("\n\nend of Line");
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
