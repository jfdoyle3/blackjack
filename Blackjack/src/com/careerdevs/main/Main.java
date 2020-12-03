package com.careerdevs.main;

import java.util.List;

import com.careerdevs.objects.Card;
import com.careerdevs.objects.Deck;
import com.careerdevs.objects.Hand;
import com.careerdevs.ui.Console;

public class Main {

	public static void main(String[] args) {

	//	Game.playGame();
		
		Deck deck = new Deck();
		deck.shuffle();
		Hand hand=new Hand();
		hand.dealCards(deck, 2);
		hand.showHand();
		System.out.println("\ntotal: "+hand.addUpCards());
		
		System.out.println("\nend of Line");
	}

}
