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
public class Q8 {

    public static void main(String[] args) {

        double toss;
        int heads = 0, tails = 0;

        for (int i = 0; i < 1000000000; i++) {
            toss = Math.random();
            if (toss >= 0.5) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Heads = " + heads + " Tails = " + tails);

    }

}
