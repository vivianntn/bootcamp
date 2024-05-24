import java.util.Arrays;

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

    // isEmpty()
    // Empty String value -> ""
    String x7 = "";
    System.out.println(x7.isEmpty()); //true
    String x8 = "abc";
    System.out.println(x8.isEmpty()); //false
    
    System.out.println(x7.length() == 0);//true

    //isBlank()
    String x9 = "";
    System.out.println(x9.isBlank());//true
    x9 = " ";
    System.out.println(x9.isBlank());//true -> check whitespace then check length
    System.out.println(x9.isEmpty());//false -> check length only

    //substring(0,3)
    //substring(0)
    String s10 = "hello";
    System.out.println(s10.substring(0)); //from index 0 to the end -> hello
    System.out.println(s10.substring(0, 3)); // from index 0 to the index 2 (3-1) -> hel

    //hello -> HELLO
    System.out.println(s10.toUpperCase()); //"HELLO"
    String s11 = "Hello";
    System.out.println(s11.toLowerCase()); // "hello"

    System.out.println(s10.replace('l', 'x')); // hexxo
    System.out.println(s10.replace("ll", "yyy")); // heyyyo

    //contains()
    System.out.println(s10.contains("ell")); //true

    //startWith()
    System.out.println(s10.startsWith("he")); //true
    //endWith()
    System.out.println(s10.endsWith("o")); //true

    //trim() -> removing the space characters at the head/tail of the String
    String s12 = "   Hello,  bootcamp   !!!   ";
    System.out.println(s12.trim()); //Hello,  bootcamp   !!!

    String[] strings = new String[] {"hello", "abcijk", "vincent", "HeLLo", "   HELLO   "};
    //how many strings contains "ELL". but ignore case
    //"eLL" or "ell" or "ELL"....
    System.out.println(Arrays.toString(strings));
    
    
  }
}
