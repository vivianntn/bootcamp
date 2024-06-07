import java.util.Arrays;

/**
 * Example Output Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] nums2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] nums3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] nums4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    System.out.println(checkSecondMax(nums));
    // Your program should be able to handle all the above test case.
    int secondMax = 0;
    int max = Integer.MIN_VALUE;
    // code here ...
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > max)
        max = nums[i];
      if (nums[i] <= max && nums[i] > secondMax)
        secondMax = nums[i];
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          secondMax = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = secondMax;
          System.out.println(
              "i : " + i + " , j : " + j + " , secondMax : " + secondMax);
          System.out.println(Arrays.toString(nums));
        }
      }
    }
    // System.out.println("max : " + max);
    System.out.println("secondMax : " + secondMax);
    System.out.println(Arrays.toString(nums));
  }

  public static int checkSecondMax(int[] nums) {
    int max = Integer.MIN_VALUE;
    int secondMax = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        secondMax = max;
        max = nums[i];
      } else if (nums[i] > secondMax && nums[i] != max) {
        secondMax = nums[i];
      }
    }
    System.out.println("max : " + max);
    System.out.println("second : " + secondMax);

    return secondMax;
  }
}
