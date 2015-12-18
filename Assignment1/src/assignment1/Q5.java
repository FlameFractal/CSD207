/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author vishalgauba
 */
public class Q5 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x coordinate of center of Circle1: ");
        double X1 = input.nextDouble();

        System.out.print("Enter y coordinate of center of Circle1: ");
        double Y1 = input.nextDouble();

        System.out.print("Enter radius of Circle1: ");
        double R1 = input.nextDouble();

        System.out.print("Enter x coordinate of center of Circle2: ");
        double X2 = input.nextDouble();

        System.out.print("Enter y coordinate of center of Circle2: ");
        double Y2 = input.nextDouble();

        System.out.print("Enter radius of Circle2: ");
        double R2 = input.nextDouble();

        double dist = Math.pow((Math.pow((X1 - X2), 2) + Math.pow((Y1 - Y2), 2)), 0.5);
        if (R2 > R1 && dist <= (R2 - R1)) {
            System.out.println("Circle 1 is inside Circle 2.");
        } else if (R1 > R2 && dist <= (R1 - R2)) {
            System.out.println("Circle 2 is inside Circle 1.");
        } else if (dist > (R2 + R1)) {
            System.out.println("Circle 2 does not overlap Circle 1.");
        } else {
            System.out.println("Circle 2 overlaps Circle 1.");
        }
    }

    
}
