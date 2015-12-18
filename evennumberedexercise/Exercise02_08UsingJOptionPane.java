import javax.swing.JOptionPane;

public class Exercise02_08UsingJOptionPane {
  public static void main(String args[]) {
    // Enter an ASCII code
    String numberString = JOptionPane.showInputDialog(null,
      "Enter an ASCII code:",
      "Exercise02_08 Input", JOptionPane.QUESTION_MESSAGE);

    // Convert string to int
    int code = Integer.parseInt(numberString);

    // Display result
    System.out.println("The character for ASCII code "
      + code + " is " + (char)code);
  }
}
