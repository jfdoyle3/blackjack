package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.cards.Card;
import com.careerdevs.cards.Deck;

public class Dealer implements Actor {
	static String NAME="Dealer";
	static int DECISION=17;
	static int HIT=1;
	static int STAND=2;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}

	@Override
	public int getBet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAction(int score) {
		// TODO Auto-generated method stub
		return score<DECISION ? HIT:STAND;
	}
	

}
