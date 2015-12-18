import java.util.Scanner;

public class Exercise09_26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter the first 9 digits of an ISBN-10 as a string: ");
    String number = input.nextLine();

    // Calculate checksum
    int sum = 0;
    for (int i = 9; i >= 1; i--) {
      sum += Integer.parseInt(number.charAt(i - 1) + "") * i;
    }

    int checksum = sum % 11;

    System.out.print("The ISBN-10 number is ");

    System.out.print(number);

    if (checksum == 10)
      System.out.print("X");
    else
      System.out.print(checksum);
  }
}
