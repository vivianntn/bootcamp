public class DemoInteger2 {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3; //3 int value -> autobox -> integer object (heap memory)

    i1 = 127; // i1 (object ref), 127 -> (1st) create Integer Object
    i2 = 127; // i2 (object ref), 127 -> (2nd) reuse the original Integer Object
    // Rule: from -128 to 127 -> reuse thr original object
    System.out.println(i1 == i2); // true (are they same object?)

    Integer i3 = 128; // 128 -> (1st) create Integer Object
    Integer i4 = 128; // 128 -> (2nd) create Integer Object
    System.out.println(i3 == i4); // false (are they same object?)

    //Important!!!
    //For Class, you should always compare their objects value by METHOD!!!
    System.out.println(i3.compareTo(i4)); //0
  
  }
  
}
