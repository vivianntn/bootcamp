package shapes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  //public Shape(){}

  //approach 1
  public static double area(List<Shape> shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes){
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  //approach 2: Generics
  //<T extends Shape> is to describe the parent relationship
  public static <T extends Shape> double area2(List<T>shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes){
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }
  
  //List<Object> vs List<T> difference

  public static double area3(List<? extends Shape> shapes){
    return -1.0;
  }

  public static void main(String[] args) {
    //Circle vd Shape -> Parent
    // List<Shape> vs List<Circle> -> NOT Paren
    List<Shape> shapes = new LinkedList<>();
    shapes.add(new Circle(3.0));
    shapes.add(new Circle(4.2));
    shapes.add(new Square(5.0));

    System.out.println(Shape.area(shapes)); // 83.69202829163208
    System.out.println(Shape.area2(shapes)); // 83.69202829163208

    //ArrayList<Square> object
    //ArrayList<Circle> object
    //List<? super Shape> shapes2 = new ArrayList<>();//new
    List<? extends Shape> shapes2 = new ArrayList<Circle>();
    shapes2 = new ArrayList<Square>();
    // add
    //shapes2.add(new Object());
    //shapes2.add(new Circle(3.4));// NOT ok
    //shapes2.add(new Square(5.0));// NOT ok
    //during compile-time, we do not know the actual type of object reference by shapes2
      
    List<? super Shape> shapes3 = new ArrayList<Object>();
    shapes3.add(new Circle(3.4));
    shapes3.add(new Square(5.0));
    //shapes3.add(new Bird()); 
    //NOT OK, during compile time, we DONT know the actual type of shapes3
    //cannot guarantee it's Object ArrayList instead of Shape ArrayList
    
    //List<Object> objects = new ArrayList<Circle>(); //NOT OK (Parent)
    Object object = new Circle(2.4); // OK, (Parent)
    }

  }

