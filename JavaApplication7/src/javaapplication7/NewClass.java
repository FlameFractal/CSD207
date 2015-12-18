/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author vishalgauba
 */
public class NewClass extends JFrame{
   
  private newPanel hangman = new newPanel();
  
  public NewClass() {   
    //this.add(hangman);
  }
  
  public static void main(String[] args) {
    Ass2Q1 frame = new Ass2Q1();
    frame.setTitle("Hew calss");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setVisible(true);
  }
  
  class newPanel extends JPanel {
    int palindromeRadius = 150;
    int ballRadius = 10;
    int leftAngle = 100;
    int rightAngle = 60;
    int angle = leftAngle; 
    int angleDelta = 60; 
    int delay = 100;
    
    
    newPanel() {
       
      setFocusable(true);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
      
        
      //method taken from exercise answers  
        
        
      super.paintComponent(g);
      
      g.drawArc(20, 200, 80, 40, 0, 180); // Draw the base
      g.drawLine(20 + 40, 200, 20 + 40, 20); // Draw the pole
      g.drawLine(20 + 40, 20, 20 + 40 + 100, 20); // Draw the hanger

//      if (angle < rightAngle)
//        angleDelta = 1; // Swing to the left
//      else if (angle > leftAngle)
//        angleDelta = -1; // Swing to the right
//            
//      angle += angleDelta;
//
//      int x1 = 20 + 40 + 100;
//      int y1 = 20;
//      int radius = 20;
//      int x = x1 + (int)(radius * Math.cos(Math.toRadians(angle)));
//      int y = y1 + (int)(radius * Math.sin(Math.toRadians(angle)));
//      g.drawLine(20 + 40 + 100, 20, x, y); // Draw the hanger
//
//      // Draw the circle
//      double length = 20 + 20;
//      x = x1 + (int)(length * Math.cos(Math.toRadians(angle)));
//      y = y1 + (int)(length * Math.sin(Math.toRadians(angle)));      
//      g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius); // Draw the hanger
//
//      // Draw the left arm      
//      length = distance(x1, y1, 
//          20 + 40 + 100 - (int)(radius * Math.cos(Math.toRadians(45))),
//          40 + radius + (int)(radius * Math.sin(Math.toRadians(45))));    
//      double angle1 = Math.toDegrees(Math.asin(
//          radius * Math.cos(Math.toRadians(45)) / length));
//      int x2 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
//      int y2 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1)));      
//      
//      length = (int)distance(x1, y1, 
//          20 + 40 + 100 - 60, 40 + radius + 60);
//      angle1 = Math.toDegrees(Math.asin(60 / length));
//      int x3 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
//      int y3 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1)));      
//     
//      g.drawLine(x2, y2, x3, y3);
//      
//      // Draw the right arm
//      length = distance(x1, y1, 
//          20 + 40 + 100 + (int)(radius * Math.cos(Math.toRadians(45))),
//          40 + radius + (int)(radius * Math.sin(Math.toRadians(45))));    
//      angle1 = - Math.toDegrees(Math.asin(
//          radius * Math.cos(Math.toRadians(45)) / length));
//      x2 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
//      y2 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1)));      
//      
//      length = (int)distance(x1, y1, 
//          20 + 40 + 100 + 60, 40 + radius + 60);
//      angle1 = -Math.toDegrees(Math.asin(60 / length));
//      x3 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
//      y3 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1))); 
//      
//      g.drawLine(x2, y2, x3, y3);
//
//      // Draw the body
//      length = 40 + 20;
//      x2 = x1 + (int)(length * Math.cos(Math.toRadians(angle)));
//      y2 = y1 + (int)(length * Math.sin(Math.toRadians(angle)));
//      
//      length = 40 + 20 + 60;
//      x3 = x1 + (int)(length * Math.cos(Math.toRadians(angle)));
//      y3 = y1 + (int)(length * Math.sin(Math.toRadians(angle)));
//      
//      g.drawLine(x2, y2, x3, y3);
//
//      // Draw the left leg
//      length = distance(x1, y1, 
//          20 + 40 + 100 - 40, 40 + radius + 80 + 40);     
//      angle1 = Math.toDegrees(Math.asin(
//          40.0 / length));
//      int x4 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
//      int y4 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1)));            
//      g.drawLine(x3, y3, x4, y4);
//
//      // Draw the right leg
//      angle1 = -Math.toDegrees(Math.asin(
//          40.0 / length));
//      x4 = x1 + (int)(length * Math.cos(Math.toRadians(angle + angle1)));
//      y4 = y1 + (int)(length * Math.sin(Math.toRadians(angle + angle1)));            
//      g.drawLine(x3, y3, x4, y4);
//    }
//  }
  
  /** Compute the distance between two points (x1, y1) and (x2, y2)*/
//  public static double distance(
//      double x1, double y1, double x2, double y2) {
//    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//  }


    }
  }
}
