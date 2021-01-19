package main;

/**
* The HandStrenth enumeration class to represent the hand strength.
*
* @author  Sello Mamorobela
* @version 1.5
* @since   2021-01-15 
 */


public enum HandStrength {

    STRAIGHT_FLUSH("Straight Flush"),
    FOUR_OF_A_KIND("Four of a Kind"),
    FULL_HOUSE("Full House"),
    FLUSH("Flush"),
    STRAIGHT("Straight"),
    THREE_OF_A_KIND("Three of a Kind"),
    TWO_PAIR("Two Pair"),
    ONE_PAIR("One Pair"),
    HIGH_CARD("High Card");

    private final String displayString;

    private HandStrength(String displayString) {
        this.displayString = displayString;
    }

    public String getDisplayString() {
        return displayString;
    }
}
