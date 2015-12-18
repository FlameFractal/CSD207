/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author vishalgauba
 */
public class NewClass extends JFrame {

    static Graphics g;

    public NewClass() {

    }

    void fill() {
        g.fillPolygon(new int[]{10, 50, 90, 10}, new int[]{20, 80, 60, 20}, 4);
        g.drawPolygon(new int[]{10, 50, 90, 10}, new int[]{20, 80, 60, 20}, 4);
        g.drawPolygon(new int[]{20, 80, 60, 20}, new int[]{10, 50, 90, 10}, 4);
        repaint();
    }

    public static void main(String[] args) {
        NewClass t = new NewClass();
        t.setTitle("LAla");
        t.setLocationRelativeTo(null);
        t.setDefaultCloseOperation(3);
        t.setSize(600, 100);
        t.setVisible(true);
    }

}

class newpanel extends JPanel {

    newpanel() {
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                fill();
            }

        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.repaint();
        NewClass.g = g;
        g.drawPolygon(new int[]{10, 50, 90, 10}, new int[]{20, 80, 60, 20}, 4);

    }

}
