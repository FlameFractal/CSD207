/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author vishalgauba
 */
public class Circle extends JFrame{
    
    JButton start = new JButton("start");
    JButton stop = new JButton("stop");
    newPanel p = new newPanel();
    Circle(){
        this.setLayout(new GridLayout());
        this.add(start);
        this.add(stop);
        this.add(p);
        
        start.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                p.time=0;
            p.timer.start();
            }
        });
        stop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            p.timer.stop();
            }
        });
        
    }
    
    public static void main(String[] args) {
        Circle t = new Circle();
        t.setTitle("LAla");
        t.setLocationRelativeTo(null);
        t.setDefaultCloseOperation(3);
        t.setSize(600, 100);
        t.setVisible(true);
    }
}



class newPanel extends JPanel{
    
    public int time = 1;
    Timer timer;
    newPanel(){
        
        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              time++;
                repaint();
            }
        });
        timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        g.drawString("Time is : "+time, 100, 100);
    }    
    
}

