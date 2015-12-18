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
public class Q15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int digit = 0;
        String reverse = "";
        System.out.println("Enter the number to be reversed");
        number = scanner.nextInt();
        digit = number;
        while (digit % 10 > 0) {
            reverse = reverse + (digit % 10);
            digit = digit / 10;
        }
        System.out.printf("Reverse of %d is %s\n", number, reverse);
    }
}
