import java.awt.*;
import javax.swing.*;

public class Exercise13_32 extends JFrame {
  private JLabel jlblMessage = new JLabel("", JLabel.CENTER);
  
  public Exercise13_32(MyRectangle2D r1, MyRectangle2D r2) {
    add(new DrawRectangles(r1, r2));
    add(jlblMessage, BorderLayout.SOUTH);
    
    if (r1.contains(r2) || r2.contains(r1))
      jlblMessage.setText("One rectangle is contained in another");
    else if (r1.overlaps(r2))
      jlblMessage.setText("The rectangles overlap");
    else
      jlblMessage.setText("The rectangles do not overlap");
  }

  /** Main method */
  public static void main(String[] args) {
    // Pass command-line arguments
    if (args.length != 8) {
      System.out.println(
        "Usage: java Exercise14_32 x1 y1 w1 h1 x2 y2 w2 h2");
      System.exit(1);
    }
      
    MyRectangle2D r1 = new MyRectangle2D(
      Integer.parseInt(args[0]), Integer.parseInt(args[1]),
      Integer.parseInt(args[2]), Integer.parseInt(args[3]));

    MyRectangle2D r2 = new MyRectangle2D(
      Integer.parseInt(args[4]), Integer.parseInt(args[5]),
      Integer.parseInt(args[6]), Integer.parseInt(args[7]));    
                
    Exercise13_32 frame = new Exercise13_32(r1, r2);
    frame.setTitle("Exercise13_32");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}

class DrawRectangles extends JPanel { 
  private MyRectangle2D r1, r2;
  
  DrawRectangles(MyRectangle2D r1, MyRectangle2D r2) {
    this.r1 = r1;
    this.r2 = r2;
  }
  
  @Override
  protected void paintComponent(Graphics g) {   
    super.paintComponent(g);

    g.drawRect((int)(r1.getX() - r1.getWidth() / 2), (int)(r1.getY() - r1.getHeight() / 2), 
      (int)(r1.getWidth()), (int)(r1.getHeight()));
    g.drawRect((int)(r2.getX() - r2.getWidth() / 2), (int)(r2.getY() - r2.getHeight() / 2), 
      (int)(r2.getWidth()), (int)(r2.getHeight()));
  }
}
