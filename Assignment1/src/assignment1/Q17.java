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
public class Q17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        String a = input.nextLine();
        int j = a.length();
        int sum = 0;
        int k;
        k = Integer.parseInt(a);
        int l = k;
        for (int i = 1; i <= j; i++) {
            int p = k % 10;
            sum = (int) (sum + Math.pow(p, j));
            k = k / 10;
        }
        if (l == sum) {
            System.out.println("Sum of the digits of the number is " + sum + " and IT IS AN ARMSTRONG NUMBER");
        } else {
            System.out.println("Sum of the digits of the number is " + sum + " and IT IS \"NOT\" AN ARMSTRONG NUMBER");
        }
    }

}
