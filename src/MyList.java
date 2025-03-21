import javax.swing.*;

public class MyList extends JPanel {
  private JList<String> timologia;

  public MyList(){
    String[] listData = {"Timologio 1", "Timologio 2", "Timologio 3", "Timologio 4", "Timologio 5"};

    // Create a JList with the listData
    timologia = new JList<>(listData);

    // Add the JList to a JScrollPane
    JScrollPane scrollPane = new JScrollPane(timologia);
    scrollPane.setBounds(100, 150, 200, 100); // Set the size of the scroll pane

    // Set the layout to null to allow custom positioning
    setLayout(null);

    // Add the scroll pane (which contains the list) to the panel
    add(scrollPane);
  }
}