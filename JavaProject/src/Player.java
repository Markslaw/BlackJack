import java.util.ArrayList;

public class Player {

    private ArrayList<Card> Hand = new ArrayList<Card>();
    private int score;

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }

    public ArrayList<Card> getHand() { return Hand; }
    public void setHand(ArrayList<Card> hand) { Hand = hand; }

    public Player(ArrayList<Card> Hand){
        setHand(Hand);
    }






}
