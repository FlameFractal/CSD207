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
public class Q10 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter desired number of seconds");

        int time = scanner.nextInt();

        for (int i = 1; i <= time; i++) {
            if (i == 1) {
                System.out.println(i + " second has passed");
                Thread.sleep(1000);
            } else {
                System.out.println(i + " seconds have passed");
                Thread.sleep(1000);
            }

        }
        System.out.println("Done.");
    }

}
