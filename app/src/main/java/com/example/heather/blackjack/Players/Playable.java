package com.example.heather.blackjack.Players;

import com.example.heather.blackjack.Cards.Card;

import java.util.ArrayList;

/**
 * Created by heather on 22/09/2017.
 */

public interface Playable {

    public ArrayList<Card> getHand();

    public void receiveCard(Card card);

    public int getScore();



}
