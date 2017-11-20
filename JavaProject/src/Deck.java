/**
 * Created by mark on 19/11/2017.
 */
import javax.swing.*;
import java.util.Random;

/**
 * Created by mark on 19/11/2017.
 */
public class Deck {
    private static Card[] deck = new Card[52];

    public Card[] getDeck() {return deck;}

    public void setDeck(Card[] deck) {deck = deck;}


    public String toString() {
        return "Deck{" +
                "Deck=" + +
                '}';
    }

    public Deck(Card[] Deck) {
        setDeck(deck);
    }


    public void shuffle() {
        int length = deck.length;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int swap = i + random.nextInt(length - i);
            swapCards(i, swap);
        }
    }

    public void swapCards(int i, int swap){
        Card temp = deck[i];
        deck[i] = deck[swap];
        deck[swap] = temp;
    }

    public static void display() {
        JTextArea Roster = new JTextArea();
        for (int i = 0; i <deck.length; i++)
        {
            Roster.append(deck[i].toString());
        }
        JOptionPane.showMessageDialog(null, Roster);
    }

    public Card getCard(int CardPosition){
        return deck[CardPosition];



    }



}
