import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Exercise25_18 extends JApplet {
  private AnimationPanel animationPanel = new AnimationPanel();
  private JButton jbtStep = new JButton("Step");
  private JButton jbtReset = new JButton("Reset");
  public final static int ARRAY_SIZE = 8;
  private int[] list1 = new int[ARRAY_SIZE];
  private int[] list2 = new int[ARRAY_SIZE];
  private int[] temp = new int[2 * ARRAY_SIZE];
  private int current1 = 0; // Current index in list1
  private int current2 = 0; // Current index in list2
  private int current3 = 0; // Current index in temp

  public Exercise25_18() {
   // animationPanel.setNumbers(control.getArray());
    JPanel panel = new JPanel();
    panel.add(jbtStep);
    panel.add(jbtReset);
    add(animationPanel, BorderLayout.CENTER);
    add(panel, BorderLayout.SOUTH);

    initializeList();
    
    jbtStep.addActionListener(new ActionListener() {
      @Override 
      public void actionPerformed(ActionEvent e) {
        if (step()) {
          animationPanel.repaint();
          JOptionPane.showMessageDialog(null, "The lists are already merged");  
        }
        else {
          animationPanel.repaint();
        }
      }
    });

    jbtReset.addActionListener(new ActionListener() {
      @Override 
      public void actionPerformed(ActionEvent e) {
        reset();
        animationPanel.repaint();
      }
    });
  }

  /** Initialize the list with random numbers */
  public void initializeList() {
    for (int i = 0; i < list1.length; i++) {
      list1[i] = (int)(Math.random() * 999 + 1);
    }
    
    for (int i = 0; i < list2.length; i++) {
      list2[i] = (int)(Math.random() * 999 + 1);
    }
    
    for (int i = 0; i < temp.length; i++) {
      temp[i] = 0;
    }
    
    Arrays.sort(list1);
    Arrays.sort(list2);
  }
  
  /** Start a new sort */
  public void reset() {
    current1 = 0; // Current index in list1
    current2 = 0; // Current index in list2
    current3 = 0; // Current index in temp
    initializeList();
  }

  public boolean step() {    
    if (current1 < list1.length && current2 < list2.length) {
      if (list1[current1] < list2[current2])
        temp[current3++] = list1[current1++];
      else
        temp[current3++] = list2[current2++];
    }
    else if (current1 < list1.length)
      temp[current3++] = list1[current1++];
    else if (current2 < list2.length)
      temp[current3++] = list2[current2++];
    else 
      return true;
    
    return false;
  }

  public static void main(String[] args) {
    Exercise25_18 applet = new Exercise25_18();
    JFrame frame = new JFrame();
    frame.setTitle("Merge Two Sorted Lists");
    frame.add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(650, 280);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }

  class AnimationPanel extends JPanel {
    private int startingX = 20;
    private int startingY = 20;
    private int boxWidth = 30;
    private int boxHeight = 20;
    
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      int x = startingX + 10;
      int y = startingY + 40;         
        
      // Display current1 and list1
      g.drawString("list1", x - 5, y + 15);
      x += 20;
      
      g.drawString("current1", x + current1 * boxWidth, startingY);
      drawArrowLine(g, x + 15 + current1 * boxWidth, startingY, x + 15 + current1 * boxWidth, y);
      for (int k = 0; k < list1.length; k++) {
        g.drawRect(x, y, boxWidth, boxHeight);
        g.drawString(list1[k] + "", x + 5, y + 15);
        x = x + boxWidth;
      }
      
      // Display current2 and list2
      x += 30;
      g.drawString("list2", x - 5, y + 15);

      x +=20;
      g.drawString("current2", x + current2 * boxWidth, startingY);
      drawArrowLine(g, x + 15 + current2 * boxWidth, startingY, x + 15 + current2 * boxWidth, y);
      for (int k = 0; k < list2.length; k++) {
        g.drawRect(x, y, boxWidth, boxHeight);
        g.drawString(list2[k] + "", x + 5, y + 15);
        x = x + boxWidth;
      }   
      
      // Display temp
      x = startingX + 10;
      g.drawString("temp", x - 9, y + 55);
      x += 20;
      g.drawString("current3", x + current3 * boxWidth, y + 120);
      drawArrowLine(g, x + 15 + current3 * boxWidth, y + 100, x + 15 + current3 * boxWidth, y + 40 + boxHeight);
      for (int k = 0; k < temp.length; k++) {
        g.drawRect(x, y + 40, boxWidth, boxHeight);
        if (temp[k] != 0) {
          g.drawString(temp[k] + "", x + 5, y + 55);
        }
        x = x + boxWidth;
      }   
    }
  }
  
  private static void drawArrowLine(Graphics g, int x1, int y1, 
      int x2, int y2) {
    g.drawLine(x1, y1, x2, y2);
    
    // find slope of this line
    double slope = ((((double) y1) - (double) y2))
        / (((double) x1) - (((double) x2)));

    double arctan = Math.atan(slope);

    // This will flip the arrow 45 off of a
    // perpendicular line at pt x2
    double set45 = 1.57 / 2;
    
    // arrows should always point towards i, not i+1
    if (x1 < x2) {
      // add 90 degrees to arrow lines
      set45 = -1.57 * 1.5;
    }

    // set length of arrows
    int arrlen = 15;

    // draw arrows on line
    g.drawLine(x2, y2, (int) ((x2 + (Math.cos(arctan + set45) * arrlen))),
        (int) (((y2)) + (Math.sin(arctan + set45) * arrlen)));

    g.drawLine(x2, y2, (int) ((x2 + (Math.cos(arctan - set45) * arrlen))),
        (int) (((y2)) + (Math.sin(arctan - set45) * arrlen)));
  }
}
