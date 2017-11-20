/**
 * Created by mark on 19/11/2017.
 */
import javax.swing.*;
import java.util.Random;

/**
 * Created by mark on 19/11/2017.
 */
public class Deck {
    private static Card[] Deck = new Card[52];

    public Card[] getDeck() {return Deck;}

    public void setDeck(Card[] deck) {Deck = deck;}


    public String toString() {
        return "Deck{" +
                "Deck=" + +
                '}';
    }

    public Deck(Card[] Deck) {
        Deck = Deck;
    }


    public void shuffle() {
        int length = Deck.length;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int swap = i + random.nextInt(length - i);
            swapCards(i, swap);
        }
    }

    public void swapCards(int i, int swap){
        Card temp = Deck[i];
        Deck[i] = Deck[swap];
        Deck[swap] = temp;
    }

    public static void display() {
        JTextArea Roster = new JTextArea();
        Roster.append("Deck:\n\n");
        for (int i = 0; i <= 51; i++) {
            Roster.append(Deck[i].toString() + "\n\n");
        }
        JOptionPane.showMessageDialog(null, Roster);
    }

    public Card getCard(int CardPosition){
        return Deck[CardPosition];



    }
    public removeCard(int )


}
