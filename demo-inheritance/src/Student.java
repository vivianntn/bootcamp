 public class Student extends Person{
  private int studentId;

  //private String name;
  //private int age;

  //constructor -> the process of constructing student object
  public Student(int studentId, String name, int age){
    // calling Parent class constructor
    //1. create Parent object inside Student Object(heap object)
    super(name, age); 
    this.studentId = studentId;
    //this.name = name;
    //this.age = age;
  }

  //public String getName(){
    //return this.name;
  //}
  
  public int getStudentId(){
    return this.studentId;
  }

  //public int getAge(){
    //return this.age;
  //}

  public static void main(String[] args) {
    Student s = new Student(1, "Vi", 12); //Student Object in heap memory
    System.out.println(s.getStudentId());
    System.out.println(s.getAge());
    System.out.println(s.getName());
}

}
