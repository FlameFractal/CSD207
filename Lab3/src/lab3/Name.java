/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Arrays;

/**
 *
 * @author Vishal
 */
public class Name {

    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName) {
        this.firstName = firstName;
        this.middleName = " ";
        this.lastName = " ";
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = " ";
        this.lastName = lastName;
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean sameName(Name n) {
        if (n.firstName.toLowerCase().equals(this.firstName.toLowerCase())) {
            if (n.middleName.toLowerCase().equals(this.middleName.toLowerCase())) {
                if (n.lastName.toLowerCase().equals(this.lastName.toLowerCase())) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean sameInitials(Name n) {
        if (n.firstName.charAt(0) == this.firstName.charAt(0)) {
            if(n.middleName.charAt(0) == this.middleName.charAt(0)){
                if(n.lastName.charAt(0) == this.lastName.charAt(0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean similarNames(Name n){
       String s1 = n.firstName+n.middleName+n.lastName;
       char[] c1 = s1.toCharArray();
       String s2 = this.firstName+this.middleName+this.lastName;
       char[] c2 = s2.toCharArray();
       Arrays.sort(c1);
       Arrays.sort(c2);
       return Arrays.equals(c1, c2);
    }
    
   
    
    
    
}
