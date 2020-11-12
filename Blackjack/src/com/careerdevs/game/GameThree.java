package com.careerdevs.game;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.objects.Card;
import com.careerdevs.objects.Dealer;
import com.careerdevs.objects.Deck;
import com.careerdevs.objects.Player;
import com.careerdevs.ui.Console;
import com.careerdevs.ui.Input;

public class GameThree {


	public static void playGame() {
		
		Console.askPlayName();
		String playerName=Input.inputString();
		Player player=new Player(playerName, 100);
		Console.welcomePlayer(player.getPlayerName(), player.getWallet());
		List<Integer> hand = new ArrayList<>();
		Deck deck = new Deck();

		deck.shuffle();
		System.out.println(deck.toString());

		Dealer.dealCards();

	}
}