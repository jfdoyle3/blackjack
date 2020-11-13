package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;


public class Dealer {

	private static int sum = 0;
	private static List<Card> hand = new ArrayList<>();
	
	private static List<Card> dealer = new ArrayList<>();

	public  static void dealCards() {
		Deck deck = new Deck();
		
		deck.shuffle();
		
		for (int idx = 0; idx < 4; idx++) {
			Card topCard = deck.draw();
			if (idx % 2 == 0) {
				hand.add(topCard);  //add to Play hand List
			} else {  
				dealer.add(topCard);  // add to Dealer  List
				
			}
		}

		System.out.println("Hand");
		
		for (Card card : hand) {
			System.out.println(card.toString());
		}
		
		int handTotal=hand.stream().mapToInt(card -> card.getValue()).sum();
		
		System.out.println("hand "+handTotal);

		System.out.println("Dealer");
		
		
		for (Card card : dealer) {
			System.out.println(card.toString());
		}
		int dealerTotal=dealer.stream().mapToInt(card -> card.getValue()).sum();
		
		System.out.println("Deal "+dealerTotal);
	
	}
	

}
