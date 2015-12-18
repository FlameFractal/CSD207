/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Vishal
 */
public class GUI extends JApplet {

    stringPanel p = new stringPanel();
    JPanel jp = new JPanel();
    int font = 20;
    int x = 100;
    JButton btn = new JButton();
    Color color;
    int r,g,b;

    GUI(String title) {
        
        super();
        r=0;b=0;g=0;
        setSize(500, 500);
       // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        add(p);
        jp.setLayout(new BorderLayout());
        jp.add(btn, BorderLayout.CENTER);
//        add(jp);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                font = font + 10;
                
                repaint();
            }
        });

//        p.setPreferredSize(new Dimension(100, 100));
//        add(new JButton("asd"));
//        add(new JButton("asd"));
//        add(new JButton("Asdas"));
        setVisible(true);

    }

    class stringPanel extends JPanel {

        stringPanel() {
            setFocusable(true);
            addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {

                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_UP:
                            System.out.println("1");
                            //font = font + 10;
                            color = new Color(r+10,g+10,b+10);
                            
                            repaint();
                            break;
                        case KeyEvent.VK_DOWN:
                            System.out.println("2");
                            font -=10;
                            repaint();
                            break;
                        case KeyEvent.VK_LEFT:
                            System.out.println("3");
                            x -=10;
                            repaint();
                            break;
                        case KeyEvent.VK_RIGHT:
                            System.out.println("4");
                            x +=10;
                            repaint();
                            break;
                        default:
                            System.out.println(e.getKeyCode());
                    }

                }
            });
            setFocusable(true);
          //  setAutoRequestFocus(true);

        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
            g.drawString("Hello World", x, 150);
            setFont(new Font("TimesRoman", Font.PLAIN, font));
            g.setColor(color);
        }

    }

//    public static void main(String[] args) {
//        JFrame frame = new GUI("graded lab 4");
//        frame.setVisible(true);
//
//    }

}
