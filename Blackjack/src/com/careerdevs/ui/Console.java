package com.careerdevs.ui;

import com.careerdevs.objects.Card;


public class Console {

	public static void displayCard(Card card) {
		System.out.print(card.toString()+" ");
	}
	
	public static void horzLine() {
		System.out.println("\n-----------------------------------------------------------------------------\n");
	}

	
	
}
