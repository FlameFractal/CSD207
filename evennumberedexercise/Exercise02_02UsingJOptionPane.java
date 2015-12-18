import javax.swing.JOptionPane;

public class Exercise02_02UsingJOptionPane {
  public static void main(String[] args) {
    // Enter radius of the cylinder
    String radiusString = JOptionPane.showInputDialog(null,
      "Enter radius of the cylinder",
      "Exercise02_02 Input", JOptionPane.QUESTION_MESSAGE);

    // Convert string to double
    double radius = Double.parseDouble(radiusString);

    // Enter length of the cylinder
    String lengthString = JOptionPane.showInputDialog(null,
      "Enter length of the cylinder",
      "Exercise02_02 Input", JOptionPane.QUESTION_MESSAGE);

    // Convert string to double
    double length = Double.parseDouble(lengthString);

    double volume = radius * radius * 3.14159 *length;

    System.out.println("The volume of the cylinder is " + volume);
  }
}
