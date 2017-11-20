/**
 * Created by mark on 19/11/2017.
 */
import javax.swing.*;
import java.util.Random;

/**
 * Created by mark on 19/11/2017.
 */
public class Deck {
    private Card[] deck = new Card[52];

    public Card[] getDeck() {return deck;}

    public void setDeck(Card[] deck) {this.deck = deck;}


   // public String toString() {
   //     return "Deck{" +
    //            "Deck=" + +
    //            '}';
    //}

    public Deck(Card[] deck) {
        setDeck(deck);
    }

// Learned how to shuffle an array on stack overflow//
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

    public void display() {
        JTextArea Roster = new JTextArea();
        for (int i = 0; i <deck.length; i++)
        {
            Roster.append(deck[i].toString()+"\n");
        }
        JOptionPane.showMessageDialog(null, Roster);
    }

    public Card getCard(int CardPosition){
        return deck[CardPosition];



    }



}
