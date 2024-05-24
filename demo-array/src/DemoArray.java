import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 20;
        int x3 = -3;

        //When you create an array object, you have to define thr length of it
        int[] arr = new int[3]; //store int value only, length = 3
        // arr[index]
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = -3;
        System.out.println(arr[0]); //10
        System.out.println(arr[1]); //20
        System.out.println(arr[2]); //-3

        int[] arr2 = new int[] {10, 20, -3};
        System.out.println(arr2[0]); //10
        System.out.println(arr2[1]); //20
        System.out.println(arr2[2]); //-3

        //String array -> "hello", "abc", "ijk"
        //print all 3 String values
        String[] strings = new String[] {"hello", "abc", "ijk"};
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);

        byte[] bytes = new byte[] {2, 3, 4};
        long[] values = new long[] {2, 3, 4};
        double[] d1 = new double[] {2.0, 3.3, 4};

        // Arrays.
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(arr2));

        //9, -3, -100, 90, 66, -4
        //for loop print out all
        int[] arr3 = new int[] {9, -3, -100, 90, 66, -4};
        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }
        //loop
        //find the max value from arr 3
        int max = Integer.MIN_VALUE; //the min.value of int
        for (int i = 0; i < arr3.length; i++){
            if (arr3[i]>max){
                max = arr3[i];
            }
        }
        System.out.println("max=" + max);

        //find the min.value from arr3
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<arr3.length; i++){
            if (arr3[i]< min){
                min = arr3[i];
            }
        }
        System.out.println("min=" + min);

        //
        char[] arr4 = new char[] {'l', 'e', 'e', 'r', 'q'};
        // 1. count the number of 'e'
        int count = 0;
        for (int i = 0; i < arr4.length; i++){
            if (arr4[i] == 'e'){
                count++;
        }
        }
        System.out.println("The number of character e =" + count);

        // 2. boolean result to store if 'r' exist
        boolean isrExist = false;
        for (int i=0; i< arr4.length; i++){
            if (arr4[i] == 'r'){
                isrExist = true;
            break;
        }
    }
        System.out.println("Does character r exist? " + isrExist);

        // 3. String result to store "qreel"
        String s = "";
        for (int i = arr4.length - 1; i>= 0; i--){
            s += arr4[i];
        }
        System.out.println("Reversed char[] = " + s);
        
        // 4. Given two char[]
        char[] c1 = new char[] {'o', 'a', 'k', 'p'};
        char[] c2 = new char[] {'a', 'b', 'f', 't'};
                
        // 4a. result = "oakpabft", append all vharacters to a String value
        String result1 = "";
        for (int i = 0; i< c1.length; i++){
            result1 += c1[i];
        }
        for (int i = 0; i< c2.length; i++){
            result1 += c2[i];
        }
        System.out.println(result1);

        // 4b. result = when even index, get the value from c1, when odd index, get the value from c2
        String result2 ="";
        char[] c3 = new char[] {'o', 'a', 'k', 'p', 'a', 'b'};
        char[] c4 = new char[] {'a', 'b', 'f', 't'};
        //obkta
       
        //if(c1.length > c2.length){
            //length = c1.length;
            //}else{
                //length = c2.length;
            //}
        int length = c3.length > c4.length ? c3.length : c4.length;

        for (int i=0; i<length; i++){
            if(i%2 ==0 && i <c3.length){
            result2 += c3[i];
        }else if (i%2 == 1 && i <c4.length) {
            result2 +=c4[i];
        }
    }
    System.out.println(result2); //obkta
    }
}