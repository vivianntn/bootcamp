import java.math.BigDecimal;
import java.util.concurrent.Callable;

public class Calculator {

  private int x;
  private int y;


  //static method -> instance method
  //public static int sum(int x, int y) {
    //return x + y;
  //}

  public static double sum(double x, double y){
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  public static float sum(float x, float y){
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).floatValue();
  }

  public void setX(int x){
  this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int sum(){
    return this.x+this.y;
  }

  public int multiply(){
    return this.x * this.y;
  }

  public static void test(String[] args){
    //basic loop
    for (int i = 0; i<args.length; i++){
      System.out.println(args[i]);
    }
  }

  public static void test2(String... args){ //String... and String[] are same type
    //for-each
    for (String s : args){
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    
    //sysout
    //static methods
    sum(1, 3); //4
    Calculator.sum(2, 3); //5
  

    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);

    c1.sum(); //2+3
    c1.multiply(); //2*3


    //Method Overloading
    sum(1, 2); 
    //becuz you're passing int value, 
    //so "overloading" determine "public static int sum(int x, int y)" should be called

    sum(1.0, 2.0); //3.0
    //"sum(double x, double y)" is called

    sum(1.0f, 2.0f); //1.0f -> float value, 2.0f -> float value
    //upcast, promotion
    //"sum(float x, double y)" is called

    //String.valueOf() -> overloading
    String.valueOf(10L);
  
    Calculator.test(new String[] {"abc", "ijk"});
    Calculator.test2(new String[]{"abc", "ijk"});
    Calculator.test2("abc", "ijk");
  }
  
}
