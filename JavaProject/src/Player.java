import javax.swing.*;
import java.util.ArrayList;

public class Player {

    private ArrayList<Card> Hand = new ArrayList<Card>(); //arraylist that stores an increasing and decrasingnumber of card objects
    private int score;  // players score

    /**
     * Accessor for the score attribute
     */
    public int getScore() { return score; } //get score set score

    public void setScore(int score) { this.score = score; }

    public ArrayList<Card> getHand() { return Hand; } //getters and setters for arraylist
    public void setHand(ArrayList<Card> hand) { Hand = hand; }

    public Player(ArrayList<Card> Hand){ //2 arguement constructor
        setHand(Hand);
        setScore(0);
    }

        public void displayHand() {
            JTextArea HandText = new JTextArea(); // method that allowed me to display an array list by using a for loop to grab each indivdual card object that was fed in
            for (int i = 0; i <Hand.size(); i++)
            {
                HandText.append(Hand.get(i).toString()+"\n");
            }
            JOptionPane.showMessageDialog(null, HandText);
        }


    public void recieveCard(Card Newcard){ // a method i created to add card objects to an arraylist
        Hand.add(Newcard);


    }

    public int getHandValue(){ // method i used to extract the the total hand value from an array list
        int totalHandValue = 0;//setting it to zero
        for(int i = 0; i< Hand.size(); i++) {
            totalHandValue += Hand.get(i).getValue();// total hand value add up each indivdual int value of object card to return hand total value in integer
        }
        return totalHandValue;
    }










}
