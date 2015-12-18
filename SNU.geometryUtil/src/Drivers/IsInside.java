/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drivers;

import SNU.geometryUtil.*;
import java.awt.GraphicsEnvironment;
import java.util.Scanner;

/**
 *
 * @author Vishal
 */

public class IsInside {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point point = new Point();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        
       String[] fontnames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
               
        for(int i=0; i<fontnames.length; i++)
            System.out.println(fontnames[i]);
        
        boolean run = true;
        
        while(run){
            System.out.println("Want to check if a given point is in triangle or circle? (1/0)");
            boolean choice = scanner.nextInt()==1;
            if(choice){
                point.setFromUser();
                System.out.println("Check for circle(1) or triangle(0)? (1/0)");
                choice = scanner.nextInt()==1;
                if(choice){
                    circle.setFromUser();
                    System.out.println("Answer is: "+point.isInside(circle));
                }
                else{
                    triangle.setFromUser();
                    System.out.println("Answer is: "+point.isInside(triangle));
                }
            }
            else{
                System.exit(0);
            }
            
            
            System.out.println("Do you want to check more? (1/0): ");  
            run = scanner.nextInt()==1;
        }
    }
}
