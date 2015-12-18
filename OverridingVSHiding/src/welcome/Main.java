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
public class Main {

       
    public static void main(String[] x) {

        //String s = new String(" ");
        //System.out.println("as"+s+"la");

        A refAmemA = new A();
        A refAmemB = new B();
        B refBmemB = new B();

        refAmemA.p();   //in A
        refAmemA.q();   //in static A
        refAmemB.p();   //in B              overriding
        refAmemB.q();   //in static A       hiding
        refBmemB.p();   //in B              overriding
        refBmemB.q();   //in static B       hiding

        
//        compile time type = declared type
//        run time type = actual type
//
//        overriding -> runtime -> non -static functions
//        hiding -> compiletime -> static funtions
        
        
}

}
