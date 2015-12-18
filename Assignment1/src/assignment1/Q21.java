/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;


/**
 *
 * @author Vishal
 */
public class Q21 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print(j + " * " + i + " = " + (i * j));
                System.out.printf("\t");
            }
            System.out.println();
        }

    }
}
