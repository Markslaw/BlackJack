
import javax.swing.*;
import java.util.Random;

/**
 * Created by mark on 19/11/2017.
 */
public class Deck {
    private static Card[] deck = new Card[52]; // declaring that object deck consists of 52 object cards using a fixed area area as deck size is fixed

    /** declaring object deck consits of 52 card objects using a fixed array
     *
     * @return
     */
    public Card[] getDeck() {return deck;} // getters and setters for deck

    public void setDeck(Card[] deck) {this.deck = deck;}


    // public String toString() {
    //     return "Deck{" +
    //            "Deck=" + +   // was first attempt at a deck toString method
    //            '}';
    //}



    // Learned how to shuffle an array on stack overflow//
    public void shuffle() {
        int length = deck.length; //integer length is equal to deck length
        Random random = new Random(); // delcaring variable random is a new rando method
        for (int i = 0; i < length; i++) { // using a for loop to swap card objects position in deck
            int swap = i + random.nextInt(length - i);
            swapCards(i, swap);
        }
    }

    public void swapCards(int i, int swap){// creating a method to swapcards which can be called in shuffle
        Card temp = deck[i];
        deck[i] = deck[swap];
        deck[swap] = temp;
    }


    public void display() {
        JTextArea Roster = new JTextArea(); // method that allowedd me to display all the card object that had been feed ino deck creating a Jtextarea
        for (int i = 0; i <deck.length; i++)
        {
            Roster.append(deck[i].toString()+"\n"); //picking through all objects in deck using a for loop and converting them to string using a toString method
        }
        JOptionPane.showMessageDialog(null, Roster); // outputing Roster
    }

    public static Card getCard(int CardPosition){

        return deck[CardPosition]; // this method allowed me to access any card in the deck instrumental during early testing stages
    }





    public Deck() {

        int[] Values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11}; // using an int array which reprsent the value of the caards
        String[] ValuesAsSring = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};// creating a string area  of the values same way they would be seen on a card
        int y = 0; // using y as a counter to allow me to alter the deck at key stages
        int SuitCounter = 0; //using suit counter to show me when cards switch through the 4 suits

        for (int i = 0; i <= 51; i++) { // using a for loop to add 52 card objects to 1 deck object
            deck[i] = new Card(); // declaring that everything at postion i is equal to new card object
            if (SuitCounter < 13) { // 13 is important thats how big my string arrays and int arrays are its also when cards change  suits
                // deck[i].setSuit("Hearts"); //orginally how i added all of the arguements for card wasnt till later i added Images and cleaned the code
                // deck[i].setValue(Values[y]);
                // deck[i].setValueAsString(ValuesAsSring[y]);
                deck[i] = new Card(Values[y],"Diamonds",ValuesAsSring[y],new ImageIcon("src//Images//card"+(i+1)+".png"));
                // this is were a new card object is created with 4 arguements and fed into deck the process repeats 4 times to make 52 card deck using (i + 1) to count through my card images

            }
            if (SuitCounter >= 13 && SuitCounter < 26) {
                // deck[i].setSuit("Diamonds");
                // deck[i].setValue(Values[y]);
                // deck[i].setValueAsString(ValuesAsSring[y]);
                deck[i] = new Card(Values[y],"Hearts",ValuesAsSring[y],new ImageIcon("src//Images//card"+(i+1)+".png"));

            }
            if (SuitCounter >= 26 && SuitCounter < 39) {
                // deck[i].setSuit("Clubs");
                // deck[i].setValue(Values[y]);
                // deck[i].setValueAsString(ValuesAsSring[y]);
                deck[i] = new Card(Values[y],"Clubs",ValuesAsSring[y],new ImageIcon("src//Images//card"+(i+1)+".png"));
            }
            if (SuitCounter >= 39 && SuitCounter < 52) {
                //  deck[i].setSuit("Spades");
                //  deck[i].setValue(Values[y]);
                //  deck[i].setValueAsString(ValuesAsSring[y]);
                deck[i] = new Card(Values[y],"Clubs",ValuesAsSring[y],new ImageIcon("src//Images//card"+(i+1)+".png"));

            }
            SuitCounter++;//incrementing suit counter
            y++;//incrementing y
            if (i == 12 || i == 25 || i == 38) // the points at which suit changes plus the two arrays start again
                y = 0; // resting y to zero at those points
        }

    }


}