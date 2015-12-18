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
public class Q11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        int d = 0;
        if (n1 > n2) {
            d = n2;
        } else {
            d = n1;
        }
        int gcd = 0;
        for (int i = d; i >= 1; i--) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                gcd = i;
                break;
            }
        }
        System.out.println("GCD is " + gcd);
    }

}
