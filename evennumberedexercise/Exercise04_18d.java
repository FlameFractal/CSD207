public class Exercise04_18d {
  /** Print Pattern IV */
  public static void main(String[] args) {
    for (int i = 1; i <= 6; i++) {
      // Print leading space
      for (int j = i; j > 1; j--)
        System.out.print("  ");
      
      for (int j = 1; j <= 6 + 1 - i; j++)
        System.out.print(j + " ");
      System.out.println();
    }
  }
}
