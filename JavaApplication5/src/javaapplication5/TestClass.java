/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import com.sun.glass.events.KeyEvent;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vishalgauba
 */
public class TestClass extends JFrame {

    JButton open = new JButton("Open");
    JButton save = new JButton("Save");
    JButton neww = new JButton("New");
    JButton print = new JButton("Print");

    TestClass() {
        this.setLayout(new GridLayout());
        this.add(open);
        this.add(save);
        this.add(neww);
        this.add(print);
        
        save.setMnemonic(KeyEvent.VK_A);
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "save");
            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        neww.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "new");
            }
        });
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "print");
            }
        });

        open.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e){
                JOptionPane.showMessageDialog(rootPane, "open");
                
            }
        });

    }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.setTitle("LAla");
        t.setLocationRelativeTo(null);
        t.setDefaultCloseOperation(3);
        t.setSize(600, 100);
        t.setVisible(true);
    }

}

class CirclePanel extends JPanel {

    private int radius = 100;

    public void enlarge() {
        radius = radius * 2;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawOval(613, 290, radius * 2, radius * 2);
    }
}
