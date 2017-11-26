
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class GUI extends JFrame {


        JMenu fileMenu;
        JLabel pcard1, pcard2, pcard3, pcard4, pcard5, playersHand;
        JLabel dcard1, dcard2, dcard3, dcard4, dcard5, DealersHand;
        JMenuBar Menu;
        JButton hitbutton, staybutton, dealbutton;
        JPanel playerholder, dealerholder, buttonholder;
        private JFrame frame = new JFrame("Blackjack");
        ImageIcon backofcard, plycard1, plycard2, plycard3, plycard4, plycard5, dlrcard1, dlrcard2, dlrcard3, dlrcard4, dlrcard5;
        int playervalue = 0, dealervalue = 0;
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
            frame.add(buttonholder);


            Deck bDeck = new Deck();
            bDeck.shuffle();


            for (int i = 0; i < freshdeck.length; i++) {
                freshdeck[i] = bDeck.getCard(i);
            }
            hitbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == hitbutton) {
                        if (i == 0) {
                            plycard1 = new ImageIcon(freshdeck[k].getImage());
                            pcard1.setIcon(plycard1);
                            playervalue += freshdeck[k].getValue();
                            playerholder.add(pcard1);
                            k++;
                        }

                        if (i == 1) {
                            plycard2 = new ImageIcon(freshdeck[k].getImage());
                            pcard2.setIcon(plycard2);
                            playervalue += freshdeck[k].getValue();
                            playerholder.add(pcard2);
                            playerholder.revalidate();
                            playerholder.repaint();
                            k++;

                        }

                        if (i == 2) {
                            plycard3 = new ImageIcon(freshdeck[k].getImage());
                            pcard3.setIcon(plycard3);
                            playervalue += freshdeck[k].getValue();
                            playerholder.revalidate();
                            playerholder.repaint();
                            playerholder.add(pcard3);
                            k++;
                        }

                        if (i == 3) {
                            plycard4 = new ImageIcon(freshdeck[k].getImage());
                            pcard4.setIcon(plycard4);
                            playervalue += freshdeck[k].getValue();
                            playerholder.add(pcard4);
                            playerholder.revalidate();
                            playerholder.repaint();
                            k++;
                          // testing purposes to see if playervalue was actually giving correct values JOptionPane.showMessageDialog(null,playervalue);
                        }

                        if (i == 4) {
                            plycard5 = new ImageIcon(freshdeck[k].getImage());
                            pcard5.setIcon(plycard5);
                            playervalue += freshdeck[k].getValue();
                            playerholder.add(pcard5);
                            playerholder.revalidate();
                            playerholder.repaint();
                            k++;

                        }
                        if (i > 4) {
                            JOptionPane.showMessageDialog(null, "You have just got a 5 card trick");
                            playerscore++;

                        }
                        i++;
                    }

                }


            });

            dealbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == dealbutton) {
                        playervalue = 0;
                        dealervalue = 0;
                        playerholder.remove(pcard1);
                        playerholder.remove(pcard2);
                        playerholder.remove(pcard3);
                        playerholder.remove(pcard4);
                        playerholder.remove(pcard5);
                        pcard1.setIcon(backofcard);
                        pcard2.setIcon(backofcard);
                        playerholder.add(pcard1);
                        playerholder.add(pcard2);
                        playerholder.revalidate();
                        playerholder.repaint();

                        dealerholder.remove(dcard1);
                        dealerholder.remove(dcard2);
                        dealerholder.remove(dcard3);
                        dealerholder.remove(dcard4);
                        dealerholder.remove(dcard5);
                        dcard1.setIcon(backofcard);
                        dcard2.setIcon(backofcard);
                        dealerholder.add(dcard1);
                        dealerholder.add(dcard2);

                        if (k > 50) {
                            Deck bdeck = new Deck();
                            bdeck.shuffle();
                            for (int x = 0; x < freshdeck.length; x++) {
                                freshdeck[x] = bdeck.getCard(x);
                            }

                            k = 0;
                        }
                    }


                }


            });

            staybutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == staybutton) {
                        if (k > 46) {
                            Deck bdeck = new Deck();
                            bdeck.shuffle();
                            for (int x = 0; x < freshdeck.length; x++) {
                                freshdeck[x] = bdeck.getCard(x);
                            }
                            k = 0;
                        }
                        dealerholder.remove(dcard1);
                        dealerholder.remove(dcard2);
                        dlrcard1 = new ImageIcon(freshdeck[k].getImage());
                        dcard1.setIcon(dlrcard1);
                        dealervalue += freshdeck[k].getValue();
                        dealerholder.add(dcard1);
                        k++;


                        dlrcard2 = new ImageIcon(freshdeck[k].getImage());
                        dcard2.setIcon(dlrcard2);
                        dealervalue += freshdeck[k].getValue();
                        dealerholder.add(dcard2);
                        k++;
                        dealerholder.revalidate();
                        dealerholder.repaint();

                        if (dealervalue < playervalue && dealervalue < 21) {

                            dlrcard3 = new ImageIcon(freshdeck[k].getImage());
                            dcard3.setIcon(dlrcard3);
                            dealervalue += freshdeck[k].getValue();
                            dealerholder.add(dcard3);
                            k++;
                            dealerholder.revalidate();
                            dealerholder.repaint();
                        }

                        if (dealervalue < playervalue && dealervalue < 21) {

                            dlrcard4 = new ImageIcon(freshdeck[k].getImage());
                            dcard4.setIcon(dlrcard4);
                            dealervalue += freshdeck[k].getValue();
                            dealerholder.add(dcard4);
                            k++;
                            dealerholder.revalidate();
                            dealerholder.repaint();
                        }

                        if (dealervalue < playervalue && dealervalue < 21) {

                            dlrcard5 = new ImageIcon(freshdeck[k].getImage());
                            dcard5.setIcon(dlrcard5);
                            dealervalue += freshdeck[k].getValue();
                            dealerholder.add(dcard5);
                            k++;
                            d=5;
                            dealerholder.revalidate();
                            dealerholder.repaint();


                        }

                        if(dealervalue <= 21 && d==5)
                        {
                            JOptionPane.showMessageDialog(null," The dealer has performed a 5 card trick!! unlucky mate");
                            dealerscore++;
                        }

                        if(dealervalue > 21){

                            JOptionPane.showMessageDialog(null,"The dealer has bust his hand");
                            playerscore++;
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





