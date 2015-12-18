/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drivers;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author vishalgauba
 */
public class ButtonTest extends JFrame{

    ButtonTest() {
       JPanel panel = new JPanel();
       panel.add(new JButton());
       add(panel);
    }

    public static void main(String[] args) {
        
        ButtonTest bt = new ButtonTest();
        bt.setSize(100,100);
        bt.setDefaultCloseOperation(3);
        bt.setVisible(true);

    }
    
}




