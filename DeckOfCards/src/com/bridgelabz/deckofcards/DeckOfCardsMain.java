package com.bridgelabz.deckofcards;

import java.util.Scanner;

public class DeckOfCardsMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DeckOfCardServices deckOfCardService = new DeckOfCardsImpl();
		DeckOfCards deckOfCards = new DeckOfCards();
		int noOfPlayer;
		while(true) 
		{
			System.out.print("Enter number of player (player should be in range of 1 to 5):: ");
			noOfPlayer = scanner.nextInt();
			if(noOfPlayer > 0 && noOfPlayer <= 5)
				break;
			else
				System.out.println("Please enter number from a given range");
		}
		scanner.close();
		deckOfCards.setNoOdPlayers(noOfPlayer);
		
		for (int playerNumber = 1; playerNumber <= deckOfCards.getNoOdPlayers(); playerNumber++) {
			deckOfCardService.allocatecards(playerNumber);
			System.out.println("Player "  + playerNumber + "'s cards:");
			//prints cards of respective player
			deckOfCardService.print(playerNumber);
		}
	}

}
