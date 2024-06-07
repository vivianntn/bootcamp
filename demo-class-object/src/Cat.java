public class Cat { // Class Name -> Name Convention -> able to describe physical object
  //class = 藍圖, object = 有生命, carry to memories
  
  //state
  //attributes
  private String name;
  private int age;

  //if NO constructor is defined,
  //by default the class implicitly has an empty constructor

  //behavior
  //instance method
  //setAge() is a method that can be called by object only
  //For example, Cat c1 = new Cat();
  //c1.setAge(10);
  //"this" -> the object pointed by c1 (object reference)
  public void setAge(int age) {
    this.age = age; // this = describing the specific object's age, not the same as the private int age;
  }

  //void is a return type, requires return nothing
  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

 
    
 
  //instance method
  public String describe(String x){
    return "the age of this cat is " + this.age + ", and the name of this cat is " + this.name + " " + x;
  }

  public static void main(String[] args) {
  //how to recall describe()
  Cat cat = new Cat();
  cat.setAge(13);
  cat.setName("abc");
  System.out.println(cat.describe("."));
   
}
}
