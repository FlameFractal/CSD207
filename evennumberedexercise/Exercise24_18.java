import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise24_18 extends JApplet {
  private HistogramPanel displayArrayPanel = new HistogramPanel();
  private StepControl control = new StepControl();
  private JTextField jtfKey = new JTextField(4);
  private JButton jbtStep = new JButton("Step");
  private JButton jbtReset = new JButton("Reset");
  public final static int ARRAY_SIZE = 20;

  public Exercise24_18() {
    displayArrayPanel.setNumbers(control.getArray());
    JPanel panel = new JPanel();
    panel.add(new JLabel("Key (in double): "));
    panel.add(jtfKey);
    panel.add(jbtStep);
    panel.add(jbtReset);
    add(displayArrayPanel, BorderLayout.CENTER);
    add(panel, BorderLayout.SOUTH);

    jtfKey.setHorizontalAlignment(JTextField.RIGHT);
    
    jbtStep.addActionListener(new ActionListener() {
      @Override 
      public void actionPerformed(ActionEvent e) {        
        if (jtfKey.isEditable()) {
          control.setKey(Double.parseDouble(jtfKey.getText()));
          jtfKey.setEditable(false);
        }

        displayArrayPanel.setColoredBarIndex(control.low, control.high); // Continue

        int status = control.step();
        
        if (status == 0) {
          // Continue
        } 
        else if (status == 1) {
          JOptionPane.showMessageDialog(null, "The key is found in the array at index " +
            control.getCurrentIndex()); // Found
         }
        else if (status == -1)
          JOptionPane.showMessageDialog(null, "The key is not in the array");
      }
    });

    jbtReset.addActionListener(new ActionListener() {
      @Override 
      public void actionPerformed(ActionEvent e) {
        control.reset();
        displayArrayPanel.setColoredBarIndex(0, -1); // Continue
        // displayArrayPanel.setColoredBarIndex(-1);
      }
    });
  }

  class StepControl {
    private int[] list = new int[ARRAY_SIZE];
    private double key = 4.5;
    
    public int[] getArray() {
      return list;
    }
    
    public void setKey(double key) {
      this.key = key;
    }

    StepControl() {
      initializeNumbers();
    }

    public void initializeNumbers() {
      for (int i = 0; i < list.length; i++) {
        list[i] = i + 1;
      }
    }

    boolean done = false;
    
    public int getCurrentIndex() {
      return mid;
    }

    public void reset() {
      low = 0;
      high = list.length - 1;
      done = false;
      jtfKey.setEditable(true);
    }
    
    int low = 0;
    int high = list.length - 1;
    int mid = (low + high) / 2;
    
    public int step() {
      if (done) return 1;
      
      if (low > high)
        return -1;

      mid = (low + high) / 2;
      if (key == list[mid]) {
        done = true;
        return 1;
      }
      else if (key > list[mid]) {
        low = mid + 1; // Continue to search the second half
        return 0;
      }      
      else { // key < list[mid] 
        high = mid - 1; // Continue to search the first half
        return 0;
      }      
    }
  }

  public static void main(String[] args) {
    Exercise24_18 applet = new Exercise24_18();
    JFrame frame = new JFrame();
    // EXIT_ON_CLOSE == 3
    frame.setTitle("Binary Search Animation");
    frame.add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(500, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }

  class HistogramPanel extends JPanel {
    private int[] numbers;
    private int low = 0; 
    private int high = -1; // Don't display the low and high area initially

    public void setNumbers(int[] numbers) {
      this.numbers = numbers;
      repaint();
    }

    public void setColoredBarIndex(int low, int high) {
      this.low = low;
      this.high = high;
      repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      // Find maximum integer
      int max = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
        if (max < numbers[i]) {
          max = numbers[i];
        }
      }

      int height = (int) (getSize().height * 0.88);
      int width = getSize().width - 20;
      int unitWidth = (int) (width * 1.0 / numbers.length);

      g.setColor(Color.LIGHT_GRAY);
      for (int i = low; i <= high; i++) {
        g.fillRect((int) (i * unitWidth) + 10, getSize().height
            - (int) ((numbers[i] * 1.0 / max) * height), (int) (unitWidth),
            getSize().height);
      }      
      g.setColor(Color.BLACK);
      
      // Paint the mid bar
      int mid = (low + high) / 2; // Don't display the mid bar initially
      if (high != -1) {
        int i = mid;
        g.fillRect((int) (i * unitWidth) + 10, getSize().height
            - (int) ((numbers[i] * 1.0 / max) * height), (int) (unitWidth),
            getSize().height);
      }
      
      for (int i = 0; i < numbers.length; i++) {
        g.drawRect((int) (i * unitWidth) + 10, getSize().height
            - (int) ((numbers[i] * 1.0 / max) * height), (int) (unitWidth),
            getSize().height);
        g.drawString(numbers[i] + "", (int) (i * unitWidth) + 10 + 10,
            getSize().height - (int) ((numbers[i] * 1.0 / max) * height) - 10);
      }
    }
  }
}
