public class DemoLoop {
  public static void main (String[] args) {
    int x = 3;
    x *= 3; //9
    x *= 3; //27
    x *= 3; //81

    //for Loop
    //initialization (variable declaration & assignment) ; continue criteria ; incremental operation
    // 1. "int i = 0"
    // 2. check if i < 4 ? yes cuz i = 0
    // 3. print "hello"
    // 4. i++ -> i bcome 1
    // 5. check if i < 4? yes i = 1
    // 6. print "hello"
    // 7. i++ -> i bcome 2
    // 8. check if i < 4? yes i = 2
    // 9. print "hello"
    // 10. i++ -> i bcome 3
    // 11. check if i < 4? yes i = 3
    // 12. print "hello"
    // 13. i++ -> i bcome 4
    // 14. check if i < 4? no i = 4
    // 15. exit the Loop
    for (int i = 0; i<4 ; i++) { // Loop is counting = 0,1,2,3
      System.out.println("hello");
    }
    //output = hello x 4 times

    int y = 3;
    for (int i = 0; i < 3; i++) {
      y *= 3;
    }
      System.out.println("y=" + y);
    // y=81

    // 2
    // 4
    // 6
    for (int i = 0; i < 7; i++){
      if (i != 0 && i % 2 == 0){
        System.out.println(i);
      }
    }

    //1+2+3....10
    int sum = 0;
    for (int i = 0; i < 11; i++) {
      sum += i;
    }
      System.out.println("sum =" + sum); // 55

      // 2+4+6+8
      int sum2 = 0;
      for (int i = 0; i < 9; i++) { // % 2 is to find the even number
        if (i % 2 == 0) {
          sum2 += i;
        }
      }
        System.out.println("sum =" + sum2); //20

      //8
      //6
      //4
      //2
      for (int i = 9; i > 0; i--) {
        if (i % 2 ==0) {
          System.out.println(i);
        }
      }

      //break
      for (int i = 0; i < 10; i++) {
        if (i > 7) {
          break; //exit loop
        }
        System.out.println(i); ////main logic
      }
      //0
      //1
      //...
      //7

      // continue
      int total = 0;
      for (int i = 0; i < 5; i++) {
        if (i > 3) {
          continue; // when i = 4, skip "total += i", goes to "i++" 
        }
          total += i;
      }
      System.out.println("total =" + total);
    }
  }
