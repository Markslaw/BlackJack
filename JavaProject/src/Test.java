/**
 * Created by mark on 19/11/2017.
 */
import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by mark on 19/11/2017.
 */
public class Test {
    public static void main(String[] args) {
      //  GUI test = new GUI();
        Card[] BasicDeck = new Card[52];
        int[] Values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
        String[] ValuesAsSring = {"two","three","four","five","six","seven","eight","nine","ten","jack","quenn","king","ace"};
        int y = 0;
        int SuitCounter=0;

        for (int i = 0; i <= 51 ; i++)
        {
            BasicDeck[i] = new Card();
            if (SuitCounter < 13) {
                BasicDeck[i].setSuit("Hearts");
                BasicDeck[i].setValue(Values[y]);
                BasicDeck[i].setValueAsString(ValuesAsSring[y]);
            }
            if (SuitCounter >= 13 && SuitCounter < 26) {
                BasicDeck[i].setSuit("Diamonds");
                BasicDeck[i].setValue(Values[y]);
                BasicDeck[i].setValueAsString(ValuesAsSring[y]);
            }
            if (SuitCounter >= 26 && SuitCounter < 39) {
                BasicDeck[i].setSuit("Clubs");
                BasicDeck[i].setValue(Values[y]);
                BasicDeck[i].setValueAsString(ValuesAsSring[y]);
            }
            if (SuitCounter >= 39 && SuitCounter < 52) {
                BasicDeck[i].setSuit("Spades");
                BasicDeck[i].setValue(Values[y]);
                BasicDeck[i].setValueAsString(ValuesAsSring[y]);
            }
            SuitCounter++;
            y++;
            if (i == 12 || i == 25 || i == 38)
                y = 0;
        }


        Deck bdeck = new Deck(BasicDeck);
        bdeck.display();
        bdeck.shuffle();
        bdeck.display();

        ArrayList<Card> PlayerHand = new ArrayList<Card>();
        ArrayList<Card> DealerHand = new ArrayList<Card>();

        Player user = new Player(PlayerHand);
        Player dealer = new Player(DealerHand);

int Counter = 0;
        user.recieveCard(Deck.getCard(Counter));
        Counter++;
        user.recieveCard(Deck.getCard(Counter));

        user.displayHand();
        dealer.getHand();




       // JOptionPane.showMessageDialog(null, BasicDeck[44].toString());
      //  JOptionPane.showMessageDialog(null, Deck.getCard(44));

    }



}