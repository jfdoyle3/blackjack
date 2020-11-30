package com.careerdevs.game;

import java.awt.Desktop.Action;
import java.util.List;

import com.careerdevs.objects.Actions;
import com.careerdevs.objects.Card;
import com.careerdevs.objects.Dealer;
import com.careerdevs.objects.Deck;
import com.careerdevs.objects.testFindAce;
import com.careerdevs.objects.GameRound;
import com.careerdevs.objects.Player;
import com.careerdevs.ui.Console;
import com.careerdevs.ui.Input;

public class Game {

	public static void playGame() {
		Deck deck = new Deck();
		deck.shuffle();
//		String playerName = "Player";
//		Player player = new Player(2);
		Dealer dealer = new Dealer();
//		Console.welcomePlayer(playerName, player.getChips());
//		Console.horzLine();
//		int chips = Player.placeBet(player.getChips());

		// TODO: Add to Interface
//		List<Card> playerHand = player.dealCards(deck, 2);
		List<Card> dealerHand = dealer.dealCards(deck, 2);
		//for(Card cards : dealerHand)
		//Console.displayCard(cards);
		// FindAce.changeAceValue(deck,playerHand);

		// TODO: Add to Interface
		int dealerHandTable = GameRound.round("Dealer", deck, dealerHand);
//		int playerHandTable = GameRound.round(playerName, deck, playerHand);
//
//		GameRound.endRound(dealerHandTable, playerHandTable, chips);

		// maybe move this statement to above method.
//		if (chips == 0) {
//			Console.gameOver();
//		}

	}

}
