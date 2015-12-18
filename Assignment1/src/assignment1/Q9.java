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
public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        int largest = 0;
        int frequency = 0;
        System.out.println("Enter numbers");
        while (input != 0) {
            input = scanner.nextInt();
            if (input > largest) {
                largest = input;
                frequency = 1;
            } else if (input == largest) {
                frequency++;
            }
        }
        System.out.printf("Largest = %d, Frequency = %d\n", largest, frequency);

    }
}
