
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class GUI extends JFrame implements ActionListener {


        private JMenu FileMenu, Saving;
        private JLabel pcard1, pcard2, pcard3, pcard4, pcard5, playersHand, displaydscore;
        private JLabel dcard1, dcard2, dcard3, dcard4, dcard5, DealersHand, displaypscore;
        private JMenuBar Menu;
        private JMenuItem exit, save, rules, load, newgame;
        private JButton hitbutton, staybutton, dealbutton;
        private JPanel playerholder, dealerholder, buttonholder;
        private JFrame frame = new JFrame("Blackjack");
        private ImageIcon backofcard, plycard1, plycard2, plycard3, plycard4, plycard5, dlrcard1, dlrcard2, dlrcard3, dlrcard4, dlrcard5;
        private int playervalue = 0;
        private int dealervalue = 0;
        private Card[] freshdeck = new Card[52];
        private int k = 0;
        private int i = 0;
        private int d = 0;
        private int playerscore = 0;
        private int dealerscore = 0;


        public GUI()

        {

            frame.setLocation(100, 0);     // setting frames locaton
            frame.setSize(1400, 1010); //setting its dimensions
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true); // making it visible
            frame.setLayout(new GridLayout(3, 1)); // setting up a grid layout which allows me to easily place what i need into predefined areas
            exit = new JMenuItem();   // creating 5 new menuitems
            save = new JMenuItem();
            rules = new JMenuItem();
            load = new JMenuItem();
            newgame = new JMenuItem();
            exit.addActionListener(this);  // adding actionlisteners to them
            save.addActionListener(this);
            rules.addActionListener(this);
            load.addActionListener(this);
            newgame.addActionListener(this);
            FileMenu = new JMenu(); // Creating two new JMenus
            Saving = new JMenu();
            Menu = new JMenuBar(); //creating new Menubar
            FileMenu.setText("Options"); //setting text for my file menu items
            Saving.setText("Saving");
            exit.setText("Exit");
            save.setText("Save");
            load.setText("Load");
            rules.setText("Rules");
            newgame.setText("New Game");
            Menu.add(FileMenu);// adding 2 menus to menubar
            Menu.add(Saving);
            Color menuC = new Color(55,113,11); //creating new color for my menubar
            Menu.setBackground(menuC);// setting menubars color
            FileMenu.add(exit);// adding Menu items to menus
            FileMenu.add(rules);
            Saving.add(save);
            Saving.add(load);
            FileMenu.add(newgame);
            Menu.setLayout(new FlowLayout());// setting my menubar as flowlayout
            frame.setJMenuBar(Menu);
            buttonholder = new JPanel(new FlowLayout()); //setting my 3 panels
            dealerholder = new JPanel(new FlowLayout());
            playerholder = new JPanel(new FlowLayout());
            pcard1 = new JLabel(); //setting labels to add my cards to max 5 cards per person
            pcard2 = new JLabel();
            pcard3 = new JLabel();
            pcard4 = new JLabel();
            pcard5 = new JLabel();
            dcard1 = new JLabel();
            dcard2 = new JLabel();
            dcard3 = new JLabel();
            dcard4 = new JLabel();
            dcard5 = new JLabel();
            playersHand = new JLabel();// creating a label for aplayers hand and dealers
            DealersHand = new JLabel();
            displaypscore = new JLabel();// 2 labels to display player and dealers score
            displaydscore = new JLabel();
            backofcard = new ImageIcon("src//Images//backofcard.png"); // making a new image that displays the back of a card
            pcard1.setIcon(backofcard); // setting first 2 cards of dealer and first two cards  of player to display the back of card images
            pcard2.setIcon(backofcard);
            dcard1.setIcon(backofcard);
            dcard2.setIcon(backofcard);
            hitbutton = new JButton("Hit"); // adding 3 Jbuttons and setting their text
            staybutton = new JButton("Stay");
            dealbutton = new JButton("Deal");
            buttonholder.add(dealbutton); //adding dealbutton to buttonholder jpanel
            playerholder.add(playersHand);
            playerholder.add(pcard1);//adding cards to players Jpanel
            playerholder.add(pcard2);
            Color poker = new Color(55,156,11); // creating a color for my jPanels
            playerholder.setBackground(poker); //setting my 3 Jpanels to my custom colour
            dealerholder.setBackground(poker);
            buttonholder.setBackground(poker);
            frame.add(playerholder); // adding playerholder jpanel to frame
            dealerholder.add(DealersHand);
            dealerholder.add(dcard1); // adding card images to dealerholder Jpanel
            dealerholder.add(dcard2);
            frame.add(dealerholder);// adding dealerholder jpanel to frame
            buttonholder.add(hitbutton); //adding two Jbuttons to buttonholder JPanel
            buttonholder.add(staybutton);
            buttonholder.add(displaydscore); //adding 2 Jlabels to button holder JPanel
            buttonholder.add(displaypscore);
            displaydscore.setText("Dealer:" + dealerscore);//Setting the text of my 2 Jpanels
            displaypscore.setText("Player:" + playerscore);
            frame.add(buttonholder); // adding 3rd panel to JFrame
            hitbutton.addActionListener(this); // adding action listeners to my 3 buttons
            dealbutton.addActionListener(this);
            staybutton.addActionListener(this);
          //  ArrayList<Card> PlayerHand = new ArrayList<Card>();
          //  ArrayList<Card> DealerHand = new ArrayList<Card>();
         //   Player user = new Player(PlayerHand); // created a new user for dealer and player
         //   Player dealer = new Player(DealerHand);

            Deck bDeck = new Deck();   // creating a new deck object
            bDeck.shuffle();      // shuffling said deck


            for (int i = 0; i < freshdeck.length; i++) {   // populating an array with said deck
                freshdeck[i] = bDeck.getCard(i);
            }



        }
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == exit) // exiting game once that file option has been selected
            {
                System.exit(0); // setting file i

            }

            if(e.getSource() == rules)// displaying rules of game once that file option has been selected
            {
                JOptionPane.showMessageDialog(null,"Blackjack is pretty simple. The basic premise of the game is that you want to have a hand value that" +
                        " is closer to 21 than that of the dealer,\n without going over 21. Other players at the table are of no concern. Your hand competes only against the hand" +
                        " of the dealer.The rules of play for the dealer\n are strictly dictated, leaving no decisions up to the dealer. If a player is dealt a straight 21 this is known" +
                        "as a blackjack \nand is an automatic win. if a player manages the get 5 cards regardless of whether he busts or not this is known as a 5 card trick and again he wins" +
                        "The values of cards are as follows,\nAce=11\nKing=10\nQueen=10\nJack=10\nAnd the rest of the values correspond to card number","Rules",JOptionPane.INFORMATION_MESSAGE);
            }


            if (e.getSource() == save){

                try {
                    save();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                JOptionPane.showMessageDialog(null, "Your file has been  successfully saved");
            }

            if (e.getSource() == newgame){
                int result = JOptionPane.showConfirmDialog(null, "Are you sure youd like to start a new game all progress will be lost");
                if (result == JOptionPane.YES_OPTION){
                    playerscore = 0;
                    dealerscore = 0;
                    displaydscore.setText("Dealer:" + dealerscore); // displaying an updated score for dealer
                    displaypscore.setText("Player:" + playerscore); // displaying an udated score for player
                }


            }

            if (e.getSource() == hitbutton) {
                if (i == 0) {                    // using counter i to listen to how many times hit button is pressed
                    plycard1 = new ImageIcon(freshdeck[k].getImage()); //
                    pcard1.setIcon(plycard1);
                    playervalue += freshdeck[k].getValue(); // extracting integer value of card from card object and using player value to store it
                    k++;
                    playerholder.add(pcard1); //adding first card object to  screen replacing the back of card with said card
                    // using k as a counter to track position in fresh deck array
                }

                if (i == 1) {
                    plycard2 = new ImageIcon(freshdeck[k].getImage());
                    pcard2.setIcon(plycard2);
                    playervalue += freshdeck[k].getValue();
                    playerholder.add(pcard2);
                    playerholder.revalidate(); // repainting and updating screen to show players cards
                    playerholder.repaint();
                    k++; // repeating process for as many times as hit button is pressed
                    if (playervalue == 21) {
                        JOptionPane.showMessageDialog(null, "Blackjack baby");// adding a winning condition if a player gets 21 immediatly its called blackjack
                        playerscore++;
                    }
                }

                if (i == 2) {
                    plycard3 = new ImageIcon(freshdeck[k].getImage());
                    pcard3.setIcon(plycard3);
                    playervalue += freshdeck[k].getValue();
                    playerholder.revalidate();
                    playerholder.repaint();
                    playerholder.add(pcard3);
                    k++;// repeating process for as many times as hit button is pressed

                }

                if (i == 3) {
                    plycard4 = new ImageIcon(freshdeck[k].getImage());
                    pcard4.setIcon(plycard4);
                    playervalue += freshdeck[k].getValue();
                    playerholder.add(pcard4);
                    playerholder.revalidate();
                    playerholder.repaint();
                    k++;//repeating process for as many times as hit button is pressed
                    // testing purposes to see if playervalue was actually giving correct values JOptionPane.showMessageDialog(null,playervalue);
                }

                if (i == 4) {
                    plycard5 = new ImageIcon(freshdeck[k].getImage());
                    pcard5.setIcon(plycard5);
                    playervalue += freshdeck[k].getValue();
                    playerholder.add(pcard5);
                    playerholder.revalidate();
                    playerholder.repaint();
                    k++;// repeating process for as many times as hit button is pressed

                }
                if (i == 4) {
                    JOptionPane.showMessageDialog(null, "You have just got a 5 card trick");
                    playerscore++;
                    // adding winning condition the 5 card trick does not matter if player busts his hand

                }

                if (playervalue > 21 && i != 4) {
                    JOptionPane.showMessageDialog(null, "Sorry you have bust!");
                    dealerscore++;// adding losing condition busting the hand i.e getting more than 21 however it checks to make sure a 5 card trick has not been performed


                }
                i++; //incrementing i
            }


                if (e.getSource() == dealbutton) { // setting an actionlistener to the deal button

                    d = 0;  // resetting d so if the 5 card trick is performed wont constantly say dealer has won
                    k = 0;  //resetting k so that the new shuffled deck will pick the first card this stops a player from being able to judge whats left by whats been already used
                    i = 0;  // resetting i so that the hit button will now start its process from start again
                    playervalue = 0; //playervalue reset any new hand will now start with a value of zero
                    dealervalue = 0; //dealer value being reset
                    playerholder.remove(pcard1); //Removing all 5 player cards from screen or at least as many that are tere
                    playerholder.remove(pcard2);
                    playerholder.remove(pcard3);
                    playerholder.remove(pcard4);
                    playerholder.remove(pcard5);
                    pcard1.setIcon(backofcard); // setting back of 2 cards to represent players hand
                    pcard2.setIcon(backofcard);
                    playerholder.add(pcard1); // adding said cards
                    playerholder.add(pcard2);
                    playerholder.revalidate();
                    playerholder.repaint();// repainting screen


                    dealerholder.remove(dcard1); //Removing all of dealers cards
                    dealerholder.remove(dcard2);
                    dealerholder.remove(dcard3);
                    dealerholder.remove(dcard4);
                    dealerholder.remove(dcard5);
                    dcard1.setIcon(backofcard);// setting back of cards to represent dealers hand
                    dcard2.setIcon(backofcard);
                    dealerholder.add(dcard1);// adding said cards
                    dealerholder.add(dcard2);
                    dealerholder.revalidate();
                    dealerholder.repaint(); // updating dealers hand

                    Deck bdeck = new Deck();     // reshuffling deck for two reasons (a) its the norm (b)stops player from being able judge what cards are left based o whats been put down
                    bdeck.shuffle();
                    for (int x = 0; x < freshdeck.length; x++) {
                        freshdeck[x] = bdeck.getCard(x);
                    }


                    displaydscore.setText("Dealer:" + dealerscore); // displaying an updated score for dealer
                    displaypscore.setText("Player:" + playerscore); // displaying an updated score for player
                    //sidenote not updating score till deal button is pressed was a deliberate design decision i could have easily added this code to update score immediately after
                    // stay was hit i felt  it more aesthetically pleasing to do it this way

                    if(playerscore ==  10) {
                        JOptionPane.showMessageDialog(null,"player wins Congrats");
                        playerscore = 0;
                        dealerscore = 0;
                        displaydscore.setText("Dealer:" + dealerscore);
                        displaypscore.setText("Player:" + playerscore);

                    }

                    if(dealerscore == 10 ){
                        JOptionPane.showMessageDialog(null, "dealer wins unlucky");
                        dealerscore = 0;
                        playerscore = 0;
                        displaydscore.setText("Dealer:" + dealerscore);
                        displaypscore.setText("Player:" + playerscore);
                    }

                }

            if (e.getSource() == staybutton) { //setting an action listener to stay button

                dealerholder.remove(dcard1); // removing back of cards
                dealerholder.remove(dcard2);
                dlrcard1 = new ImageIcon(freshdeck[k].getImage()); // getting image of next card in deck the number k represents is the next position in deck after player has used. e.g if player last used card4 dealer gets card 5
                dcard1.setIcon(dlrcard1); // adding Image
                dealervalue += freshdeck[k].getValue(); //extracting Integer value
                dealerholder.add(dcard1); // adding it to dealers JPanel(hand)
                k++; //incrementing k


                dlrcard2 = new ImageIcon(freshdeck[k].getImage());
                dcard2.setIcon(dlrcard2);
                dealervalue += freshdeck[k].getValue();
                dealerholder.add(dcard2);
                k++;
                dealerholder.revalidate();
                dealerholder.repaint(); // adding dealers secound card using same process

                if (dealervalue < playervalue && dealervalue < 21) {  //setting conditions were dealer only adds cards as needed to win game

                    dlrcard3 = new ImageIcon(freshdeck[k].getImage());
                    dcard3.setIcon(dlrcard3);
                    dealervalue += freshdeck[k].getValue();
                    dealerholder.add(dcard3);
                    k++;
                    dealerholder.revalidate();
                    dealerholder.repaint();// adding dealers 3rd card if needed
                }

                if (dealervalue < playervalue && dealervalue < 21) { // setting conditions were dealer adds cards as needed to win game

                    dlrcard4 = new ImageIcon(freshdeck[k].getImage());
                    dcard4.setIcon(dlrcard4);
                    dealervalue += freshdeck[k].getValue();
                    dealerholder.add(dcard4);
                    k++;
                    dealerholder.revalidate();
                    dealerholder.repaint();// adding dealers 4th card
                }

                if (dealervalue < playervalue && dealervalue < 21) { // setting conditions were dealer adds cards as needed to win game

                    dlrcard5 = new ImageIcon(freshdeck[k].getImage());
                    dcard5.setIcon(dlrcard5);
                    dealervalue += freshdeck[k].getValue();
                    dealerholder.add(dcard5);
                    k++;
                    d = 5; //setting condition of dealers 5 card trick
                    dealerholder.revalidate();
                    dealerholder.repaint(); // adding dealers 5th card


                }

                if (d == 5) //setting dealers winning condition 5 card trick
                {
                    JOptionPane.showMessageDialog(null, " The dealer has performed a 5 card trick!! unlucky mate");
                    dealerscore++; // adding to dealers score
                }

                if (dealervalue > 21 && d!= 5 ) { // adding dealer losing condition he has scored more than 21 automatic lose

                    JOptionPane.showMessageDialog(null, "The dealer has bust his hand");
                    playerscore++; // adding a point to player
                }

                if (dealervalue > playervalue && dealervalue < 22) { // adding winning condition for dealer dealers value is higher than player without busting
                    JOptionPane.showMessageDialog(null, "The dealer wins!!");
                    dealerscore++; // adding point to dealers score
                }

                if (dealervalue == playervalue) { // adding a tie condition both dealer and player have same value neither gets a point
                    JOptionPane.showMessageDialog(null, "The game has ended with a draw");
                }
            }











            }



    public void save() throws IOException{ //saves an integer value of player score in afile called score.dat

        ObjectOutputStream os;
        os = new ObjectOutputStream(new FileOutputStream("score.dat"));
        os.writeObject(playerscore);
        os.close();

    }


//    public void load() throws IOException{
//        ObjectInputStream is;
//        is = new ObjectInputStream(new FileInputStream("score1.dat"));
//        playerscore  =  is.();
//        is.close();
//    } // attempted to load playerscore





}



















        // frame.setLayout(layout);
        //frame.getContentPane().setBackground(Color.green);
        //frame.add(this)
//            frame.add(panel);
//            staybutton.setLocation(400,50);
//            staybutton.setSize(80,80);
//            hitbutton.setLocation(200,50);
//            hitbutton.setSize(80,80);
//            label.setSize(1000,800);
//            label.setLocation(0,0);
//            panel.add(staybutton,3);
//            panel.add(hitbutton,3);
//            panel.add(label,1);
//            panel.setSize(1000,800);
//            panel.setLocation(0,0);
//            panel.setVisible(true);


        //Container contentPane = new Container();
        //contentPane.setLayout(layout);
        //contentPane.setBackground(Color.GREEN);


        //        //abstract method
//        public void paint(Graphics g) {
//            ImageIcon table = new ImageIcon("Images//table.jpg");
//
//            g.drawImage(table.getImage(), 0, 0, null);
//        }
//
//        private void FileMenu() {
//            FileMenu = new JMenu("File");
//
//            JMenuItem item;
//            item = new JMenuItem("Save");
//         //   item.addActionListener(this);
//            FileMenu.add(item);
//
//            FileMenu.addSeparator();
//            item = new JMenuItem("Quit");
//         //   item.addActionListener(this);
//            FileMenu.add(item);
//        }
//    }
//
//    }





