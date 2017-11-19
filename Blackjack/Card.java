package Blackjack;
/**
 * Created by mark on 19/11/2017.
 */
public class Card {
    private int value;
    private String Suit;
    private String ValueAsString;

    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}
    public String getSuit() {return Suit;}

    public void setSuit(String suit) {Suit = suit;}
    public String getValueAsString() {return ValueAsString;}
    public void setValueAsString(String valueAsString) {ValueAsString = valueAsString;}

    // For testing purposes, Change Later...
    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", Suit='" + Suit + '\'' +
                ", ValueAsString='" + ValueAsString + '\'' +
                '}';
    }

    public Card(int value, String suit, String valueAsString) {
        this.value = value;
        Suit = suit;
        ValueAsString = valueAsString;
    }
    public Card(){
        setValue(0);
        setSuit("Unknown");
        setValueAsString("Unknown");
    }
}
