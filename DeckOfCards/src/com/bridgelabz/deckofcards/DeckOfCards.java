package com.bridgelabz.deckofcards;

public class DeckOfCards {

	private int noOdPlayers;

	public DeckOfCards(int noOdPlayers) {
		super();
		this.noOdPlayers = noOdPlayers;
	}

	
	public DeckOfCards() {
		
	}


	public int getNoOdPlayers() {
		return noOdPlayers;
	}

	public void setNoOdPlayers(int noOdPlayers) {
		this.noOdPlayers = noOdPlayers;
	}

	@Override
	public String toString() {
		return "DeckOfCards [noOdPlayers=" + noOdPlayers + "]";
	}
	
	
}
