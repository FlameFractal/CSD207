/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author vishalgauba
 */
public class Q14 {

    public static void main(String[] args) {
        for (int a = 1; a < 6; a++) {
            for (int b = 1; b < 6; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int c = 1; c < 6; c++) {
            for (int d = 1; d < c + 1; d++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int e = 1; e < 6; e++) {
            for (int f = 5; f >= e; f--) {
                System.out.print("* ");
            }
            System.out.println();
            for (int g = 0; g < e; g++) {
                System.out.printf(" ");
            }
        }
    }

}
