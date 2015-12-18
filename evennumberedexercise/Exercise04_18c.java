public class Exercise04_18c {
  /** Print Pattern III */
  public static void main(String[] args) {
    for (int i = 1; i <= 6; i++) {
      // Print leading space
      for (int j = 6 - i; j >= 1; j--)
        System.out.print("  ");
      
      for (int j = i; j >= 1; j--)
        System.out.print(j + " ");
      System.out.println();
    }
  }
}
