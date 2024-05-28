public class DemoInteger {
  public static void main(String[] args) {
    int x = 1;
    Integer x2 = 1;
    System.out.println(x);
    System.out.println(x2);

    x = x + 3;
    x -= 10;

    x2 = x2 + 3;
    x2 -= 10;

    //Integer is a wrapper class
    //class has method
    short s = (short) x;

    x2 += 60000;
    short s2 = x2.shortValue(); //overflow, similar to explicit conversion
    System.out.println(s2); 

    double d1 = x2.doubleValue();
    System.out.println(d1); //59994.0

    //Comparison (>, <, >=, <=, ==, != for primitive value only)
    //For Integer (wrapper class comparison), compareTo()
    Integer x3 = 4; //autobox
    Integer x4 = 8;
    Integer x5 = 8;
    boolean result = x4 > x3; //true (comparing int value)

    System.out.println(x4.compareTo(x3)); // 1
    System.out.println(x3.compareTo(x4)); // -1
    System.out.println(x4.compareTo(x5)); // 0

    // compare Integer value
    boolean result2 = x4.compareTo(x3) > 0; //true
    boolean result2 = x4.compareTo(x3) < 0; //false
    boolean result2 = x4.compareTo(x5) == 0; //true

    //Byte, Short, Integer, Long, Double, Float
    Float f1 = 10.0f; // 10.0f is a float value -> autobox -> Float value
    Float f2 = new Float(10.0f); // create Float object, storing a float value
    long l2 = f2.longValue();

    

  }
  
}
