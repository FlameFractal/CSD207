import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Exercise18_32 extends JApplet {
  private JTextField jtfSeconds = new JTextField(5);
  private Timer timer = new Timer(1000, new Listener());
  java.net.URL urlForAudio = getClass().getResource("audio/uk.mid");
  AudioClip audioClip = Applet.newAudioClip(urlForAudio);

  public Exercise18_32() {
    jtfSeconds.setHorizontalAlignment(SwingConstants.CENTER);
    jtfSeconds.setFont(new Font("Times New Roman", Font.BOLD, 50));
    add(jtfSeconds);
    
    jtfSeconds.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        timer.start();
        audioClip.stop();
      }
    });
  }
  
  class Listener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      int remainingMinutes = Integer.parseInt(jtfSeconds.getText());
      jtfSeconds.setText(remainingMinutes - 1 + "");
      if (remainingMinutes - 1 <= 0) {
        timer.stop();
        audioClip.loop();        
      }
    }
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("Exercise18_32");    
    JApplet applet = new Exercise18_32();
    frame.add(applet);
    frame.setSize(210, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
