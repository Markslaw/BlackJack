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
       GUI test = new GUI();


        Deck bdeck = new Deck();
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
        Counter++;
        user.displayHand();
        JOptionPane.showMessageDialog(null, user.getHandValue());
        if(user.getHandValue() < 21)
        {
     while(JOptionPane.showConfirmDialog(null,"Would you like to hit") == JOptionPane.YES_OPTION) {

      user.recieveCard(Deck.getCard(Counter));
      Counter++;
      user.displayHand();
     }
     }











       // JOptionPane.showMessageDialog(null, BasicDeck[44].toString());
      //  JOptionPane.showMessageDialog(null, Deck.getCard(44));

    }



}