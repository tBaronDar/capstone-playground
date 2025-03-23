import javax.swing.*;
import java.awt.event.*;

public class MainWindow
{
  public static void main(String[] args) {
    // Create a new JFrame (window)
    JFrame frame = new JFrame("Simple Window");


    // Set the size of the window (width, height)
    frame.setSize(900, 756);

    //fd
    frame.setLayout(null);

    // Set the default close operation (exit when window is closed)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the window's visibility to true
    frame.setVisible(true);

    // Button 1 created
    // OK button
    // Η ετοιμη κλασση ονομαζεται JButton
    JButton b1 = new JButton("OK");
    JButton b2 = new JButton("Exit");
    JButton b4 = new JButton("Exit");
    JButton b6 = new JButton("Exit");
    JButton b7 = new JButton("Exit");

    // Η μέθοδος setBounds μας επιτρέπει να αλλαξουμε μεγεθος και τη θεση
    b1.setBounds(100, 50, 150, 50);
    b2.setBounds(100, 150, 150, 50);

    //Προσθεσε τα κουμπια
    frame.add(b1);
    frame.add(b2);

    //βαλε και μια λιστα
    MyList l1 = new MyList();

    // Set the bounds for the custom list panel
    l1.setBounds(300, 0, 250, 450);

    frame.add(l1);

    // Εδώ μπλεκουμε λιγο, ο Listener λεει περιμενε κάποιο action
    // το action που θελω ειναι το click,
    ActionListener onClick = new ActionListener() {
      @Override //το actionPerformed() υπαρχει μεσα b1 με το override του λεμε να το αντικαταστησει με αυτο το actionPerformed()
      public void actionPerformed(ActionEvent e) {
        // Exit the application when b2 is clicked
        System.exit(0);
      }
    };
    //τελος βαζω το onClick event στο b2
    b2.addActionListener(onClick);
  }
}
