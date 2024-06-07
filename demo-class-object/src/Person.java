import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
   
  //Attributes
  private String firstName;
  private String lastName;
  private double weight; //kg
  private double height;

  //Empty Constructor
  public Person(){

  }

  //All Arguments Constructor
  public Person(String firstName, String lastNmae, double weight, double height){
    this.firstName = firstName;
    this.lastName = lastNmae;
    this.weight = weight;
    this.height = height;
  }

  //Instance method
  //Attribute presentation
  public String fullName(){
    return this.firstName + " " + this.lastName;
  }

  public String toString(){
    return "Person(" + "Fullname: " + this.firstName + " " + this.lastName + ")";
  }

  //weight / height ^ 2-> BigDecimal
  public double bmi(){
    return BigDecimal.valueOf(this.weight)
    .divide(BigDecimal.valueOf(Math.pow(this.height, 2)), RoundingMode.HALF_UP)
    .doubleValue();
  }

  //Convert bmi to static method
  public static double bmi(double weight, double height){
    return BigDecimal.valueOf(weight)
    .divide(BigDecimal.valueOf(Math.pow(height, 2)), RoundingMode.HALF_UP)
    .doubleValue();
  }
  

  //getter setter
  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public void setFistName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public double getWeight(){
    return this.weight;
  }

  public double getHeight(){
    return this.height;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public static void main(String[] args) {

    Person p1 = new Person(); //"new Person()" -> create a new Person Object in memory
    p1.setFistName("Vivian");
    p1.setLastName("Ng");
    p1.fullName();
    System.out.println(p1.fullName()); //Vivian Ng
    p1.setHeight(1.6);
    p1.setWeight(60);
    System.out.println("p1's bmi = " + p1.bmi());

    System.out.println(p1.toString());

    System.out.println(Person.bmi(60, 1.6));

    //Create a person object with given attribute values
    Person p2 = new Person("Jenny", "Chan", 55, 1.7);
    System.out.println(p2.fullName());
    System.out.println(p2.bmi()); //19
    p2.setWeight(54);
    System.out.println(p2.bmi()); //18.7

    Person p3 = p1;
    System.out.println(p1.getFirstName()); //Vivian
    System.out.println(p3.getFirstName()); //Vivian
  }

}
