package com.careerdevs.objects;

import java.util.List;

import com.careerdevs.cards.Card;
import com.careerdevs.cards.Deck;
import com.careerdevs.ui.Console;
import com.careerdevs.ui.ErrorConsole;
import com.careerdevs.ui.Input;

public class GameRound {

	
	private static int stands;

	// Maybe break this up
	public static int round(String name, Deck deck, List<Card> playerHand) {
		boolean play = true;
		do {
			Console.displayHand(playerHand);
			int handTotal = 0;
			if (handTotal > 21) {
				Console.bust(name, handTotal);
				stands = 0;
				break;
			}
			
			if (handTotal > 21) {
				Console.bust(name, handTotal);
				stands = 0;
				break;
			}
			if (name.equals("Player")) {
				Console.consoleHit(handTotal);
				String choice = Input.inputString("hit or Stand");
				if (choice.toLowerCase().equals("h")) {
				//	Dealer.hit(deck, playerHand);
				}
				if (choice.toLowerCase().equals("s")) {
				//	stands = Dealer.stand(playerHand);
					Console.stand("Player", stands);
					play = false;
				}

			}
			if (name.equals("Dealer")) {
				 System.out.println();
				if (handTotal < 17) {
				//	Dealer.hit(deck, playerHand);
				}
				if (handTotal > 17) {
				//	stands = Dealer.stand(playerHand);
					Console.stand(name, stands);
					play = false;
				}
			}
		} while (play);

		return stands;
	}

//	private static int findAce(List<Card> playerHand) {
//	//	boolean ace = Card.getAce(playerHand);
////		int handTotal = Dealer.addUpCards(playerHand);
////		if (ace && handTotal <=21) {
////			handTotal = Dealer.addUpCards(playerHand) + 10;
////		}
//		
//		return handTotal;
//	}

	public static void endRound(int dealerHand, int playerHand, int chips) {
			
		if (dealerHand > playerHand) {
			Console.win("Dealer");
		} 
		if(dealerHand < playerHand) {
			Console.win("Player");
		//	System.out.printf("\nPlayers wins--> %d ", Player.wins(chips));
		}
		if (dealerHand == playerHand) {
			Console.push();

		}

//		public static int wins(int chipsBet) {
//			int chipsWon = chipsBet * 2;
//			return chipsWon;
//
//		}
	}
		public static int placeBet(int chips) {
			boolean betPlaced = false;
			Console.bet(chips);
			do {
				int betAmount = Input.inputNumber("Bet?");
				if (betAmount > chips) {
					betPlaced = false;
					ErrorConsole.errorBet(chips);
				} else {
					betPlaced = true;
					chips -= betAmount;
				}
			} while (!betPlaced);
			return setChips(chips);
		}
		private static int setChips(int chips) {
			return chips;
		}
	}

