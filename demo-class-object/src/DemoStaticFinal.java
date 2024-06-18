public class DemoStaticFinal {

  //constant // snakecase
  //logoString // camelcase
  private static final String LOGO_STRING; //static variable / class variable (belongs to class)
  private static String name;

  private final double salary = 0.0d; // finalised instance variables, cannot be changed

  //camelcase
  private int age; 

  //triggered before main() method
  static {
    LOGO_STRING = "default";
  }

  public int getAge(){
    return this.age;
  }
  public double getSalary(){
    return this.salary;
  }

  public static String getName(){
    return name;
  }

  //instance method can access both instance and static variables, but static method cannot 
  public String test(){
    return this.age + " " + name + " " + this.salary + " " + LOGO_STRING;
    }

  public static String getLogo(){
    return LOGO_STRING;
  }

  // final is a Java keyword. Compiler would track all final variables whether have been initialized
  //private final double salary;
  //private static final String logo;
  //compiler error

  public static void main(String[] args) {
    //Instance variables
    DemoStaticFinal dsf = new DemoStaticFinal();
    dsf.age = 10;
    //dsf.salary = 1000; //compile error, salary is a final variable, can only be read but not write
    System.out.println(dsf.salary); //0.0
    DemoStaticFinal dsf2 = new DemoStaticFinal();
    dsf2.age = 20;
    System.out.println(dsf2.salary); //0.0

    System.out.println(DemoStaticFinal.LOGO_STRING); //default

    DemoStaticFinal.name = "Vi";

    //you can't assign "static final" variable in main() method, it's too late

  }
}
