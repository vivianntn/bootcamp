public class ArrayDemo {
  public static void main(String[] args) {
    // Array
    int[] arr = new int[] {1,2,3}; // right hand side: array object
    // left hand side: arr is and object reference

    //Integer[] integers = new int[] {1, 2. 3}; // it's NOT upcasting

    // how many objects are created in this statement?
    Integer[] integers = new Integer[] {1,2,3}; // upcast, 1 (int value) -> Integer Object with value 1
    // Ans: 4 objects in total
    // 1. Array Object
    // 2. Integer Object with value 1
    // 3. Integer Object with value 2
    // 4. Integer Object with value 3
    System.out.println(integers[2]); //3, integers[2] -> storing the address of "Integer Object with value 3"
    
  }
}
