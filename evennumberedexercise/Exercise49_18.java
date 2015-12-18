import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise49_18 extends JApplet {
  public Exercise49_18() {
    add(new StopSignPanel());
  }

  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JApplet applet = new Exercise49_18();
    frame.add(applet);
    frame.setTitle("Exercise49_18");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }

  // Draw a polygon in the panel
  class StopSignPanel extends JPanel {
    private int radius = 60; // Initial radius;
    private double scale = 1.0;
    private double theta = 0;
    
    public StopSignPanel() {
      this.setFocusable(true);
      
      this.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          if (e.isControlDown() && e.getKeyCode() == 61) {
            scale = 1.1 * scale;
            repaint();
          }
          else if (e.isControlDown() && e.getKeyCode() == 45) {
            scale = 0.9 * scale;
            repaint();
          }
          else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            theta += Math.PI / 18;
            repaint();
          }            
          else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            theta -= Math.PI / 18;
            repaint();
          }          
        }
      });
      
      this.addMouseMotionListener(new MouseMotionAdapter() {
        public void mouseDragged(MouseEvent e) {
          scale = scale * 1.1;
          repaint();
        }
      });
    }
    
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      Graphics2D g2d = (Graphics2D)g;
  
      int xCenter = getWidth() / 2;
      int yCenter = getHeight() / 2;  
      
      g2d.translate(xCenter, yCenter);
      g2d.scale(scale, scale);
      g2d.rotate(theta);
  
      // Create a Polygon object
      Polygon polygon = new Polygon();
  
      // Add points to the polygon
      for (int i = 0; i < 8; i++) {
        polygon.addPoint((int)(radius * Math.cos(i * 2 * Math.PI / 8 + 2 * Math.PI / 16)), 
          (int)(-radius * Math.sin(i * 2 * Math.PI / 8 + 2 * Math.PI / 16)) );
      }
      
      // Draw the polygon
      g2d.setColor(Color.RED);
      g2d.fillPolygon(polygon);
  
      g2d.setFont(new Font("Arial Black", Font.BOLD, 30));
  
      // Get font metrics for the current font
      FontMetrics fm = g2d.getFontMetrics();
  
      // Find the center location to display
      int stringWidth = fm.stringWidth("STOP");
      int stringAscent = fm.getAscent();
  
      // Get the position of the leftmost character in the baseline
      int xCoordinate = -stringWidth / 2;
      int yCoordinate = stringAscent / 2;
  
      g2d.setColor(Color.WHITE);
      g2d.drawString("STOP", xCoordinate, yCoordinate);
    }
  }
}
