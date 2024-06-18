public class DemoBlock {
  
  private static int number;
  private static int numer2;
  private String name;

  //static block
  //1. triggered once only, no matter the number of static variable(s), even no variable
  static{
    System.out.println("start static block");
    number = 3;
    System.out.println("end static block");
  }

  public DemoBlock(){
    System.out.println("calling constructor ...");
  }

  public DemoBlock(String name){
    System.out.println("calling all args constructor");
    this.name = name;
  }

  
  // instance block 
  //is triggered when there's a new object created (create 2 objects jau run twice)
  //it's triggered before constructor
  //Usage: common logic between constructors
  {
    System.out.println("start instance block");
    this.name = "John";
    System.out.println("end instance block");
    number = 10;
  }



  public static void main(String[] args) {
    System.out.println("start");
    System.out.println(DemoBlock.number); //3

    DemoBlock db = new DemoBlock();
    DemoBlock db2 = new DemoBlock("vi");
    DemoBlock db3 = new DemoBlock();
    System.out.println(DemoBlock.number);
    System.out.println("end");
  }
}
