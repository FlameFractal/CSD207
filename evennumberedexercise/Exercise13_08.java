import java.awt.*;
import javax.swing.*;

public class Exercise13_08 extends JFrame {
  public static void main(String[] args) {
    JFrame frame = new Exercise13_08();
    frame.setSize(300, 300);
    frame.setTitle("Exercise13_08");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }

  public Exercise13_08() {
    add(new OctagonPanel());
  }
}

class OctagonPanel extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    int radius =
      (int) (Math.min(getWidth(), getHeight()) * 0.4);

    // Create a Polygon object
    Polygon polygon = new Polygon();

    // Add points to the polygon
    polygon.addPoint(xCenter + radius, yCenter);
    polygon.addPoint((int)(xCenter + radius * Math.cos(2 * Math.PI / 8)),
      (int)(yCenter - radius * Math.sin(2 * Math.PI / 8)));
    polygon.addPoint((int)(xCenter + radius * Math.cos(2 * 2 * Math.PI / 8)),
      (int)(yCenter - radius * Math.sin(2 * 2 * Math.PI / 8)));
    polygon.addPoint((int)(xCenter + radius * Math.cos(3 * 2 * Math.PI / 8)),
      (int)(yCenter - radius * Math.sin(3 * 2 * Math.PI / 8)));
    polygon.addPoint((int)(xCenter + radius * Math.cos(4 * 2 * Math.PI / 8)),
      (int)(yCenter - radius * Math.sin(4 * 2 * Math.PI / 8)));
    polygon.addPoint((int)(xCenter + radius * Math.cos(5 * 2 * Math.PI / 8)),
      (int)(yCenter - radius * Math.sin(5 * 2 * Math.PI / 8)));
    polygon.addPoint((int)(xCenter + radius * Math.cos(6 * 2 * Math.PI / 8)),
      (int)(yCenter - radius * Math.sin(6 * 2 * Math.PI / 8)));
    polygon.addPoint((int)(xCenter + radius * Math.cos(7 * 2 * Math.PI / 8)),
      (int)(yCenter - radius * Math.sin(7 * 2 * Math.PI / 8)));

    // Draw the polygon
    g.drawPolygon(polygon);
  }
}
