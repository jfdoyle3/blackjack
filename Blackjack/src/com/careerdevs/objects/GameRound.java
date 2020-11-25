package com.careerdevs.objects;

import java.util.List;

import com.careerdevs.ui.Console;
import com.careerdevs.ui.Input;

public class GameRound {

	private static int stands;

	public static int round(String name, Deck deck, List<Card> playerHand) {
		boolean play = true;
		do {
			Console.displayHand(playerHand);
			int handTotal = Dealer.addUpCards(playerHand);
			if (handTotal > 21) {
				Console.bust(name, handTotal);
				stands = 0;
				break;
			}
			if (name.equals("Player")) {
				Console.consoleHit(handTotal);
				String choice = Input.inputString();
				if (choice.toLowerCase().equals("h")) {
					Dealer.hit(deck, playerHand);
				}
				if (choice.toLowerCase().equals("s")) {
					stands = Dealer.stand(playerHand);
					Console.stand("Player", stands);
					play = false;
				}

			}
			if (name.equals("Dealer")) {
				// System.out.println();
				if (handTotal < 17) {
					Dealer.hit(deck, playerHand);
				}
				if (handTotal > 17) {
					stands = Dealer.stand(playerHand);
					Console.stand(name, stands);
					play = false;
				}
			}
		} while (play);

		return stands;
	}
	
	public static void endRound(int dealerHand, int playerHand, int chips) {

		if (dealerHand > playerHand){
			System.out.printf("Dealer Wins with --> %d\n", dealerHand);
		} else {
			System.out.printf("Player Wins with --> %d\n", playerHand);
			System.out.printf("\nPlayers wins--> %d ", Player.wins(chips));
		}
		if (dealerHand == playerHand) {
			System.out.println("Push");

		}
	}
}
