
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class GUI extends JFrame{


        JMenu fileMenu;

       // creating a JFrame called frame
        private JFrame frame = new JFrame("Blackjack");


       public GUI()

       {
           frame.setLocation(350, 200);
           frame.setSize(1000, 800);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           GridLayout layout = new GridLayout(0,2);

           Container contentPane = new Container();
           contentPane.setLayout(layout);
           contentPane.setBackground(Color.GREEN);


           FileMenu();

           JMenuBar menuBar = new JMenuBar();
           setJMenuBar(menuBar);
           menuBar.add(fileMenu);

           frame.getContentPane().add(contentPane);
           frame.add(menuBar);
           frame.setVisible(true);


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





