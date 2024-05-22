public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int n = 15;
    int firstTerm = 1;
    int secondTerm = 1;
    for (int i = 1; i <= n; i++){
      System.out.print(firstTerm + " ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
    
  }
}