package com.careerdevs.game;



import java.util.ArrayList;
import java.util.List;

import com.careerdevs.objects.Card;
import com.careerdevs.objects.Deck;

public class GameThree {
	
	public static void playGame() {
		List<Integer> hand=new ArrayList<>();
		Deck deck=new Deck();
		
		deck.shuffle();
		System.out.println(deck.toString());
		
		Card card=deck.draw();
		Card card2=deck.draw();
		
		hand.add(card.getValue());
	    hand.add(card2.getValue());
		 System.out.println();
		 System.out.println();
		 
		   int sum = 0;
		    for (int i: hand) {
		        sum += i;
		    }
		    
		    System.out.println(sum);	
	}
	
		
	
	
}
