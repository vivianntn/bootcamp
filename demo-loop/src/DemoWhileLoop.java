public class DemoWhileLoop {
  public static void main(String[] args) {
    for (int i =0; i < 5; i++){
      System.out.println(i);
    }

    int i = 0;
    while(i < 5) {
      System.out.println(i);
      i++;
    }

    int[] arr = new int[] {10, -100, 9, 7};
    //sum all numbers by While Loop
    int sum = 0;
    i = 0;
    while (i < arr.length) {
      sum += arr[1];
      i++;
    }
    System.out.println(sum);

    i = 0;
    while (i < 100) {
      if (i> 30) {
        break;
      }
      i++;
    }
    System.out.println("i= " + i); //31

    //123 -> 1 + 2 + 3 -> 6
    //100 -> 1 + 0 + 0 -> 1
    //4563 -> 4 + 5 + 6 + 3 -> 18

    int a = 123;
    sum = 0;
    while (a > 0) {
       sum += a % 10;
       a = a / 10; // 123 -> 12
    }
    System.out.println(sum);

    //Reversed number
    // 54321 -> 12345
    // 101 -> 101

  }
}
