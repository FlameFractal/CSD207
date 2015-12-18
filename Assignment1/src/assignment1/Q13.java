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
public class Q13 {

    public static void main(String[] args) {
        int[] marks = new int[101];
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student:" + (i + 1));
            a = scanner.nextInt();
            (marks[a])++;
        }

        for (int i = 0; i < 101; i++) {
            if (marks[i] != 0) {
                System.out.println("Frequency of marks " + i + " = " + marks[i]);
            }
        }
    }
}
