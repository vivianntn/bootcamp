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
  }
}
