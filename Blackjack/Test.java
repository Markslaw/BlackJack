package Blackjack;

import javax.swing.*;

/**
 * Created by mark on 19/11/2017.
 */
public class Test {
    public static void main(String[] args) {
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



        Deck Deck = new Deck(BasicDeck);
        Deck.display();
        Deck.shuffle();
        Deck.display();

    }



}
