package com.example.heather.blackjack;

import java.util.ArrayList;

/**
 * Created by heather on 22/09/2017.
 */

public class BlackJackPlayer implements Playable {
    private String name;
    private ArrayList<Card> hand;
    
    public BlackJackPlayer(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }


    
    public void receiveCard(Card card) {
        hand.add(card);
    }

    public int getScore() {
        int counter = 0;

        for ( Card card : hand ) {
            counter += card.cardValueForGame();
        }
        return counter;
    }


}