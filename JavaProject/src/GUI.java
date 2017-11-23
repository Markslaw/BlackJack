
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class GUI extends JFrame {


        JMenu fileMenu;
        JLabel pcard1, pcard2, pcard3, pcard4, pcard5 ;
        JLabel dcard1, dcard2, dcard3, dcard4, dcard6 ;
        JMenuBar Menu;
        JButton hitbutton = new JButton("Hit");
        JButton staybutton = new JButton("Stay");

        // creating a JFrame called frame
        private JFrame frame = new JFrame("Blackjack");
       // JPanel panel = new JPanel();
        JLayeredPane panel = new JLayeredPane();


        public GUI()

        {
            JLabel label = new JLabel(new ImageIcon("Images//table.jpg"));

            // GridLayout layout = new GridLayout(0, 2);
            //frame.add(new ImageIcon("Images//table.jpg"));
            frame.setLayout(null);
            frame.setLocation(350, 200);
            frame.setSize(1000, 800);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //  frame.getContentPane().setBackground(Color.blue);
            frame.setVisible(true);
            // frame.setLayout(layout);
            //frame.getContentPane().setBackground(Color.green);
            //frame.add(this)
            frame.add(panel);
            staybutton.setLocation(400,50);
            staybutton.setSize(80,80);
            hitbutton.setLocation(200,50);
            hitbutton.setSize(80,80);
            label.setSize(1000,800);
            label.setLocation(0,0);
            panel.add(staybutton,3);
            panel.add(hitbutton,3);
            panel.add(label,1);
            panel.setSize(1000,800);
            panel.setLocation(0,0);
            panel.setVisible(true);



            //Container contentPane = new Container();
            //contentPane.setLayout(layout);
            //contentPane.setBackground(Color.GREEN);


        }

        //abstract method
        public void paint(Graphics g) {
            ImageIcon table = new ImageIcon("Images//table.jpg");

            g.drawImage(table.getImage(), 0, 0, null);
        }

        private void FileMenu(){
            fileMenu = new JMenu("File");

            JMenuItem item;
            item = new JMenuItem("Save");
        //    item.addActionListener(this);
            fileMenu.add(item);

            fileMenu.addSeparator();
            item = new JMenuItem("Quit");
        //    item.addActionListener(this);
            fileMenu.add(item);
        }

    }





