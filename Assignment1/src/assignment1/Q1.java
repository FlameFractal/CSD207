/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float side1, side2, side3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        side1 = scanner.nextFloat();
        System.out.println("Enter second side");
        side2 = scanner.nextFloat();
        System.out.println("Enter third side");
        side3 = scanner.nextFloat();

        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            System.out.println("Triangle possible!");
        } else {
            System.out.println("Triangle NOT possible");
        }
    }

}
