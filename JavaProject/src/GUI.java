
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class GUI extends JFrame {


        private JMenu fileMenu;
        private JLabel pcard1, pcard2, pcard3, pcard4, pcard5, playersHand, displaydscore;
        private JLabel dcard1, dcard2, dcard3, dcard4, dcard5, DealersHand, displaypscore;
        private JMenuBar Menu;
        private JButton hitbutton, staybutton, dealbutton;
        private JPanel playerholder, dealerholder, buttonholder;
        private JFrame frame = new JFrame("Blackjack");
        private ImageIcon backofcard, plycard1, plycard2, plycard3, plycard4, plycard5, dlrcard1, dlrcard2, dlrcard3, dlrcard4, dlrcard5;
        private int playervalue = 0, dealervalue = 0;
        private Card[] freshdeck = new Card[52];
        private int k = 0, i = 0, d = 0;
        private int playerscore = 0, dealerscore = 0;


        public GUI()

        {
            // JLabel label = new JLabel(new ImageIcon("Images//table.jpg"));
            //frame.add(new ImageIcon("Images//table.jpg"));

            frame.setLocation(100, 0);
            frame.setSize(1400, 1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLayout(new GridLayout(3, 1));
            buttonholder = new JPanel(new FlowLayout());
            dealerholder = new JPanel(new FlowLayout());
            playerholder = new JPanel(new FlowLayout());
            pcard1 = new JLabel();
            pcard2 = new JLabel();
            pcard3 = new JLabel();
            pcard4 = new JLabel();
            pcard5 = new JLabel();
            dcard1 = new JLabel();
            dcard2 = new JLabel();
            dcard3 = new JLabel();
            dcard4 = new JLabel();
            dcard5 = new JLabel();
            playersHand = new JLabel();
            DealersHand = new JLabel();
            displaypscore = new JLabel();
            displaydscore = new JLabel();
            backofcard = new ImageIcon("Images//backofcard.png");
            pcard1.setIcon(backofcard);
            pcard2.setIcon(backofcard);
            dcard1.setIcon(backofcard);
            dcard2.setIcon(backofcard);
            hitbutton = new JButton("Hit");
            staybutton = new JButton("Stay");
            dealbutton = new JButton("Deal");
            hitbutton.setSize(100,100);
            buttonholder.add(dealbutton);
            playerholder.add(playersHand);
            playerholder.add(pcard1);
            playerholder.add(pcard2);
            playerholder.setBackground(Color.green);
            frame.add(playerholder);
            dealerholder.add(DealersHand);
            dealerholder.add(dcard1);
            dealerholder.add(dcard2);
            dealerholder.setBackground(Color.BLUE);
            frame.add(dealerholder);
            buttonholder.add(hitbutton);
            buttonholder.add(staybutton);
            buttonholder.add(displaydscore);
            buttonholder.add(displaypscore);
            displaydscore.setText("Dealer:" + dealerscore);
            displaypscore.setText("player:" + playerscore);
            frame.add(buttonholder);

            Deck bDeck = new Deck();   // creating a new deck object
            bDeck.shuffle();      // shuffling said deck


            for (int i = 0; i < freshdeck.length; i++) {   // populating an array with said deck
                freshdeck[i] = bDeck.getCard(i);
            }
            hitbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) { // setting an action listener to the deal button
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
                            if(playervalue == 21){
                                JOptionPane.showMessageDialog(null,"Blackjack baby");// adding a winning condition if a palyer gets 21 immediatly its called blackjack
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

                        if(playervalue > 21 &&  i != 4 ){
                            JOptionPane.showMessageDialog(null,"Sorry you have bust!");
                            dealerscore++;// adding losing condition busting the hand i.e getting more than 21 however it checks to make sure a 5 card trick has not been performed


                        }
                       i++; //incrementing i
                    }

                }


            });

            dealbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == dealbutton) { // setting an actionlistener to the deal button

                        d = 0;  // resetting d so if the 5 card trick is performed wont constantly say dealer has won
                        k = 0;  //resetting k so that the new shuffled deck will pick the first card this stops a player from being able to judge whats left by whats been already used
                        i = 0;  // resetting i so that the hit button will now start its process from start again
                        playervalue = 0; //playervalue reset any new hand will now start with a value of zero
                        dealervalue = 0; //dealer value being reset
                        playerholder.remove(pcard1); //Removing all 5 player cards from screen
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

                        Deck bdeck = new Deck();     // reshuffling deck for two reasons (a) its the norm (b)stops player from being able judge what cards are left
                        bdeck.shuffle();
                        for(int x = 0; x< freshdeck.length; x++){
                            freshdeck[x] = bdeck.getCard(x);
                        }



                        displaydscore.setText("dealer:" +  dealerscore); // displaying an updated score for dealer
                        displaypscore.setText("player:" + playerscore); // displaying an updated score for player



                    }


                }


            });

            staybutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
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
                            d=5; //setting condition of dealers 5 card trick
                            dealerholder.revalidate();
                            dealerholder.repaint(); // adding dealers 5th card


                        }

                        if( d==5) //setting dealers winning condition 5 card trick
                        {
                            JOptionPane.showMessageDialog(null," The dealer has performed a 5 card trick!! unlucky mate");
                            dealerscore++; // adding to dealers score
                        }

                        if(dealervalue > 21){ // adding dealer losing condition he has scored more than 21 automatic lose

                            JOptionPane.showMessageDialog(null,"The dealer has bust his hand");
                            playerscore++; // adding a point to player
                        }

                        if(dealervalue > playervalue && dealervalue < 22){ // adding winning condition for dealer dealers value is higher than player without busting
                            JOptionPane.showMessageDialog(null, "The dealer wins!!");
                            dealerscore++; // adding point to dealers score
                        }

                        if(dealervalue == playervalue){ // adding a tie condition both dealer and playre have same value neither gets a point
                            JOptionPane.showMessageDialog(null, "The game has ended with a draw");
                        }
                    }
                }
            });







//            public void actionPerformed(ActionEvent e) {
//
//            if (e.getSource() == hitbutton){
//
//                if(i == 0){
//                    plycard1 = new ImageIcon(shuffled[k].getImage());
//                    pcard1.setIcon(plycard1);
//                    playervalue += shuffled[k].getValue();
//                    k++;
//                    playerholder.add(pcard1);
//
//                }
//
//                if(i==1){
//                    plycard2 = new ImageIcon(shuffled[k].getImage());
//                    pcard2.setIcon(plycard2);
//                    playervalue += shuffled[k].getValue();
//                    playerholder.add(pcard2);
//                    playerholder.revalidate();
//                    playerholder.repaint();
//                    k++;
//                }
//
//                if(i==2){
//                    plycard3 = new ImageIcon(shuffled[k].getImage());
//                    pcard3.setIcon(plycard3);
//                    playervalue += shuffled[k].getValue();
//                    playerholder.add(pcard3);
//                    playerholder.revalidate();
//                    playerholder.repaint();
//                    k++;
//                }
//
//                if(i==3){
//                    plycard4 = new ImageIcon(shuffled[k].getImage());
//                    pcard4.setIcon(plycard4);
//                    playervalue += shuffled[k].getValue();
//                    playerholder.add(pcard4);
//                    playerholder.revalidate();
//                    playerholder.repaint();
//                    k++;
//                }
//
//                if(i==4){
//                    plycard5 = new ImageIcon(shuffled[k].getImage());
//                    pcard5.setIcon(plycard5);
//                    playervalue += shuffled[k].getValue();
//                    playerholder.add(pcard5);
//                    playerholder.revalidate();
//                    playerholder.repaint();
//                    k++;
//
//                }
//                if(i>4){
//                    JOptionPane.showMessageDialog(null,"max no of cards");
//                }
//            }
//
//
//
//        }


        }
    }// frame.setLayout(layout);
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
//        private void FileMenu(){
//            fileMenu = new JMenu("File");
//
//            JMenuItem item;
//            item = new JMenuItem("Save");
//        //    item.addActionListener(this);
//            fileMenu.add(item);
//
//            fileMenu.addSeparator();
//            item = new JMenuItem("Quit");
//        //    item.addActionListener(this);
//            fileMenu.add(item);
//        }
//
//    }





