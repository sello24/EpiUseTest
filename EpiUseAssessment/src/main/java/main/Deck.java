package main;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
* The Deck class for implementing a Deck along with all required Deck operations(shuffling, getting a number of cards etc).
*
* @author  Sello Mamorobela
* @version 1.5
* @since   2021-01-15 
 */


public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getNumberOfCards() {
        return cards.size();
    }

    public void shuffle() {
        List<Card> shuffledCards = new ArrayList<Card>();
        for (int i = 0; i < 52; i++) {
            Random random = new Random(new Date().getTime());
            int randomIndex = random.nextInt(getNumberOfCards());
            Card card = drawCard(randomIndex);
            shuffledCards.add(card);
        }
        cards = shuffledCards;
    }

    public Card dealCard() {
        int numberOfCards = getNumberOfCards();
        if (numberOfCards > 0) {
            return drawCard(numberOfCards - 1);
        }
        return null;
    }

    private Card drawCard(int index) {
        Card card = cards.get(index);
        cards.remove(index);
        return card;
    }
}
