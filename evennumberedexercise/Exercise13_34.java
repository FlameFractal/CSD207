import java.awt.*;
import java.util.Arrays;
import javax.swing.*;

public class Exercise13_34 extends JFrame {
  private RandomPolygon newCircle = new RandomPolygon();

  public Exercise13_34() {
    add(newCircle);
  }

  public static void main(String[] args) {
    Exercise13_34 frame = new Exercise13_34();
    frame.setTitle("Exercise13_34");
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class RandomPolygon extends JPanel {
  private int radius = 100;
  private final int SIZE = 5;

  public RandomPolygon() {
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    int[] x = new int[SIZE];
    int[] y = new int[SIZE];
    double[] angles = new double[SIZE];
    for (int i = 0; i < SIZE; i++)
      angles[i] = Math.random() * 2 * Math.PI;

    Arrays.sort(angles);

    for (int i = 0; i < SIZE; i++) {
      x[i] = (int) (radius * Math.cos(angles[i])) + getWidth() / 2;
      y[i] = (int) (radius * Math.sin(angles[i])) + getHeight() / 2;
    }

    g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
    g.drawPolygon(x, y, SIZE);
  }
}
