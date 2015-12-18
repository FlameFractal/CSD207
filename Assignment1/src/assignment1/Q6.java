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
public class Q6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int decimal, bit;
        String binary = "";
        System.out.println("Enter decimal number");
        decimal = scanner.nextInt();
        while (decimal > 0) {
            bit = decimal % 2;
            decimal = decimal / 2;
            binary = bit + binary;
        }

        System.out.println(binary);

    }
}
