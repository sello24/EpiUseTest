package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws HandleException {


      logger.info("Shuffling ... Shuffling ... Shuffling");


        // Create a standard deck of 52 cards
        List<Card> deck = createDeck();

        // Shuffle the deck
        Collections.shuffle(deck);

        // Deal a hand of 5 cards to the player
        FiveCardDrawHand playerHand = dealHand(deck, 5);

        // Evaluate the player's hand
        evaluateHand(playerHand);
    }


    private static void evaluateHand(FiveCardDrawHand hand) {
        // You can implement poker hand evaluation logic here
        // For simplicity, let's just print the cards in the hand for now
        logger.info("Your Hand: " + hand.toString());
        logger.info("You have: " + hand.getHandStrength().toString());
    }


    private static FiveCardDrawHand dealHand(List<Card> deck, int n) throws HandleException {
        FiveCardDrawHand hand = new FiveCardDrawHand();
        for (int i = 0; i < n; i++) {

            hand.addCard(deck.removeFirst());
        }
        return hand;
    }

    private static List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }

        return deck;
    }




}
