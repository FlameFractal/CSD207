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
public class Q18 {

    public static void print_line(int line_no, int total) {
        int l = ((2 * line_no) - 1);
        int k = line_no;
        for (int i = 0; i < (total - line_no); i++) {
            System.out.print(" ");

        }
        for (int j = 1; j < ((l / 2) + 1); j++) {

            if (k > 9) {
                k = 0;
            }
            System.out.print(k);
            k++;

        }
        for (int p = ((l / 2)); p <= l - 1; p++) {

            System.out.print((k));
            k--;
            if (k < 0) {
                k = 9;
            }
        }
        for (int p = 0; p < (total - line_no); p++) {
            System.out.print(" ");
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            print_line(i, 10);
        }
    }

}
