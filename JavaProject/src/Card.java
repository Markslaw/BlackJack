import javax.swing.*;

/**
 * Created by mark on 19/11/2017.
 */
public class Card {
    private int value; // The 4 arguments that create a card
    private String Suit;
    private String ValueAsString;
    private ImageIcon Image;

    public int getValue() {return value;} // getters and setters fo value
    public void setValue(int value) {this.value = value;}
    public String getSuit() {return Suit;} // getters and setters that were needed
    public void setImage(ImageIcon image) { Image = image;}


    public void setSuit(String suit) {Suit = suit;}
    public String getValueAsString() {return ValueAsString;}
    public void setValueAsString(String valueAsString) {ValueAsString = valueAsString;}


    // orginal toString method that didnt include an Image attribute
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
        setImage(Image); // 4 arguement constructor for object card

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

