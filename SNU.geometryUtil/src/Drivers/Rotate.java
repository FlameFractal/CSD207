/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drivers;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Junaid
 */
public class Rotate extends JFrame {

    myPanel panel = new myPanel();
    int delta = 0;

    public Rotate() {
        setLayout(new BorderLayout());
        this.add(panel);
        panel.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("ASdasd");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
//        panel.setFocusable(true);
    }

    public class myPanel extends JPanel {

        int length = 200;
        int angle1 = 90, angle2 = 210, angle3 = 330;

        public void myPanel() {
            
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            
            int x1 = this.getWidth() / 2;
            int y1 = this.getHeight() / 2;
            int dis = 60;

            int x2 = x1 + (int) (dis * Math.cos(Math.toRadians(angle1 + delta)));
            int y2 = y1 + (int) (dis * Math.sin(Math.toRadians(angle1 + delta)));

            int x3 = x1 + (int) (dis * Math.cos(Math.toRadians(angle2 + delta)));
            int y3 = y1 + (int) (dis * Math.sin(Math.toRadians(angle2 + delta)));

            int x4 = x1 + (int) (dis * Math.cos(Math.toRadians(angle3 + delta)));
            int y4 = y1 + (int) (dis * Math.sin(Math.toRadians(angle3 + delta)));

            g.drawLine(x2, y2, x3, y3);
            g.drawLine(x3, y3, x4, y4);
            g.drawLine(x4, y4, x2, y2);

        }

    }


    public static void main(String[] args) {

        Rotate frame = new Rotate();
        frame.setTitle("Rotate");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
