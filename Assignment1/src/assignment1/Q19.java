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
public class Q19 {

    public static int factorial(int i) {
        int fact = 1;
        if (i == 0) {
            return fact;
        } else if (i != 0) {
            for (int j = i; j >= 1; j--) {
                fact = fact * j;
            }

        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        String a = input.nextLine();
        int j = a.length();

        int sum = 0;
        int k = Integer.parseInt(a);
        int l = k;
        for (int i = 1; i <= j; i++) {

            int p = k % 10;
            sum = sum + factorial(p);

            k = k / 10;

        }

        if (sum == 145) {
            System.out.println("IS a Strong number");

        } else {
            System.out.println("NOT a Strong number");
        }

    }

}
