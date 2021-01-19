package main;

import main.Rank;
import main.Suit;

/**
* The Card class implements a Card that
* that is part of a Deck.
*
* @author  Sello Mamorobela
* @version 1.5
* @since   2021-01-15 
*/

public class Card {

    private Rank rank;
    private Suit suit;

    /**
     * private contructor to prevent invalid card from 
     * being instantiated
     */
    private Card() {
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
         return rank.getDisplayValue() + suit.getUnicodeCharacter();
    }

}
