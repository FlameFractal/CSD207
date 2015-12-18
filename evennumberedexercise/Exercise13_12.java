import java.awt.*;
import javax.swing.*;

public class Exercise13_12 extends JFrame {
  public Exercise13_12() {
    setLayout(new BorderLayout());
    add(new PlotFunctions(), BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    Exercise13_12 frame = new Exercise13_12();
    frame.setSize(400, 300);
    frame.setTitle("Exercise13_12");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}

class PlotFunctions extends JPanel {
  double f1(double x) {
    return Math.sin(x);
  }

  double f2(double x) {
    return Math.cos(x);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.drawLine(10, 100, 380, 100);
    g.drawLine(200, 30, 200, 190);

    // Draw arrows
    g.drawLine(380, 100, 370, 90);
    g.drawLine(380, 100, 370, 110);
    g.drawLine(200, 30, 190, 40);
    g.drawLine(200, 30, 210, 40);

    // Draw x, y axises
    g.drawString("X", 360, 80);
    g.drawString("Y", 220, 40);
    g.drawString("-\u03c0", 160, 115);
    g.drawString("\u03c0", 220, 115);
    g.drawString("-2\u03c0", 110, 115);
    g.drawString("2\u03c0", 315, 115);
    g.drawString("0", 190, 115);
    
    // Draw sine function
    Polygon p = new Polygon();
    g.setColor(Color.RED);
    for (int x = -175; x <= 175; x++) {
      p.addPoint(x + 200, 100 - (int)(50 * f1((x / 100.0) * 2 * Math.PI)));
    }
    g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
    
    // Draw cosine function
    g.setColor(Color.BLUE);
    p.reset();
    for (int x = -175; x <= 175; x++) {
      p.addPoint(x + 200, 100 - (int)(50 * f2((x / 100.0) * 2 * Math.PI)));
    }
    g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
  }
}
