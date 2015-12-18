import java.util.Scanner;

public class Exercise20_22 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a decimal integer: ");
    int decimal = input.nextInt();
    System.out.println(decimal + " is hex " + decimalToHex(decimal));
  }  

  public static String decimalToHex(int value) {
    if (value == 0)
      return "";
    else {
      String temp;
      if (value % 16 == 10)
        temp = "A";
      else if (value % 16 == 11)
        temp = "B";
      else if (value % 16 == 12)
        temp = "C";
      else if (value % 16 == 13)
        temp = "D";
      else if (value % 16 == 14)
        temp = "E";
      else if (value % 16 == 15)
        temp = "F";
      else 
        temp = "" + value % 16;
  
      return decimalToHex(value / 16) + temp;   
    }
  }
}
