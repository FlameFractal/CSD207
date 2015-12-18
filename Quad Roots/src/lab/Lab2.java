/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Lab2 {
    public static void main(String[] args) {
        
        int x = 0, y = 0, r = 10, eqn = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        x = scanner.nextInt();
        y = scanner.nextInt();
        
        eqn = x*x + y*y - r*r;
        
        if(eqn<0)
            System.out.println("Inside");
        else if (eqn>0)
            System.out.println("Outside the circle");
        else
            System.out.println("On the circle");
        
        
    }
    
}
