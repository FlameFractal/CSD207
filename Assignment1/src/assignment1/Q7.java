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
public class Q7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number");

        int num = input.nextInt();
        int dec = 0;
        String hex = "";

        for (int i = num; i >= 1;) {
            dec = i % 16;

            if (dec != 15 && dec != 14 && dec != 13 && dec != 12 && dec != 11 && dec != 10) {
                hex = dec + hex;
            } else {
                switch (dec) {
                    case 10:
                        hex = "A" + hex;
                        break;
                    case 11:
                        hex = "B" + hex;
                        break;
                    case 12:
                        hex = "C" + hex;
                        break;
                    case 13:
                        hex = "D" + hex;
                        break;
                    case 14:
                        hex = "E" + hex;
                        break;
                    case 15:
                        hex = "F" + hex;
                        break;
                }
            }

            i = i / 16;

        }

        System.out.printf("%d (10) = %s (16) \n", dec, hex);
    }

}
