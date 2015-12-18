import javax.swing.*;

import java.awt.*;

public class Exercise37_08 extends javax.swing.JApplet {
  /** Creates new form Exercise37_08 */
  public Exercise37_08() {
    jSplitPane1 = new javax.swing.JSplitPane(
      JSplitPane.VERTICAL_SPLIT, jSplitPane2 = new JSplitPane(),
      jSplitPane3 = new JSplitPane());

    jSplitPane2.setLeftComponent(figurePanel1);
    jSplitPane2.setRightComponent(figurePanel2);
    jSplitPane3.setLeftComponent(figurePanel3);
    jSplitPane3.setRightComponent(figurePanel4);

    add(jSplitPane1, java.awt.BorderLayout.CENTER);
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private FigurePanel figurePanel4 = new FigurePanel(FigurePanel.LINE);
  private FigurePanel figurePanel3 = new FigurePanel(FigurePanel.RECTANGLE);
  private FigurePanel figurePanel2 = new FigurePanel(FigurePanel.ROUND_RECTANGLE);
  private FigurePanel figurePanel1 = new FigurePanel(FigurePanel.OVAL);

  private javax.swing.JSplitPane jSplitPane3;
  private javax.swing.JSplitPane jSplitPane2;
  private javax.swing.JSplitPane jSplitPane1;
  // End of variables declaration//GEN-END:variables

  public static void main(String[] args) {
    Exercise37_08 applet = new Exercise37_08();
    JFrame frame = new JFrame();
    frame.setTitle("Exercise37_08");
    frame.add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400,320);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}
