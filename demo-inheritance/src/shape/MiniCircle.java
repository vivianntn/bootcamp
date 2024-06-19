package shape;

public class MiniCircle extends Circle {

  private String color;

  public MiniCircle(double radius, String color){
    super(radius);
    this.color = color;
  }

  //@Override
  //public double area(){
  //}
  
  public static void main(String[] args) {
    MiniCircle mc = new MiniCircle(3.0d, "red");
    System.out.println(mc.getRadius());
    System.out.println(mc.area());
  }

}
