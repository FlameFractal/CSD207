import javax.swing.JOptionPane;

public class Exercise03_18 {
  /** Main method */
  public static void main(String args[]) {
    String s = JOptionPane.showInputDialog("Enter a year: ");

    // Convert the string into an int value
    int year = Integer.parseInt(s);

    // Check if the year is a leap year
    boolean isLeapYear =
      ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

    // Display the result in a message dialog box
    JOptionPane.showMessageDialog(null, year + " is a leap year? " + isLeapYear);
  }
}
