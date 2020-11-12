package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	// private List<myCard> Deck = new ArrayList<myCard>();
    private final static String[] SUITS = {"♠","♥", "♧", "♦"};
    private final static int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (var suit : SUITS)  {
           for (var value : VALUES) {
               cards.add(new Card(value, suit));
        	//System.out.println(suit);
            }
        }
    }

//	public Deck() {
//		for (int face = 1; face <= 13; face++) {
//			for (int suits = 0; suits <= 3; suits++) {
//				this.Deck.add(new myCard(face, suits));
//			}
//		}
//	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

//	public String drawCard(int card) {
//		String dealtCard = this.myDeck.get(card).getValue() + this.myDeck.get(card).getSuitSym();
//		return dealtCard;
//	}


    public Card draw() {
    	return cards.remove(cards.size() - 1);
    	}

	@Override
	public String toString() {
		return "Deck [cards=" + cards.toString() + "]";
	}

	
    
    
}
