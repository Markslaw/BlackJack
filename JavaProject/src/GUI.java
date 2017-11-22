
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
        JPanel panel = new JPanel();


        public GUI()

        {
            GridLayout layout = new GridLayout(0, 2);
            frame.setLocation(350, 200);
            frame.setSize(1000, 800);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setBackground(Color.green);
            //frame.add(this);
            frame.add(panel);
            panel.add(hitbutton);
            panel.add(staybutton);
            panel.setSize(200,200);

            Container contentPane = new Container();
            contentPane.setLayout(layout);
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





