public class DemoString {
  public static void main(String[] args) {
    // String stores text, must use double quote to declare a string value
    String x = "hello";
    String y ="welcome";
    String dollar = "$10";
    String withspace = "   hi";
    System.out.println(withspace);

    String z = x + dollar;
    System.out.println(z);

    double price = 9.99;
    String item = "book";
    String description = "The" + item + "costs $" +price; //String + String + double -> String
    System.out.println(description);

    char a = 'A';
    String message = "The answer is:" + a; //char->String
    System.out.println(message);

    //Sting Method (Tool) 1: length()
    String t = "hello";
    System.out.println("The length of t=" + t.length()); // t.length() ->int


    // check if t length >=4, if yes, print hello, else goodbye
    if (t.length() >= 4) {
      System.out.println("hello");
    }else{
      System.out.println("goodbye");
    }

    //String Method 2: equals()
    String s1 = "hello";
    String s2 = "hello";
    if (s1.equals(s2)) {
      System.out.println("They are having same String value.");
    }else{
      System.out.println("They are not with same value.");
    }

    if (!s1.equals(s2)){ // ! means "NOT"
      System.out.println("They are not with same value.");
    }else{
      System.out.println("They are having same String value.");
    }

    if (s1==s2){
      System.out.println("They are same object.");
    }

    // check if s1 length >=6 or s1 equals s2, print ...
    //OR
    if (s1.length() >= 6 || s1.equals(s2)){ //fale || true -> true
      System.out.println("yes!!");
    }else{
      System.out.println("no");
    }

    if (s1.length() >=6){
      System.out.println("yes!!");
    }else if (s1.equals(s2)) {
      System.out.println("yes");
    }

    // check if s1 length >=6 or s1 equals s2, print ...
    //AND
    if (s1.length() >= 6 && s1.equals(s2)){ //false && true ->
      System.out.println("hello");
    }

    if (s1.length()>=6){
      if (s1.equals(s2)){
        System.out.println("hello");
      }
    }

    // String Method 3: charAt(int index), e.g. charAt(0)
    String s3 = "world";
    // 0 means 1st character
    // 1 means the 2nd character
    // 4 means th 5th character
    System.out.println("The 1st character of s3=" +s3.charAt(0)); //w
    System.out.println("The 1st character of s3=" +s3.charAt(4)); //d

    System.out.println("The last character of s3=" +s3.charAt(s3.length() - 1));

    //System.out.println(s3.charAt(-1)); // error, out of bounds


    //check if the last character is d and length >5, if yes print yes
    String x2 = "hello world";
    if (x2.charAt(x2.length() - 1) == 'd' && x2.length() >5){
      System.out.println("yes");
    }
    
    // String Method 4: substring(int beginIndex, int endIndex (endIndex-1))
    String result = x2.substring(0, 2);
    System.out.println(result); //he
    System.out.println(x2.substring(0, 5)); //"hello"
    System.out.println(x2.substring(3, 8)); //"lo wo"
    System.out.println(x2.substring(0, 0)); //""
    System.out.println(x2.substring(0, 1)); //"h"

    // check if the first three character is "wel", if yes print yes
    String x3 = "welcome";
    // substring()
    if (x3.substring(0,3).equals("wel")){
      System.out.println("yes");
    }

    //chain method
    System.out.println(x3.substring(0,3).length()); //3
    System.out.println(x3.substring(0,3).charAt(1)); //'e'
    
    
    // charAt()
    if (x3.charAt(0)=='w' && x3.charAt(1)=='e' && x3.charAt(2)=='l'){
      System.out.println("yes");
    }
  }
}
