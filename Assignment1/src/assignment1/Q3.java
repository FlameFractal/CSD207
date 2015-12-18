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
public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, a = 0, sum = 0;
        System.out.println("Enter the number");
        i = scanner.nextInt();
        while (i != 0) {
            a = i % 10;
            i = i / 10;
            sum = sum + a;
        }
        System.out.println(sum);

    }

}
