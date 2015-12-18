/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pranjalmathurframe;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import static java.util.Calendar.PM;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 *
 * @author Vishal
 */
public class Pranjalmathurframe {

    /**
     * @param args the command line arguments
     */
    static JButton pranjal = new JButton();
    static JButton prerna = new JButton() {
        @Override
        protected void paintComponent(Graphics g) {
            g.drawLine(80, 50, 110, 50);
        }
    };

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame() {
            protected void paintComponent(Graphics g) {
                g.drawLine(180, 50, 210, 70);
                repaint();
            }
        };

        frame.setLayout(new GridLayout());
        //frame.add(new JButton());
        //frame.add(new JButton());
        frame.add(pranjal);
        frame.add(prerna);
        
        pranjal.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                pranjal.setText((int)e.getKeyChar() + "");
            }

        });
        pranjal.addMouseListener(new PM());
        prerna.addMouseListener(new PM());
        frame.setSize(400, 120);
        frame.setVisible(true);

    }

    static class PM extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == pranjal) {
                System.out.println("mathur sahab");
            }
//                else if (e.getSource()==prerna)

        }
    }

}
