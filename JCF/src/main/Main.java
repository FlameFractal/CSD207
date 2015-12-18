/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author vishalgauba
 */
import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random r = new Random();
for (int i = 0; i < 1000; i++) {
    for (int j = 0; j < 1000; j++) {
        if(r.nextInt(4) == 0) {
            System.out.print("O");
        } else {
            System.out.print("#"); //only line changed
        }
    }

    System.out.println("");
}
    }
}