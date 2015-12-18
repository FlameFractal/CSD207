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
public class Q12 {

    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int number = input.nextInt();
        System.out.println("Enter the numbers");
        for (int i = 0; i < number; i++) {
            int j = input.nextInt();
            if (isPrimeNumber(j)) {
                count++;
            }
        }
        System.out.println("Number of primes: " + count);
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
