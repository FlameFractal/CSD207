import java.awt.*;
import javax.swing.*;

public class Exercise12_12 extends JFrame {
  public Exercise12_12() {   
    ImageIcon us = new ImageIcon("image/usIcon.gif");
    ImageIcon uk = new ImageIcon("image/ukIcon.gif");
    ImageIcon china = new ImageIcon("image/chinaIcon.gif");
    ImageIcon ca = new ImageIcon("image/caIcon.gif");
    
    setLayout(new GridLayout(1, 4));
    
    JLabel jlbl1 = new JLabel("US", us, JLabel.CENTER);
    jlbl1.setHorizontalTextPosition(JLabel.CENTER);
    jlbl1.setVerticalTextPosition(JLabel.BOTTOM);
    add(jlbl1);  
    
    JLabel jlbl2 = new JLabel("US", us, JLabel.CENTER);
    jlbl2.setHorizontalTextPosition(JLabel.RIGHT);
    add(jlbl2); 

    JLabel jlbl3 = new JLabel("US", us, JLabel.CENTER);
    jlbl3.setHorizontalTextPosition(JLabel.LEFT);
    add(jlbl3); 

    JLabel jlbl4 = new JLabel("US", us, JLabel.CENTER);
    jlbl4.setHorizontalTextPosition(JLabel.CENTER);
    jlbl4.setVerticalTextPosition(JLabel.TOP);
    add(jlbl4);   
  }

  public static void shuffle(int[] list) {
    for (int i = 0; i < list.length; i++) {
      // Generate an index randomly
      int index = (int)(Math.random() * list.length);
     
      // Swap myList[i] with myList[index]
      int temp =list[i];
      list[i] = list[index]; 
      list[index] = temp;
    }
  }
  
  public static void main(String[] args) {
    Exercise12_12 frame = new Exercise12_12();
    frame.setTitle("Exercise12_12");
    frame.setSize(300, 170);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}
