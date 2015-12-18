/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Lab3 {
    public static void main(String[] args) {
        
        int user=0, random=0;
        
        
        random = (int) (Math.random()*100);
        System.out.println("Lottery number = "+random);
        
        Scanner scanner = new Scanner(System.in);
        user = scanner.nextInt();
        
        
        
        int digitr2 = random % 10;
        int digitr1 = random / 10;
        int digitu2 = user % 10;
        int digitu1 = user / 10;
        
        
        System.out.println("User number = "+user);
        
        if ((digitr1 == digitu1)){
            if(digitr2 == digitu2)
                System.out.println("Exactly same!!");
            else
                System.out.println("Only 1st same");
        }
        else if{
            if(digitr1==digitu2){
                if(digitr2==digitu2)
                    System.out.println("Only 2nd same");
                else if(digitr2 == digitu1)
                    System.out.println("All digits same");
            }
            else
                System.out.println("Different");
    }
    
}
