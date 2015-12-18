import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.*;

public class Exercise49_04 extends JApplet {
  private JButton jbtRotate = new JButton("Rotate");
  private JTextField jtfAngle = new JTextField("0", 4);
  private ShapePanel shapePanel = new ShapePanel();

  public Exercise49_04() {
    JPanel panel = new JPanel();
    panel.add(new JLabel("Angle: "));
    panel.add(jtfAngle);
    panel.add(jbtRotate);
        
    add(shapePanel);   
    add(panel, BorderLayout.SOUTH);
    
    jbtRotate.addActionListener(new ActionListener() {
      @Override 
      public void actionPerformed(ActionEvent e) {
        shapePanel.repaint();
      }
    });
  }

  class ShapePanel extends JPanel {
    //private Shape shape = new Rectangle2D.Double(50, 75, 100, 50);
    
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D)g; // Create Graphics2D
      
      g2d.translate(100, 70);
      g2d.rotate(Double.parseDouble(jtfAngle.getText()) * Math.PI / 180);
      g2d.draw(new Ellipse2D.Double(-30, -20, 60, 40));
    }
  }
  
  /** Main method */
  public static void main(String[] args) {
    Exercise49_04 applet = new Exercise49_04();
    applet.init();
    applet.start();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Exercise49_04");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    frame.setSize(200, 200);
    frame.setVisible(true);
  }
}
