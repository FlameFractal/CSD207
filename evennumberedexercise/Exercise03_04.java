import javax.swing.*;
import java.util.Scanner;

public class Exercise03_04 {
  public static void main(String[] args) {
    int number1 = (int)(System.currentTimeMillis() % 100);
    int number2 = (int)(System.currentTimeMillis() * 7 % 100);

    System.out.print("What is " + number1 + " + " + number2 + "? ");
    Scanner input = new Scanner(System.in);
    int result = input.nextInt();
    
    /*
    String resultString = JOptionPane.showInputDialog
      ("What is " + number1 + " + " + number2 + "?");

    int result = Integer.parseInt(resultString);
    */

    System.out.println(
        number1 + " + " + number2 + " = " + result + " is " +
        (number1 + number2 == result)); 
    /*
    JOptionPane.showMessageDialog(null,
      number1 + " + " + number2 + " = " + result + " is " +
      (number1 + number2 == result)); 
    */
  }
}
