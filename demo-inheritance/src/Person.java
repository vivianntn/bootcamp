public abstract class Person {
  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    }

  public static void main(String[] args) {
    //abstract class CANNOT create object, 抽象class not reality
    //Person p = new Person("Vi", 12);

    //student.class is public
    //student.class constructor is public
    Student s = new Student(1, "Vi", 13);
  }
}
