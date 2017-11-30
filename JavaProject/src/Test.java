/**
 * Created by mark on 19/11/2017.
 */
//import javax.swing.*;
//import java.util.ArrayList;
//
///**
// * Created by mark on 19/11/2017.
// */
//public class Test {
//   public static void main(String[] args) {
//  int pscore = 0;
//  int dscore = 0;
//  ArrayList<Card> PlayerHand = new ArrayList<Card>(); // for dealer and playercreated an array list that i could add cards to
//  ArrayList<Card> DealerHand = new ArrayList<Card>();
//  Player user = new Player(PlayerHand); // created a new user for dealer and player
//  Player dealer = new Player(DealerHand);
//  Deck bdeck = new Deck(); //inistilising deck object
//  bdeck.display(); //calling display method to test ive made a deck
//  JOptionPane.showMessageDialog(null,Deck.getCard(44));
//       new GUI(); // calling card at position 44 to see if it matches
//  do{
//
//   bdeck.shuffle(); // shuffling said deck
//   bdeck.display(); // calling my display method to check if decks been made
//
//
//   int Counter = 0; //using a counter to go throuigh my deck
//   user.recieveCard(Deck.getCard(Counter)); // getting first card
//   Counter++; //incriminting counter to get next card
//   user.recieveCard(Deck.getCard(Counter)); //getting secound card
//   Counter++;
//   user.displayHand();// displaying his hand to make sure that user has recieved first two cards
//   JOptionPane.showMessageDialog(null, user.getHandValue());//
//
//   if (user.getHandValue() == 21) {
//    JOptionPane.showMessageDialog(null, "Player wins");
//    pscore++;
//   }
//
//   if(user.getHandValue() < 21) {
//    while (JOptionPane.showConfirmDialog(null, "Would you like to hit") == JOptionPane.YES_OPTION) {
//        user.recieveCard(Deck.getCard(Counter));
//        Counter++;
//        user.displayHand();
//        // else{
//       // dealer.recieveCard(Deck.getCard(Counter));
//        //counter++;
//       // dealer.recieveCard(Deck.getCard(Counter));
//        //counter++;
//        //if(dealer.getHandValue()< 17)
//        //counter++
//        //dealer.recieveCard(Deck.getCard(Counter));
//        //if(dealer.getHandValue>21)
//        //pscore ++
//        //if(dealer.getHandValue>17&&dealer.getHandValue<21&& dealer.getHandValue>player.getHandValue)
//        //dscore++
//        //else
//        //pscore++
//        //
//   // }
//     if (user.getHandValue() > 21) {
//      JOptionPane.showMessageDialog(null, "you have bust");
//      dscore++;
//
//
//
//      PlayerHand.clear();// clearing arraylis for players and dealers next hand
//      DealerHand.clear();
//     }
//     JOptionPane.showMessageDialog(null, dscore); // displaying the values of both hands
//     JOptionPane.showMessageDialog(null, pscore);
//    }
//
//   }
//
//
//   // JOptionPane.showMessageDialog(null, BasicDeck[44].toString());
//     JOptionPane.showMessageDialog(null, Deck.getCard(44));
//
//  } while (JOptionPane.showConfirmDialog(null, "Would you like to play again") == JOptionPane.YES_OPTION);
//
//
// }
//}