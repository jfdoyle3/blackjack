package com.careerdevs.objects;

import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

import com.careerdevs.ui.Console;

public class FindAce {
	// This method is to test and develop logic to change the Ace to be 1 or 11
	// based on the hand total
	// Have to figure out how to handle if multiple Aces are in the hand too.

	public static void changeAceValue(Deck deck, List<Card> hand) {

		Console.displayHand(hand);
		// Dealer.hit(deck, hand);
		// System.out.println();
		// Console.displayHand(hand);
		boolean ace = Card.findAce(hand);
		int handTotal = Dealer.addUpCards(hand);
		if (ace && handTotal < 21) {
			handTotal = Dealer.addUpCards(hand) + 10;
		} else {
			handTotal = Dealer.addUpCards(hand);
		}
		
	}

}
