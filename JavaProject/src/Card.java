import javax.swing.*;

/**
 * Created by mark on 19/11/2017.
 */
public class Card {
    private int value;
    private String Suit;
    private String ValueAsString;
    private ImageIcon Image;

    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}
    public String getSuit() {return Suit;}
    public void setImage(ImageIcon image) { Image = image;}


    public void setSuit(String suit) {Suit = suit;}
    public String getValueAsString() {return ValueAsString;}
    public void setValueAsString(String valueAsString) {ValueAsString = valueAsString;}


    // For testing purposes, Change Later...
//    @Override
//    public String toString() {
//        return "Card{" +
//                "value=" + value +
//                ", Suit='" + Suit + '\'' +
//                ", ValueAsString='" + ValueAsString + '\'' +
//                '}';
//    }

    public Card(int value, String suit, String valueAsString,ImageIcon Image) {
        this.value = value;
        Suit = suit;
        ValueAsString = valueAsString;
        setImage(Image);

    }
    public Card(){
        setValue(0);
        setSuit("Unknown");
        setValueAsString("Unknown");
    }

    public String getImage(){
        return Image.toString();
    } // returns a string representation of an imageicon

    public String toString(){
        return value + " " + Suit + " " + ValueAsString + " " + Image;
    }	//returns a string representationn of a card
}

