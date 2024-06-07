public class Ball {
  private double weight;
  private String color;
  private int number;

  //constructors - empty constructor, all args constructor
  //by default, there's anempty constructor implicitly exists in the class
  //public Ball(){

  //}

  //custom empty constructor
  public Ball(){
    this.color = "Red";
  }

  
  public Ball(double weight, String color){
    this.weight = weight;
    this.color = color;
    
  }

  public Ball(String color, double weight){
    this.weight = weight;
    this.color = color;
  }

  public Ball(String color, double weight, int number){
    //this.weight = weight;
    //this.color = color;
    this(weight, color);  // call self constructor
    this.number = number;
  }

  //getter, setter
  public String getColor(){
    return this.color;
  }

  public double getWeight(){
    return this.weight;
  }

  public void setColor(String color){
    this.color = color;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }


  //toString
  public String toString(){
    return "Ball(" + "weight = " + this.weight
    + ", color = " + this.color + ")";
  }

  public static void main(String[] args) {
    Ball b1 = new Ball();
    System.out.println(b1.getColor()); //Red

    Ball b2 = new Ball(10.2, "Black");
    System.out.println(b2.getColor());
    System.out.println(b2.getWeight());

  
    System.out.println(b1.toString());
  }
  
}
