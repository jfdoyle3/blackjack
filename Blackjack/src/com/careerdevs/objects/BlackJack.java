package com.careerdevs.objects;

import com.careerdevs.actors.Actor;
import com.careerdevs.cards.Card;
import com.careerdevs.ui.Console;

public class BlackJack {
	
	private  Table table=new Table();
	
	public  void play() {
		
		table.getDeck().shuffle();

		table.getDealersHand().getCard(table.getDeck().draw());
		table.getDealersHand().getCard(table.getDeck().draw());
	
		displayTable();
		
		Actor dealer=table.getDealersHand().getActor();
		int choice=dealer.getAction(table.getDealersHand().addUpCards());
		
		

		System.out.println("\nend of Line");
	}

	private void displayTable() {
		System.out.print(table.getDealersHand().getName() + " -> ");
		table.getDealersHand().showHand();
		System.out.println(" Hand total: " + table.getDealersHand().addUpCards());
	}
	
	
}
