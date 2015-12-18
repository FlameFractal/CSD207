import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Exercise16_40 extends JFrame {
  private JButton jbtRefresh = new JButton("Refresh");
  private JLabel[][] jlblNumbers = new JLabel[10][10];
  
  public Exercise16_40() {       
    JPanel panel = new JPanel(new GridLayout(10, 10));
    panel.setBorder(new LineBorder(Color.BLACK, 1));
    for (int i = 0; i < 10; i++)
      for (int j = 0; j < 10; j++) {
        panel.add(jlblNumbers[i][j] = new JLabel("" + (int)(Math.random() * 2)));
        jlblNumbers[i][j].setHorizontalAlignment(JLabel.CENTER);
        jlblNumbers[i][j].setForeground(Color.RED);
      }
    
    add(panel);
    
    JPanel panel1 = new JPanel();
    panel1.add(jbtRefresh);
    add(panel1, BorderLayout.SOUTH);
    jbtRefresh.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++)
          for (int j = 0; j < 10; j++) {
            jlblNumbers[i][j].setText("" + (int)(Math.random() * 2));
          }
      }
    });
  }
  
  public static void main(String[] args) {
    Exercise16_40 frame = new Exercise16_40();
    frame.setTitle("Exercise16_40");
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}
