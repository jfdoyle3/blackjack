package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.game.GameThree;

public class Dealer {

	private static int sum = 0;
	private static List<Card> hand = new ArrayList<>();
	private static List<Card> dealer = new ArrayList<>();

	public  static void dealCards() {
		Deck deck = new Deck();
		deck.shuffle();
		for (int idx = 0; idx < 4; idx++) {
			Card topCard = deck.draw();
			int cardInt=topCard.getValue();
			if (idx % 2 == 0) {
				hand.add(topCard);
			} else {  
				dealer.add(topCard);
				
			}
		}
		System.out.println("Hand");
		for (Card card : hand) {
			int sum=addHand(card);
			System.out.println(card.toString()+"       "+sum);
			
		}
		
		System.out.println("Dealer");
		for (Card card : dealer) {
			int sum2=addHand(card);
			System.out.println(card.toString()+"       "+sum2);
		}
		
	}
	public static  int addHand(Card card) {
			
			int i=card.getValue();
			if (i > 10) {
				i = 10;
			}
			sum += i;
		return sum;
	}
}
