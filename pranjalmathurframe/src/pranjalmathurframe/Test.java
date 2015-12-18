/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pranjalmathurframe;

import java.awt.event.MouseListener;

/**
 *
 * @author Vishal
 */
public class Test {

    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
}

class Student extends Person {

    private String getInfo() {
        return "Student";
    }
}

class Person {

    public String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
}
