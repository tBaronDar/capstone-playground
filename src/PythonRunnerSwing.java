import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PythonRunnerSwing extends JFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Run Python Script");
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    JButton runButton = new JButton("Run Python Script");
    JTextArea outputArea = new JTextArea(5, 20);
    outputArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(outputArea);

    runButton.addActionListener(e -> {
      try {
        ProcessBuilder pb = new ProcessBuilder("python", "file.py"); // Adjust path if needed
        Process process = pb.start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
          outputArea.append(line + "\n");
        }

        process.waitFor();
      } catch (Exception ex) {
        outputArea.append("Error: " + ex.getMessage() + "\n");
      }
    });

    frame.add(runButton);
    frame.add(scrollPane);
    frame.setVisible(true);
  }
}
