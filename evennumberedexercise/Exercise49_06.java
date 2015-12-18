import java.awt.*;
import javax.swing.*;

public class Exercise49_06 extends JApplet {
  public Exercise49_06() {
    add(new ShapePanel());   
  }

  class ShapePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      Graphics2D g2d = (Graphics2D)g; // Create Graphics2D

      g2d.translate(150, 20);
      g2d.setFont(new Font("Serif", Font.BOLD, 40));
      
      g2d.rotate(2 * Math.PI / 4);
      g2d.drawString("Java ", 10, 20);
      g2d.drawString("Java ", 10, 60);
      g2d.drawString("Java ", 10, 100);
    }
  }
  
  /** Main method */
  public static void main(String[] args) {
    Exercise49_06 applet = new Exercise49_06();
    applet.init();
    applet.start();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Exercise49_06");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    frame.setSize(250, 160);
    frame.setVisible(true);
  }
}
