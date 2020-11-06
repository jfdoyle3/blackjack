package com.careerdevs.game;

import com.careerdevs.objects.Card;

public class Game {
	
	public static void playGame() {
		
		for(int i=0; i<10; i++) {
			Card card=new Card();
		
		System.out.println(card.getValue()+card.SuitSym());
		}
	}

}
