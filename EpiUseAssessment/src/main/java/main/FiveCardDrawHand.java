package main;


/**
* The FiveCardDrawHand class to draw a 5 hand card .
*
* @author  Sello Mamorobela
* @version 1.5
* @since   2021-01-15 
 */

import java.util.ArrayList;
import java.util.List;
import main.Hand;

public class FiveCardDrawHand implements Hand {

    private final List<Card> cards;

    public FiveCardDrawHand() {
        cards = new ArrayList<Card>();
    }


    public void addCard(Card card) throws HandleException{
        if (cards.size() == 5) {
            throw new HandleException("A maximum of 5 cards may be assigned to a hand");
        }
        cards.add(card);
    }

 
    public HandStrength getHandStrength() {
        if (isStraightFlush()) {
            return HandStrength.STRAIGHT_FLUSH;
        }
        if (isFourOfKind()) {
            return HandStrength.FOUR_OF_A_KIND;
        }
        if (isFullHouse()) {
            return HandStrength.FULL_HOUSE;
        }
        if (isFlush()) {
            return HandStrength.FLUSH;
        }
        if (isStraight()) {
            return HandStrength.STRAIGHT;
        }
        if (isThreeOfKind()) {
            return HandStrength.THREE_OF_A_KIND;
        }
        if (isTwoPair()) {
            return HandStrength.TWO_PAIR;
        }
        if (isOnePair()) {
            return HandStrength.ONE_PAIR;
        }
        return HandStrength.HIGH_CARD;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Card card : cards) {
            stringBuilder.append(card.toString());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    private boolean isStraightFlush() {
        return isFlush() && isStraight();
    }

    private boolean isFourOfKind() {
        int[] countRanks = countRanks();
        for (int countRank : countRanks) {
            if (countRank == 4) {
                return true;
            }
        }
        return false;
    }

    private boolean isFullHouse() {
        int pairCount = 0;
        int threeOfKindCount = 0;
        int[] countRanks = countRanks();
        for (int countRank : countRanks) {
            if (countRank == 2) {
                pairCount++;
            }
            if (countRank == 3) {
                threeOfKindCount++;
            }
        }
        return (threeOfKindCount == 1) && (pairCount == 1);
    }

    private boolean isFlush() {
        int[] countSuits = countSuits();
        for (int countSuit : countSuits) {
            if (countSuit == 5) {
                return true;
            }
        }
        return false;
    }

    private boolean isStraight() {
        int seriesLength = 0;
        int[] countRanks = countRanks();
        for (int countRank : countRanks) {
            if (countRank == 1) {
                seriesLength++;
            } else {
                seriesLength = 0;
            }
            if (seriesLength == 5) {
                return true;
            }
        }
        return false;
    }

    private boolean isThreeOfKind() {
        int[] countRanks = countRanks();
        for (int countRank : countRanks) {
            if (countRank == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean isTwoPair() {
        int pairCount = 0;
        int[] countRanks = countRanks();
        for (int countRank : countRanks) {
            if (countRank == 2) {
                pairCount++;
            }
        }
        return pairCount == 2;
    }

    private boolean isOnePair() {
        int[] countRanks = countRanks();
        for (int countRank : countRanks) {
            if (countRank == 2) {
                return true;
            }
        }
        return false;
    }

    private int[] countSuits() {
        int[] suitCount = new int[4];
        for (Card card : cards) {
            if (card.getSuit() == Suit.HEART) {
                suitCount[0]++;
            }
            if (card.getSuit() == Suit.SPADE) {
                suitCount[1]++;
            }
            if (card.getSuit() == Suit.DIAMOND) {
                suitCount[2]++;
            }
            if (card.getSuit() == Suit.CLUB) {
                suitCount[3]++;
            }
        }
        return suitCount;
    }

    private int[] countRanks() {
        int[] rankCount = new int[13];
        for (Card card : cards) {
            if (card.getRank() == Rank.ACE) {
                rankCount[0]++;
            }
            if (card.getRank() == Rank.KING) {
                rankCount[1]++;
            }
            if (card.getRank() == Rank.QUEEN) {
                rankCount[2]++;
            }
            if (card.getRank() == Rank.JACK) {
                rankCount[3]++;
            }
            if (card.getRank() == Rank.TEN) {
                rankCount[4]++;
            }
            if (card.getRank() == Rank.NINE) {
                rankCount[5]++;
            }
            if (card.getRank() == Rank.EIGHT) {
                rankCount[6]++;
            }
            if (card.getRank() == Rank.SEVEN) {
                rankCount[7]++;
            }
            if (card.getRank() == Rank.SIX) {
                rankCount[8]++;
            }
            if (card.getRank() == Rank.FIVE) {
                rankCount[9]++;
            }
            if (card.getRank() == Rank.FOUR) {
                rankCount[10]++;
            }
            if (card.getRank() == Rank.THREE) {
                rankCount[11]++;
            }
            if (card.getRank() == Rank.TWO) {
                rankCount[12]++;
            }
        }
        return rankCount;
    }
}
