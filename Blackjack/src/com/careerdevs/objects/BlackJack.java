package com.careerdevs.objects;

public class BlackJack {
	
	private static Table table=new Table();
	
	public static void play() {
		
		table.getDeck().shuffle();
		table.getPlayersHand().getCard(table.getDeck().draw());
		table.getPlayersHand().getCard(table.getDeck().draw());
		table.getPlayersHand().showHand();
		System.out.println();
		System.out.println();
		table.getDealersHand().getCard(table.getDeck().draw());
		table.getDealersHand().getCard(table.getDeck().draw());
		table.getDealersHand().getCard(table.getDeck().draw());
		table.getDealersHand().showHand();
		
		System.out.println("\nend of Line");
	}
	
	
}
