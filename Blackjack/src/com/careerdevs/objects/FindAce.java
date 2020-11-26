package com.careerdevs.objects;

import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

import com.careerdevs.ui.Console;

public class FindAce {
	
	public static void changeAceValue(Deck deck,List<Card> hand) {
		
		System.out.println("<-- Detect Ace -->");
		Console.displayHand(hand);
		Dealer.hit(deck, hand);
		System.out.println();
		Console.displayHand(hand);
		boolean ace=Card.findAce(hand);
		int handTotal = Dealer.addUpCards(hand);
		System.out.println("\nhandTotal: "+handTotal);
		if (ace && handTotal>21) {
			 handTotal = Dealer.addUpCards(hand)+10;
		}
		System.out.println("\nNew handTotal: "+handTotal);
		
	
	}

}
