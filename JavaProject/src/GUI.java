
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class GUI extends JFrame {


        JMenu fileMenu;
        JButton hitbutton = new JButton("HIT");
        JButton staybutton = new JButton("Stay");

        // creating a JFrame called frame
        private JFrame frame = new JFrame("Blackjack");
        //JPanel panel = new JPanel();
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
            //frame.add(this);
            frame.add(panel);
            hitbutton.setLocation(10,1);
            hitbutton.setSize(100,100);
            panel.add(label,1);
            panel.add(hitbutton,2);
            panel.add(staybutton,2);
            panel.setSize(1000,800);
            panel.setLocation(0,0);
            panel.setBackground(Color.green);



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





