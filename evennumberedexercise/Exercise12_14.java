import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise12_14 extends JFrame {
  JButton jbtRefresh = new JButton("Refresh");
  JLabel[][] jlblNumbers = new JLabel[10][10];
  
  public Exercise12_14() {   
    this.setLayout(new GridLayout(10, 10));
    for (int i = 0; i < 100; i++)
        add(new JLabel("" + (int)(Math.random() * 2), JLabel.CENTER));    
  }
  
  public static void main(String[] args) {
    Exercise12_14 frame = new Exercise12_14();
    frame.setTitle("Exercise12_14");
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}
