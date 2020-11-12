package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.game.GameThree;

public class Dealer {

	private static List<Card> hand = new ArrayList<>();
	private static List<Card> dealer = new ArrayList<>();

	public  static void dealCards() {
		Deck deck = new Deck();
		deck.shuffle();
		for (int idx = 0; idx < 4; idx++) {
			Card topCard = deck.draw();
			if (idx % 2 == 0) {
				hand.add(topCard);
			} else {  
				dealer.add(topCard);
			}
		}
		System.out.println("Hand");
		for (Card card : hand) {
			
			
			System.out.println(card.toString());
		}
		
		System.out.println("Dealer");
		for (Card card : dealer) {
			System.out.println(card.toString());
		}
		
	}
}
