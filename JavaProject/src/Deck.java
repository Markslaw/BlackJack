
import javax.swing.*;
import java.util.Random;

/**
 * Created by mark on 19/11/2017.
 */
public class Deck {
    private static Card[] deck = new Card[52];

    public Card[] getDeck() {return deck;}

    public void setDeck(Card[] deck) {this.deck = deck;}


    // public String toString() {
    //     return "Deck{" +
    //            "Deck=" + +
    //            '}';
    //}



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

    public static Card getCard(int CardPosition){
        return deck[CardPosition];
    }
    //  public removeCard(int CardDealt){
    //      deck[CardDealt]

    //  }
    public Deck() {
        int[] Values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        String[] ValuesAsSring = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
        int y = 0;
        int SuitCounter = 0;

        for (int i = 0; i <= 51; i++) {
            deck[i] = new Card();
            if (SuitCounter < 13) {
                // deck[i].setSuit("Hearts");
                // deck[i].setValue(Values[y]);
                // deck[i].setValueAsString(ValuesAsSring[y]);
                deck[i] = new Card(Values[y],"Diamonds",ValuesAsSring[y],new ImageIcon("Images//card"+(i+1)+".png"));
                /*ImageIcon icon4 = new ImageIcon("I:\\Software Development Year 2 Semester 1\\OOP2_2017\\images\\loser.png");
                JOptionPane.showMessageDialog(null,"Unlucky you missed too many shots, Better luck next time!","BasketBall Game", JOptionPane.PLAIN_MESSAGE,icon4);*/
            }
            if (SuitCounter >= 13 && SuitCounter < 26) {
                // deck[i].setSuit("Diamonds");
                // deck[i].setValue(Values[y]);
                // deck[i].setValueAsString(ValuesAsSring[y]);
                deck[i] = new Card(Values[y],"Hearts",ValuesAsSring[y],new ImageIcon("Images//card"+(i+1)+".png"));

            }
            if (SuitCounter >= 26 && SuitCounter < 39) {
                // deck[i].setSuit("Clubs");
                // deck[i].setValue(Values[y]);
                // deck[i].setValueAsString(ValuesAsSring[y]);
                deck[i] = new Card(Values[y],"Clubs",ValuesAsSring[y],new ImageIcon("Images//card"+(i+1)+".png"));
            }
            if (SuitCounter >= 39 && SuitCounter < 52) {
                //  deck[i].setSuit("Spades");
                //  deck[i].setValue(Values[y]);
                //  deck[i].setValueAsString(ValuesAsSring[y]);
                deck[i] = new Card(Values[y],"Clubs",ValuesAsSring[y],new ImageIcon("Images//card"+(i+1)+".png"));

            }
            SuitCounter++;
            y++;
            if (i == 12 || i == 25 || i == 38)
                y = 0;
        }

    }


}