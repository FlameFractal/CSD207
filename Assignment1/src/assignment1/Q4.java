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
public class Q4 {

    public static void main(String[] args) {

        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = scanner.nextInt();
        System.out.println("Enter second number");
        num2 = scanner.nextInt();

        System.out.println("HCF of " + num1 + " & " + num2 + " is " + findHCF(num1, num2));
        System.out.println("LCM of " + num1 + " & " + num2 + " is " + findLCM(num1, num2, findHCF(num1, num2)));

    }

    public static int findHCF(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return findHCF(b % a, a);
        }
    }

    public static int findLCM(int a, int b, int hcf) {
        return (a * b) / hcf;
    }

}
