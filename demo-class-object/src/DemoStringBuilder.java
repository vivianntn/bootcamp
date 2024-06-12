public class DemoStringBuilder {

  public static void main(String[] args) {
    String x = "hello"; // slow performance in terms of manipulation, i.e. concat, replace

    //"new StringBuilder()" -> constructor
    StringBuilder sb = new StringBuilder("hello"); // fast performance
    Cat cat = new Cat();
    cat.setAge(13); //void method

    x += " world";
    sb.append(" world");

    System.out.println(sb.toString()); //hello world
    sb.replace(1, 2, "xx"); 
    System.out.println(sb.toString()); //hxxllo world

    sb.setCharAt(4, 'A');
    System.out.println(sb.toString()); //hxxlAo world

    sb.reverse();
    System.out.println(sb.toString()); //dlrow oAlxxh

    sb.insert(4, '*');
    System.out.println(sb.toString()); //dlro*w oAlxxh

    sb.substring(0, 0)

  }
  
}
