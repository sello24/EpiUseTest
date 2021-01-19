package main;

/**
* The Suit enumeration class to represent a Suit .
*
* @author  Sello Mamorobela
* @version 1.5
* @since   2021-01-15 
 */


public enum Suit {
	
	/**
	 * The unicode characters next to the enum value may be used as the constructor,
	 * but will only work if the console and JVM file encoding is set to UTF-8.
	 * This does not work well on Windows.
	 */
	
    HEART("H"), //("\u2764")
    SPADE("S"), //("\u2660")
    DIAMOND("D"), //("\u2666")
    CLUB("C"); //("\u2663");

    private final String unicodeCharacter;

    private Suit(String unicodeCharacter) {
        this.unicodeCharacter = unicodeCharacter;
    }

    public String getUnicodeCharacter() {
        return unicodeCharacter;
    }
}
