package com.careerdevs.objects;

import java.util.List;

import com.careerdevs.ui.Console;
import com.careerdevs.ui.Input;

public class Moves {

	private static int stands;

	public static int playerPlay(Deck deck, List<Card> playerHand, int chips) {
		boolean play = true;
		do {

			Console.displayHand(playerHand);
			int handTotal = Dealer.addUpCards(playerHand);
			if (handTotal > 21) {
				Console.bust(handTotal);
				if (chips == 0) {
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
		return stands;

	}

	public static int dealerPlay(Deck deck, List<Card> playerHand) {
		boolean play = true;
		do {

			Console.displayHand(playerHand);
			int handTotal = Dealer.addUpCards(playerHand);
			if (handTotal > 21) {
				Console.bust(handTotal);
				break;
			}
		
		//	System.out.println();
			if (handTotal < 17) {
				Dealer.hit(deck, playerHand);
			}
			if (handTotal > 17) {
				int stands = Dealer.stand(playerHand);
				Console.stand(stands);
				
				play = false;
				
			}

		} while (play);

		return stands;

	}
}
