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
public class fgnhfdh {

    public static void main(String[] args) {
// Create a Scanner
Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int n1=input.nextInt();
System.out.print("Enter second integer: ");
int n2=input.nextInt();
int gcd=0;
int k = 5;
while (k <= n1 && k <= n2) {

gcd = k;
k++;
}

System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
}
}
