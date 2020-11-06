package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
   
    
        private List<Card> deck = new ArrayList<Card>();
        private List<List<Card>> hands = new ArrayList<List<Card>>();
        private List<Card> shuffled = new ArrayList<Card>();
        
        public Deck()
        {
            for (int face = 2; face <= 14; face++)
            {
                for (int suits = 0; suits <= 3; suits++)
                {
                   Card card = new Card(face, suits);
                    this.deck.add(card);
                }
            }
        }
        public Deck (int minCard, int maxCard)
        {
            for (int face = minCard; face <=maxCard; face++)
            {
                for (int suits = 0; suits <= 3; suits++)
                {
                    Card card = new Card(face, suits);
                    this.deck.add(card);
                }
            }
        }
        //public void Shuffle()
//        public List<Card> Shuffle()
//        {
//            Random rnd = new Random();
//            IOrderedEnumerable<Card> shuffled = deck.OrderBy(Card -> rnd.Next());
//            shuffled.GetEnumerator();
//           // shuffled.ToList<Card>();
//              return shuffled.ToList<Card>();
//        }
}
