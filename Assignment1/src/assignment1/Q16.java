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
public class Q16 {
    public static String RomanNum(int n){
        String ronam_num="";
        int repeat;
 
               repeat=n/100;
        for(int i=1; i<=repeat;i++){
            ronam_num=ronam_num+"C";
        }
        n=n%100;
 
        repeat=n/90;
        for(int i=1; i<=repeat;i++){
            ronam_num=ronam_num+"XC";
        }
        n=n%90;
 
        repeat=n/50;
        for(int i=1; i<=repeat;i++){
            ronam_num=ronam_num+"L";
        }
        n=n%50;
 
        repeat=n/40;
        for(int i=1; i<=repeat;i++){
            ronam_num=ronam_num+"XL";
        }
        n=n%40;
 
        repeat=n/10;
        for(int i=1; i<=repeat;i++){
            ronam_num=ronam_num+"X";
        }
        n=n%10;
 
        repeat=n/9;
        for(int i=1; i<=repeat;i++){
            ronam_num=ronam_num+"IX";
        }
        n=n%9;
 
        repeat=n/5;
        for(int i=1; i<=repeat;i++){
            ronam_num=ronam_num+"V";
        }
        n=n%5;
 
        repeat=n/4;
        for(int i=1; i<=repeat;i++){
            ronam_num=ronam_num+"IV";
        }
        n=n%4;
 
        repeat=n/1;
        for(int i=1; i<=repeat;i++){
            ronam_num=ronam_num+"I";
        }
        return ronam_num;
    }
    public static void main(String args[]){
       
        Scanner input=new Scanner(System.in);
        for(int i=0;;i++){
            System.out.print("Enter the number: ");
            int j=input.nextInt();
            if(j!=0){
                String roman=RomanNum(j);
                System.out.println("The roman numeral for entered number is "+roman);
            }
            else
                break;
        }
    }
}

    
}
