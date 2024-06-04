public class Calculator {

  //static method -> instance method
  public static int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    
    //sysout
    sum(1, 3);
    Calculator.sum(2, 3);
  

    Calculator c1 = new Calculator();
    
    c1.setx(2);
    c1.sety(3);
  
    c1.sum(); //2+3
    c1.multiply(); //2*3


  }
  
}
