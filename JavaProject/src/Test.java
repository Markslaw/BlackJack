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
  new GUI();
  int pscore = 0;
  int dscore = 0;
  ArrayList<Card> PlayerHand = new ArrayList<Card>();
  ArrayList<Card> DealerHand = new ArrayList<Card>();
  Player user = new Player(PlayerHand);
  Player dealer = new Player(DealerHand);
  Deck bdeck = new Deck();
  bdeck.display();

  do {

   bdeck.shuffle();
   bdeck.display();


   int Counter = 0;
   user.recieveCard(Deck.getCard(Counter));
   Counter++;
   user.recieveCard(Deck.getCard(Counter));
   Counter++;
   user.displayHand();
   JOptionPane.showMessageDialog(null, user.getHandValue());

   if (user.getHandValue() == 21) {
    JOptionPane.showMessageDialog(null, "Player wins");
    pscore++;
   }

   if (user.getHandValue() < 21) {
    while (JOptionPane.showConfirmDialog(null, "Would you like to hit") == JOptionPane.YES_OPTION) {
     user.recieveCard(Deck.getCard(Counter));
     Counter++;
     user.displayHand();
     if (user.getHandValue() > 21) {
      JOptionPane.showMessageDialog(null, "you have bust");
      dscore++;
      PlayerHand.clear();
      DealerHand.clear();
     }
     JOptionPane.showMessageDialog(null, dscore);
    }

   }


   // JOptionPane.showMessageDialog(null, BasicDeck[44].toString());
   //  JOptionPane.showMessageDialog(null, Deck.getCard(44));

  } while (JOptionPane.showConfirmDialog(null, "Would you like to play again") == JOptionPane.YES_OPTION);


 }
}