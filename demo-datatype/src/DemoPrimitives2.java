public class DemoPrimitives2 {
  public static void main(String[] args) {
    long l1 = 10; //10 -> int value
    long l2 = 10L; //10L -> long value
    long l3 = 10l; //l -> similar to 1 (avoid using 'l')

    //Java: int -> long
    long l4 = 63; // assign int value 63 to long variable l4 (int value -> long value)
    //int i1 = 4L; // cannot assign long value to int variable, because long is a type higher than int

    // byte -> short -> int -> long -> float -> double
    // char -> int (ascii)
    double d1 = 1.0;
    double d2 = 1.8d;
    double d3 = 10L;

    byte b1 = 10; // ok, why? 10 int value -> byte 

    // you can only explicitly assign a value that with a type higher than the data type
    float f3 = (float) 1.9d; //downcast (overflow/ precision loss)

    short s1 = 129;
    byte b2 = (byte) s1; // Java doesn't know s1 is 128 during compile time
    System.out.println("b2=" + b2); //-127 -> overflow (byte size -128 - +127, will circulate back to -128)
  
    byte b3 = 127;
    short s2 = b3; //no risk cuz short can hold more value than byte

    double d4 = 10.9d;
    int i2 = (int) d4;
    System.out.println("i2=" + i2); //10 -> precision loss

    char c1 = 'a'; //97 (ascii)
    char c2 = 'A'; //65 (ascii)
    if (c1 == c2){ //false, 97 =/= 65

    }
    if (c1>c2) { // true, 97>65
      System.out.println("c1>c2");
      System.out.println("c1=" + (int)c1); //String + int -> String
      System.out.println("c2=" + (int)c2); //String + int -> String
    }

    int c1IntValue = c1; //Ok, char -> int (upcast)

    int charValue = 97;
    char c3 = (char) charValue; //(char) -> conversion
    System.out.println("c3=" + c3); 

    char c4 = '你';
    int i5 = c4;
    System.out.println("i5=" + i5); //i5=20320

    char character = 'a' + 1;
    System.out.println(character); // b

    char zero = '0';
    int asciiCode = zero;
    System.out.println(asciiCode); // 48 

    //20320
    int x = 20320;
    System.out.println((char) x);

    short a = (byte) 128; // int -> byte -> short
    System.out.println(a); //-128
  }
}
