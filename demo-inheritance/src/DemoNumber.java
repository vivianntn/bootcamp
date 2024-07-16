public class DemoNumber {
  public static void main(String[] args) {
     Integer x = 1; // 1 int calue (primitive) -> Integer Object
     System.out.println(x.getClass()); //class java.lang.Integer
     
     Double d = 2.0;

     Number n = x; //polymorphism
     // n is an object reference
     n = d;

     Number[] numbers = new Number[] {1, 2, 3, 4.0, 4.5};
     Double[] doubles = new Double[] {Double.valueOf(1), Double.valueOf(2), Double.valueOf(3), 4.0, 4.5};// int -> Integer (autobosx)
     //Integer vs Double (NO relationship)
     //int -> double (upcast)

     // For-each
     // for (object type : array object)
     for (Number num : numbers ){
      System.out.println(num.getClass());
      //a way to know the object reference pointing to what typr of objects
    //class java.lang.Integer
    //class java.lang.Integer
    //class java.lang.Integer
    //class java.lang.Double
    //class java.lang.Double
     }
  }
}
