import java.awt.*;
import javax.swing.*;

public class Exercise15_24 extends JFrame {
  public Exercise15_24() {
    add(new MandelbrotCanvas());
  }

  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new Exercise15_24();
    frame.setTitle("Exercise15_24");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}

class MandelbrotCanvas extends JPanel {
  final static int COUNT_LIMIT = 60;
  
  @Override /** Paint a Mandelbrot image */
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    for (double x = -2.0; x < 2.0; x += 0.01)
      for (double y = -2.0; y < 2.0; y += 0.01) {
        int c = count(new Complex(x, y));
        if (c == COUNT_LIMIT) 
          g.setColor(Color.BLACK); // c is in a Mandelbrot set
        else 
          g.setColor(new Color(
            c * 77 % 256, c * 58 % 256, c * 159 % 256));
                
        g.drawRect((int)(x * 100) + 200, (int)(y * 100) + 200, 
          1, 1); // Fill the rectangle with the specified color 
      }
  }
  
  /** Returns the iteration count */
  static int count(Complex c) {
    Complex z = new Complex(0, 0); // z0
    
    for (int i = 0; i < COUNT_LIMIT; i++) {
      z = z.multiply(z).add(c); // Get z1, z2, ...
      if (z.abs() > 2) return i; // The sequence is unbounded
    }
    
    return COUNT_LIMIT; // Indicates a bounded sequence
  }
}
