public class DemoPrimitives {
  public static void main(String[] args) {
    // numbers / string (text)
    // number (integers/decimal)
    // int (整數) is a data type that declaring the type of value of x can be stored
    int x = 3;
    int z = -9;
    int total = x + z; //-6
    System.out.println(total);

    // + - * /
    int total1 = x / z;
    System.out.println(total1);
    int total2 = x * z;
    System.out.println(total2);
    int total3 = x - z;
    System.out.println(total3);

    int l = 33 / x;
    System.out.println(l);

    int a = 32 / x;
    System.out.println(a);

    // remainder 餘數
    int remainder = 10%3; //1
    int divide = 10 / 3; //3
    System.out.println(remainder);
    System.out.println(divide);

    //2024.05.10
    double d1 = 10.3;
    double d2 = 10.34567;
    double d3 = -110.999;

    double result2 = d1 + d2 - d3;
    System.out.println(result2); //double -> +-*/ will have issues in some scenrios
    double result3 = 0.1+0.2;
    System.out.println(result3); //0.3000000004

    double result4 = 4 * 0.25 * 3 / 2 - 10;
    System.out.println(result4);

    int f1=7;
    double f2 = 8.8;
    // int f3 = f1+f2; -> error, because int + double -> double(7.0) + double(8.8) -> double(15.8) 
    //so double value can be stored in an int variable. 
    //int f3 = f1+f2;

    //int g = 10 / 3; //int / int -> int -> 3, so 3 can be assigned to variable g

    // Premitive: char
    char c1 = 'i'; // use single quote to declare a char value, double quote is for string
    char c2 = '  '; //space value
    // char c3 = ''; //->error, char variable must contain a single character
    //char c4 = 'aa'; //cannot, only single character

    // Premitive: boolean -> true, false
    //booelan b1 = "true"; // cannot assign a string value to boolean
    boolean b2 = true;
    boolean b3 = false;
    // boolean b4 = 1; //cannot, can only contain true/false

    // Premitives for integer
    // int, long, byte, short
    byte y1 = 1;
    // byte can only store the integer with range of the value between -128 and 127
    byte y2 = -128;
    byte y3 = 127;
    //byte y4 = 128; //compile error (java can identify the syntex error = grammer mistake)

    short s1 = -32768; //-32768 to 32767
    int i1 = -2147483648; // -2147483648 to 2147483647
    //int i2 = -2147483649;

    long l1 = -922337836854775808L; // it's an int
    long l2 = 922337836854775807L; // L means a way to specify this value is a long value
    // long l3 = 922337836854775808L;

    // Preitive for number with decimal
    //a. 10.2 is a double value
    //b. you cannot assign a double value to float variable, cuz float is a data type with lower level
    //c. conclusion: you cannot assign a higher level of data value to a lower level data type
    double d10 = 10.2;
    // 10.2f if a float value
    float f10 = 10.2f; 

    //float f11 = 10.5f + 10.5; // float + double -> double, cannot assign double to float cuz float is lower level

    double d11 = 99.99d; // same as double d12 = 99.99;

    //Total 8 types of premitives: int, byte, short, long, double, float, char, boolean

    //Local variable (within the main program, you can only declare the same variable once)
    double d12; //variable declaration
    d12 = 10.9; // value assignment

    double d13 = 14.3; // declaration and assignment
    // double d13 = 19.0; // you cannot re-declare the same variable
    d13 = 19.0; //reassignment

  }
}
