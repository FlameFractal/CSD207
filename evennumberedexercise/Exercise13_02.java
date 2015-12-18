import javax.swing.*;
import java.awt.*;

public class Exercise13_02 extends JFrame {
  // Create two buttons
  private OvalButton jbtOk = new OvalButton("OK");
  private OvalButton jbtCancel = new OvalButton("Cancel");

  /** Default constructor */
  public Exercise13_02() {
    // Set FlowLayout manager to arrange the components
    // inside the frame
    setLayout(new FlowLayout());

    // Add buttons to the frame
    add(jbtOk);
    add(jbtCancel);
  }

  /** Main method */
  public static void main(String[] args) {
    Exercise13_02 frame = new Exercise13_02();
    frame.setTitle("Exercise13_02");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(100, 80);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}

class OvalButton extends JButton {
  public OvalButton() {
  }

  public OvalButton(String text) {
    super(text);
  }

  @Override
  protected void paintComponent(Graphics g) {
    // Draw an oval
    super.paintComponent(g);
    g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
  }

  /** Override get method for preferredSize */
  public Dimension getPreferredSize() {
    return new Dimension(100, 50);
  }

  /** Override get method for minimumSize */
  public Dimension getMinimumSize() {
    return new Dimension(100, 50);
  }
}
