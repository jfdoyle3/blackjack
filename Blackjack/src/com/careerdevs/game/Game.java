package com.careerdevs.game;

import java.util.List;

import com.careerdevs.objects.Card;
import com.careerdevs.objects.Dealer;
import com.careerdevs.objects.Deck;
import com.careerdevs.objects.Player;
import com.careerdevs.ui.Console;
import com.careerdevs.ui.Input;

public class Game {

	public static void playGame() {
		Deck deck = new Deck();
		deck.shuffle();

		Console.askPlayerName();
		String playerName = Input.inputString();
		Player player = new Player(playerName, 2);
		Console.welcomePlayer(player.getPlayerName(), player.getChips());
		Console.horzLine();
		int chips = Player.placeBet(player.getChips());
		if(chips==0) {
		Console.gameOver();
		}
		List<Card> playerHand = Dealer.dealCards(deck, 2);
		System.out.println("Player");

		boolean play = true;
		do {
			
			Console.displayHand(playerHand);
			int handTotal = Dealer.addUpCards(playerHand);
			if (handTotal > 21) {
				Console.bust(handTotal);
				if(chips==0) {
					Console.gameOver();
					}
				break;
			}
			Console.consoleHit(handTotal);
			
			String choice = Input.inputString();
			if (choice.toLowerCase().equals("h")) {
				Dealer.hit(deck, playerHand);
			}
			if (choice.toLowerCase().equals("s")) {
				int stands = Dealer.stand(playerHand);
				Console.stand(stands);
				play = false;
			}

		} while (play);
		
			
		
	}

}
