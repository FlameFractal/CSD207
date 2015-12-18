import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise25_16 extends JApplet {
  private HistogramPanel displayArrayPanel = new HistogramPanel();
  private StepControl control = new StepControl();
  private JButton jbtStep = new JButton("Step");
  private JButton jbtReset = new JButton("Reset");
  public final static int ARRAY_SIZE = 20;

  public Exercise25_16() {
    displayArrayPanel.setNumbers(control.getArray());
    JPanel panel = new JPanel();
    panel.add(jbtStep);
    panel.add(jbtReset);
    add(displayArrayPanel, BorderLayout.CENTER);
    add(panel, BorderLayout.SOUTH);

    jbtStep.addActionListener(new ActionListener() {
      @Override 
      public void actionPerformed(ActionEvent e) {
        if (control.step())
          displayArrayPanel.setColoredBarIndex(control.getCurrentIndex());
        else
          JOptionPane.showMessageDialog(null, "The array is already sorted");
      }
    });

    jbtReset.addActionListener(new ActionListener() {
      @Override 
      public void actionPerformed(ActionEvent e) {
        control.reset();
        displayArrayPanel.setColoredBarIndex(-1);
      }
    });
  }

  class StepControl {
    private int[] list = new int[ARRAY_SIZE];

    public int[] getArray() {
      return list;
    }

    StepControl() {
      initializeNumbers();
    }

    public void initializeNumbers() {
      for (int i = 0; i < list.length; i++) {
        list[i] = i + 1;
      }

      // Random shuffle
      for (int i = 0; i < list.length; i++) {
        int index = (int) (Math.random() * ARRAY_SIZE);
        int temp = list[i];
        list[i] = list[index];
        list[index] = temp;
      }
    }

    private int i = 1;
    private int j = 0;
    
    public int getCurrentIndex() {
      return j;
    }

    public void reset() {
      i = 1;
      j = 0;
      initializeNumbers();
    }

    public boolean step() {

      if (i >= list.length)
        return false;

      if (j < list.length - i) {
        if (list[j] > list[j + 1]) {
          // Swap list[i] with list[i + 1]
          int temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
        j++;
      }
      else {
        i++;
        j = 0;
      }

      return true;
    }
  }

  public static void main(String[] args) {
    Exercise25_16 applet = new Exercise25_16();
    JFrame frame = new JFrame();
    // EXIT_ON_CLOSE == 3
    frame.setTitle("Bubble Sort Animation");
    frame.add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(600, 360);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }

  class HistogramPanel extends JPanel {
    private int[] numbers;
    private int coloredBarIndex = -1;

    public void setNumbers(int[] numbers) {
      this.numbers = numbers;
      repaint();
    }

    public void setColoredBarIndex(int index) {
      coloredBarIndex = index;
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
      for (int i = 0; i < numbers.length; i++) {
        g.drawRect((int) (i * unitWidth) + 10, getSize().height
            - (int) ((numbers[i] * 1.0 / max) * height), (int) (unitWidth),
            getSize().height);
        g.drawString(numbers[i] + "", (int) (i * unitWidth) + 10 + 10,
            getSize().height - (int) ((numbers[i] * 1.0 / max) * height) - 10);
      }

      if (coloredBarIndex >= 0) {
        int i = coloredBarIndex;
        g.fillRect((int) (i * unitWidth) + 10, getSize().height
            - (int) ((numbers[i] * 1.0 / max) * height), (int) (unitWidth),
            getSize().height);
      }
    }
  }
}
