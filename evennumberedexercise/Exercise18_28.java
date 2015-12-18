import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Exercise18_28 extends JApplet {
  private Circle2D circle1 = new Circle2D(50, 50, 30);
  private Circle2D circle2 = new Circle2D(90, 50, 20);

  private JTextField jtfCenterx1 = new JTextField(circle1.getX() + "");
  private JTextField jtfCenterx2 = new JTextField(circle2.getX() + "");
  private JTextField jtfCentery1 = new JTextField(circle1.getX() + "");
  private JTextField jtfCentery2 = new JTextField(circle1.getX() + "");
  private JTextField jtfRadius1 = new JTextField(circle1.getRadius() + "");
  private JTextField jtfRadius2 = new JTextField(circle2.getRadius() + "");
  private JButton jbtRedraw = new JButton("Redraw Circles");
  
  private JLabel jlblStatus = new JLabel("Two circles intersect? " +
    (circle1.overlaps(circle2) ? "Yes" : "No"), JLabel.CENTER);

  private PaintPanel paintPanel = new PaintPanel();
  
  public Exercise18_28() {
    JPanel p1 = new JPanel(new GridLayout(3, 2));
    p1.setBorder(new TitledBorder("Enter circle 1 info"));
    p1.add(new JLabel("Center x:"));
    p1.add(jtfCenterx1);
    p1.add(new JLabel("Center y:"));
    p1.add(jtfCentery1);
    p1.add(new JLabel("Radius:"));
    p1.add(jtfRadius1);
    
    JPanel p2 = new JPanel(new GridLayout(3, 2));
    p2.setBorder(new TitledBorder("Enter circle 2 info"));
    p2.add(new JLabel("Center x:"));
    p2.add(jtfCenterx2);
    p2.add(new JLabel("Center y:"));
    p2.add(jtfCentery2);
    p2.add(new JLabel("Radius:"));
    p2.add(jtfRadius2);
    
    JPanel p3 = new JPanel(new GridLayout(1, 2));    
    p3.add(p1);
    p3.add(p2);
    
    JPanel p4 = new JPanel(new BorderLayout());    
    p4.add(p3, BorderLayout.CENTER);    
    p4.add(jbtRedraw, BorderLayout.SOUTH);
    
    add(jlblStatus, BorderLayout.NORTH);
    add(p4, BorderLayout.SOUTH);
    add(paintPanel, BorderLayout.CENTER);

    jbtRedraw.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        circle1.setX(Double.parseDouble(jtfCenterx1.getText()));
        circle1.setY(Double.parseDouble(jtfCentery1.getText()));
        circle1.setRadius(Double.parseDouble(jtfRadius1.getText()));
        circle2.setX(Double.parseDouble(jtfCenterx2.getText()));
        circle2.setY(Double.parseDouble(jtfCentery2.getText()));
        circle2.setRadius(Double.parseDouble(jtfRadius2.getText()));
        jlblStatus.setText("Two circles intersect? " +
            (circle1.overlaps(circle2) ? "Yes" : "No"));

        paintPanel.repaint();
      }
    });
    
    this.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent e) {
        if (circle1.contains(e.getX(), e.getY())) {
          jtfCenterx1.setText(e.getX() + "");
          jtfCentery1.setText(e.getY() + "");
          circle1.setX(e.getX());
          circle1.setY(e.getY());
          updateCircles();
        }
        else if (circle2.contains(e.getX(), e.getY())) {
          jtfCenterx2.setText(e.getX() + "");
          jtfCentery2.setText(e.getY() + "");
          circle2.setX(e.getX());
          circle2.setY(e.getY());
          updateCircles();        
        }
      }
    });
  }
  
  private void updateCircles() {
    jlblStatus.setText("Two circles intersect? " +
        (circle1.overlaps(circle2) ? "Yes" : "No"));

    paintPanel.repaint();
  }

  class PaintPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      g.drawString("c1", (int)(circle1.getX()), (int)(circle1.getY()));
      g.drawString("c2", (int)(circle2.getX()), (int)(circle2.getY()));
      
      g.drawOval((int)(circle1.getX() - circle1.getRadius()), 
        (int)(circle1.getY() - circle1.getRadius()),
        (int)(2 * circle1.getRadius()),
        (int)(2 * circle1.getRadius()));

      g.drawOval((int)(circle2.getX() - circle2.getRadius()), 
        (int)(circle2.getY() - circle2.getRadius()),
        (int)(2 * circle2.getRadius()),
        (int)(2 * circle2.getRadius()));
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Exercise18_28");
    JApplet applet = new Exercise18_28();
    frame.add(applet);
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
