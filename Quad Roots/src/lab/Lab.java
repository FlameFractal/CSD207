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
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a=0,b=0,c=0;
        int disc, root1, root2;
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter coefficient of x^2 ");
        a = inp.nextInt();
        System.out.println("Enter coefficient of x ");
        b = inp.nextInt();        
        System.out.println("Enter constant ");
        c = inp.nextInt();
        
        disc = (int) (Math.pow(b,2) - 4*a*c);
        
        if(disc==0){
            root1 = (int) ((-b + Math.abs(Math.pow(disc, 0.5)))/2*a);
            System.out.println("Real and equal roots = "+root1);
        }
        else if (disc>0){
            root1 = (int) ((-b + Math.pow(disc, 0.5))/2*a);
            root2 = (int) ((-b - Math.pow(disc,0.5))/2*a);
            System.out.println("Real and distinct roots = " +root1+" and "+root2);
        }
            
        else
            System.out.println("Imaginary roots");
        
        // TODO code application logic here
    }
    
}
