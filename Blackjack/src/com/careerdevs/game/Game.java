package com.careerdevs.game;

import com.careerdevs.actors.Actor;
import com.careerdevs.cards.Card;
import com.careerdevs.cards.Hand;
import com.careerdevs.objects.Table;
import com.careerdevs.ui.Console;
import com.careerdevs.ui.ErrorConsole;

public class Game {

	private Table table = new Table();
	private boolean choiceResult;

	public void playGame() {
		table.getDeck().shuffle();

		int bet = table.getPlayersHand().getBet();
		Console.horzLine();
		Console.placedBet(table.getPlayersHand(), bet);
		Console.horzLine();
	//	do {
		dealCards();
		playersTurn();
		//dealersTurn();
	//	}while();

		// TODO: Decide winner
		System.out.println(table.getPlayersHand().addUpCards());
		// TODO: handle what happens to bet
		// TODO: check players wallet to continue or end.
		System.out.println("\nend of Line");
	}

	private void playersTurn() {
		showTable(table.getDealersHand(), table.getPlayersHand());
		Actor player = table.getPlayersHand().getActor();
		int choice = player.getAction(table.getPlayersHand().addUpCards());
		choiceResult = choice(table.getPlayersHand(), choice);
	}

	private void dealersTurn() {
		showTable(table.getDealersHand(), table.getPlayersHand());
		Actor dealer = table.getDealersHand().getActor();
		int choice = dealer.getAction(table.getDealersHand().addUpCards());
		choiceResult = choice(table.getDealersHand(), choice);
	}

	public void dealCards() {
		for (int idx = 0; idx < 4; idx++) {
			if (idx % 2 == 0) {
				table.getPlayersHand().getCard(table.getDeck().draw());
			} else {
				table.getDealersHand().getCard(table.getDeck().draw());
			}
		}
	}

	public int getChoice(Hand hand) {
		return hand.getActor().getAction(hand.addUpCards());
	}

	public boolean choice(Hand hand, int action) {
		switch (action) {
		case 1:
			Card card = table.getDeck().draw();
			Console.hit(hand, card);
			hand.getCard(card);
			if (hand.addUpCards() > 21) {
				hand.showHand();
				Console.bust(hand.getName(), hand.addUpCards());
				return true;
			}
			return false;
		case 2:
			Console.stand(hand.getName(), hand.addUpCards());
			return true;
		default:
			ErrorConsole.errorChoice();
			return true;
		}
	}

	public static void endRound(int dealerHand, int playerHand, int chips) {

		if (dealerHand > playerHand) {
			// cash - bet;
			Console.win("Dealer");
		}
		if (dealerHand < playerHand) {
			Console.win("Player");
			// System.out.printf("\nPlayers wins--> %d ", Player.wins(chips));
		}
		if (dealerHand == playerHand) {
			Console.push();

		}
	}

	private void showTable(Hand dealerHand, Hand playerHand) {
		Console.horzLine();
		System.out.print(dealerHand.getName() + " -> ");
		dealerHand.showHand();
		System.out.println(" Hand total: " + dealerHand.addUpCards());
		Console.horzLine();
		System.out.print(playerHand.getName() + " -> ");
		playerHand.showHand();
		System.out.println(" Hand total: " + playerHand.addUpCards());
	}
}
