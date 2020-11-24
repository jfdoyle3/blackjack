package com.careerdevs.game;

import java.awt.Desktop.Action;
import java.util.List;

import com.careerdevs.objects.Actions;
import com.careerdevs.objects.Card;
import com.careerdevs.objects.Dealer;
import com.careerdevs.objects.Deck;
import com.careerdevs.objects.GameRound;
import com.careerdevs.objects.Player;
import com.careerdevs.ui.Console;
import com.careerdevs.ui.Input;

public class Game {

	public static void playGame() {
		Deck deck = new Deck();
		deck.shuffle();
		String playerName = "Player";
		Player player = new Player(2);
		Dealer dealer = new Dealer();
		// Console.welcomePlayer(playerName, player.getChips());
		// Console.horzLine();
		int chips = Player.placeBet(player.getChips());
//		if (chips == 0) {
//			Console.gameOver();
//		}
		// TODO: Add to Interface
		List<Card> playerHand = player.dealCards(deck, 2);
		List<Card> dealerHand = dealer.dealCards(deck, 2);
		
		// TODO: Add to Interface
		int dealerHandTable = GameRound.round("Dealer", deck, dealerHand);
		int playerHandTable = GameRound.round(playerName, deck, playerHand);

		System.out.printf("player --> %d", playerHandTable);
		System.out.printf("dealer --> %d", dealerHandTable);
		
		
		if (dealerHandTable > playerHandTable) {
			System.out.printf("Dealer Wins with --> %d\n", dealerHandTable);
		} else {
			System.out.printf("Player Wins with --> %d\n", playerHandTable);
			System.out.printf("\nPlayers wins--> %d ", Player.wins(chips));
		}
		if (dealerHandTable == playerHandTable) {
			System.out.println("Push");

		}

	}

}
