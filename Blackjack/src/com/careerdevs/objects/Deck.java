package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deck = new ArrayList<Card>();

	public Deck() {
		for (int face = 2; face <= 14; face++) {
			for (int suits = 0; suits <= 3; suits++) {
				Card card = new Card(face, suits);
				this.deck.add(card);
			}
		}
	}

	public List<Card> shuffleDeck() {
		Collections.shuffle(this.deck);
		return this.deck;
	}

	public String drawCard(int card) {
		String dealtCard = this.deck.get(card).getValue()+this.deck.get(card).SuitSym();
		return dealtCard;
	}

	public List<Card> getDeck() {
		return deck;
	}

}
