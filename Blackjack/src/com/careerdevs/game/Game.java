package com.careerdevs.game;

import java.awt.Desktop.Action;
import java.util.List;

import com.careerdevs.objects.Actions;
import com.careerdevs.objects.Card;
import com.careerdevs.objects.Dealer;
import com.careerdevs.objects.Deck;
import com.careerdevs.objects.Moves;
import com.careerdevs.objects.Player;
import com.careerdevs.ui.Console;
import com.careerdevs.ui.Input;

public class Game {

	public static void playGame() {
		Deck deck = new Deck();
		deck.shuffle();

		Console.askPlayerName();
		String playerName = Input.inputString();
		Player player = new Player(playerName, 2);
		Dealer dealer=new Dealer();
		Console.welcomePlayer(player.getPlayerName(), player.getChips());
		Console.horzLine();
		int chips = Player.placeBet(player.getChips());
		if(chips==0) {
		Console.gameOver();
		}
		List<Card> playerHand =  player.dealCards(deck, 2);
		//Actions dealerHand=(Actions) dealer.dealCards(deck,2);
		
		System.out.println("Player");

		int playerHandTable=Moves.dealerPlay(deck, playerHand);
		System.out.println("player:  -->  "+playerHandTable);
		
	}

}
