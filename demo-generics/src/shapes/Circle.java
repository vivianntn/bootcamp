package shapes;

public  class Circle extends Shape{
  private double radius;

  public Circle(double radius){
    super();
    this.radius = radius;
  }
  
  @Override
  public double area() {
    return Math.PI * this.radius * this.radius;
  }
}
