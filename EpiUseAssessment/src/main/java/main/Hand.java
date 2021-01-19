package main;

import main.Card;
import main.HandleException;
import main.HandStrength;

/**
* The Hand Interface class.
*
* @author  Sello Mamorobela
* @version 1.5
* @since   2021-01-15 
 */

public interface Hand {

   public void addCard(Card card) throws HandleException;

   public HandStrength getHandStrength();

}
