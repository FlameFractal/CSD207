package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class rotate2 extends JPanel {

    int cx, cy, side, radius, delta;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        cx = getWidth() / 2;
        cy = getHeight() / 2;
        radius = (int) (side / Math.sqrt(2));
        
        int angle1=135, angle2=45, angle3=315, angle4=225;

        int x1 = cx + (int) (radius * Math.cos(Math.toRadians(angle1 + delta)));
        int y1 = cy + (int) (radius * Math.sin(Math.toRadians(angle1 + delta)));

        int x2 = cx + (int) (radius * Math.cos(Math.toRadians(angle2 + delta)));
        int y2 = cy + (int) (radius * Math.sin(Math.toRadians(angle2 + delta)));

        int x3 = cx + (int) (radius * Math.cos(Math.toRadians(angle3 + delta)));
        int y3 = cy + (int) (radius * Math.sin(Math.toRadians(angle3 + delta)));

        int x4 = cx + (int) (radius * Math.cos(Math.toRadians(angle4 + delta)));
        int y4 = cy + (int) (radius * Math.sin(Math.toRadians(angle4 + delta)));

        
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x4, y4);
        g.drawLine(x4, y4, x1, y1);


    }

    rotate2() {
        delta = 0;
        side = 100;
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e); //To change body of generated methods, choose Tools | Templates.
                switch(e.getKeyCode()){
                    case KeyEvent.VK_RIGHT: delta = delta + 10;
                        break;
                    case KeyEvent.VK_LEFT: delta = delta - 10;
                        break;
                    case KeyEvent.VK_UP: side = side + 10;
                        break;
                    case KeyEvent.VK_DOWN: side = side - 10;
                }
                System.out.println(e.getKeyCode());
                repaint();
            }
        });
        setFocusable(true);
        setRequestFocusEnabled(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("lalala");
        rotate2 panel = new rotate2();
        panel.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

}
