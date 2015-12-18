import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise39_02 extends JApplet  {
  private JButton jbtController = new JButton("Show Controller");
  private JButton jbtView = new JButton("Show View");
  private CircleModel model = new CircleModel();

  public Exercise39_02() {
    setLayout(new FlowLayout());
    add(jbtController);
    add(jbtView);

    jbtController.addActionListener(new ActionListener() {
      @Override 
      public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Controller");
        CircleController controller = new CircleController();
        controller.setModel(model);
        frame.add(controller);
        frame.setSize(200, 200);
        frame.setLocation(200, 200);
        frame.setVisible(true);
      }
    });

    jbtView.addActionListener(new ActionListener() {
      @Override 
      public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("View");
        CircleView view = new CircleView();
        view.setModel(model);
        frame.add(view);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
      }
    });
  }

  public static void main(String[] args) {
    Exercise39_02 applet = new Exercise39_02();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Exercise39_02");
    frame.add(applet, BorderLayout.CENTER);
    frame.setSize(400, 320);
    frame.setVisible(true);
  }
}
