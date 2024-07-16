package shape;

import java.math.BigDecimal;

public abstract class Shape {
 // abstract class can create instance method without implementation
 //Method withot implementation -> abstract method
 public abstract double area(); 

   public static double circleArea(double radius){
    return BigDecimal.valueOf(radius)//
    .multiply(BigDecimal.valueOf(radius))//
    .multiply(BigDecimal.valueOf(Math.PI))//
    .doubleValue();
  }

  // polymorphism
  public static double totalArea(Shape[] shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes){ //s is an obj ref. pointing to actual object (Circle/Square)
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(Shape.circleArea(3.0d));
    Shape[] shapes = new Shape[]{new Circle(3.0d), new Square(4.0d)};
    System.out.println(Shape.totalArea(shapes));

    //extra example (BigDecimal vs StringBuilder design difference)
    StringBuilder sb = new StringBuilder("hello");
    sb.append("world"); 
    //sb = sb.append("world"); //???
    System.out.println(sb); //helloworld
  }
}
