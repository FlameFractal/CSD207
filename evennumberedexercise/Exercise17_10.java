import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise17_10 extends JFrame {
  private JTextField jtfRed = new JTextField(3);
  private JTextField jtfBlue = new JTextField(3);
  private JTextField jtfGreen = new JTextField(3);
  MandelbrotCanvas canvas = new MandelbrotCanvas();
  
  public Exercise17_10() {
    JPanel panel = new JPanel();
    
    add(canvas);
    panel.add(new JLabel("Red factor: "));
    panel.add(jtfRed);
    panel.add(new JLabel("Blue factor: "));
    panel.add(jtfBlue);
    panel.add(new JLabel("Green factor: "));
    panel.add(jtfGreen);
    add(panel, BorderLayout.SOUTH);
    
    jtfRed.setText("77");
    jtfRed.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        canvas.setK1(Integer.parseInt(jtfRed.getText().trim()));
        canvas.repaint();
      }
    });
    
    jtfBlue.setText("58");
   jtfBlue.addActionListener(new ActionListener() {
     @Override
      public void actionPerformed(ActionEvent e) {
        canvas.setK1(Integer.parseInt(jtfBlue.getText().trim()));
        canvas.repaint();
      }
    });
    
   jtfGreen.setText("159");
    jtfGreen.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        canvas.setK1(Integer.parseInt(jtfGreen.getText().trim()));
        canvas.repaint();
      }
    });
  }

  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new Exercise17_10();
    frame.setTitle("Exercise17_10");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}

class MandelbrotCanvas extends JPanel {
  final static int COUNT_LIMIT = 100;
  private int k1 = 77;
  private int k2 = 58;
  private int k3 = 15;
  
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
            c * k1 % 256, c * k2 % 256, c * k3 % 256));
                
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
  
  public void setK1(int k1) {
    this.k1 = k1;
  }
  
  public void setK2(int k2) {
    this.k2 = k2;
  }
  
  public void setK3(int k3) {
    this.k3 = k3;
  }
}
