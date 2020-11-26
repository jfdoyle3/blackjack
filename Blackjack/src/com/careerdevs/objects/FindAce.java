package com.careerdevs.objects;

import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

import com.careerdevs.ui.Console;

public class FindAce {
	
	public static void changeAceValue(List<Card> hand) {
		
		System.out.println("<-- Detect Ace -->");
		Console.displayHand(hand);
		System.out.println();
		int min = hand.stream().mapToInt(card -> card.getValue()).min().getAsInt();
		
		if(min==1) {
			System.out.println("Ace Found");
		} else {
			System.out.println("No Ace");
		}
		
		
		
		
		
		
	}

}
