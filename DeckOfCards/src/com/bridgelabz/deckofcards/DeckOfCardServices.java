package com.bridgelabz.deckofcards;

public interface DeckOfCardServices {
	
	public void allocatecards(int noOfPlayers);
	void allotOneCard(int noOfPlayers);
	void print(int noOfPlayers);
	String getRank(int rankNumber);
	String getSuit(int suitNumber);
}
