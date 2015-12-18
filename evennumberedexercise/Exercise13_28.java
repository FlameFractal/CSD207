import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise13_28 extends JFrame {
  private DrawArrowPanel arrow = new DrawArrowPanel();

  public Exercise13_28() {
    getContentPane().add(arrow, BorderLayout.CENTER);
    arrow.setBackground(Color.white);
  }

  public static void drawArrowLine(int x1, int y1, 
      int x2, int y2, Graphics g) {
    g.setColor(Color.red);
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
  

  public static void main(String[] args) {
    JFrame frame = new Exercise13_28();
    frame.setTitle("Exercise13_28");
    frame.setSize(350, 300);
    frame.setLocation(20, 20);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class DrawArrowPanel extends JPanel {  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    int x1 = (int)(Math.random() * (getWidth() - 12));
    int y1 = (int)(Math.random() * (getHeight() - 12));
    int x2 = (int)(Math.random() * (getWidth() - 12));
    int y2 = (int)(Math.random() * (getHeight() - 12));
    
    System.out.println(x1);
    
    Exercise13_28.drawArrowLine(x1, y1, x2, y2, g);
  }
}
