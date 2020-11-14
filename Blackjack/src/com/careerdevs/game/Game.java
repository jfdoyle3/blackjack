package com.careerdevs.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.careerdevs.objects.Dealer;
import com.careerdevs.objects.Deck;
import com.careerdevs.objects.Player;
import com.careerdevs.ui.Console;
import com.careerdevs.ui.Input;

public class Game {

	public static void playGame() {
	Console.askPlayerName();
	String playerName=Input.inputString();
	Player player=new Player(playerName, 1);
	Console.welcomePlayer(player.getPlayerName(),player.getChips());
	Console.horzLine();
	int bet=Player.placeBet(player.getChips());
	Dealer.dealCards();
	
	

	}

}
