import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("hello");
    strings.add("abc");
    strings.add("def");
    System.out.println(strings); 
    //[abc, def, hello], ordering is not determined by insertion order

    ArrayList<String> strings2 = new ArrayList<>();
    strings2.add("hello");
    strings2.add("abc");
    strings2.add("def");
    System.out.println(strings2); 
    //[hello, abc, def], ordering follows the insertion order
    
    //add duplicated string value
    strings.add("hello"); //HashSet -> will not add duplicated value
    strings2.add("hello");
    boolean hsResult = strings.add("hello");
    boolean alResult = strings2.add("hello");

    
    System.out.println(hsResult);// false
    System.out.println(alResult);// true

    System.out.println(strings); //[abc, def, hello]
    System.out.println(strings2); //[hello, abc, def, hello]

    System.out.println(strings.size()); //3
    System.out.println(strings.remove("abc")); //true, means removed
    System.out.println(strings.contains("def")); //true
    //isEmpty()
    //addAll()

    // Question 1: Remove duplicated value
    String[] arr = new String[] {"abc", "def", "xyz", "def"};
    HashSet<String> result = new HashSet<>();
    //loop
    for (String s : arr){
      result.add(s);
    }
    System.out.println(result); // ["abc", "def", "xyz"]

    // Question 2: Find all duplicated values
    HashSet<String> result2 = new HashSet<>();
    ArrayList<String> arrlist = new ArrayList<>();
    // loop
    for (String s : arr){
      if (!result2.add(s)){
        arrlist.add(s);
      }
    }
    System.out.println(arrlist); // ["def"]

    // Question 3: Given String[], remove those strings with length <= 3
    String[] stringArray = new String[] {"anc", "a", "", null, "aaaa"};
    ArrayList<String> result3 = new ArrayList<>();
    //loop
    for (String r : stringArray){
    if (r!=null && r.length() > 3){
     result3.add(r);
    }
}
System.out.println(result3); // ["aaaa"]

  }
}
