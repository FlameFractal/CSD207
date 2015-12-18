/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

/**
 *
 * @author Vishal
 */
class A {

    void p() {
        System.out.println("in A");
    }
    
    public static void q(){
        System.out.println("in static A");
    }
}

class B extends A {

    void p() {
        System.out.println("in B");
    }
    
    public static void q(){
         System.out.println("in static B");
    }
}
