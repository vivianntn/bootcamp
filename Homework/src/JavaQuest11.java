/**
 * Input: arrivalTime = 15, delayedTime = 5
 * Output: 20 Explanation: Reach at 15+5 = 20 (20:00).
 *
 */
public class JavaQuest11 {
  // You are given a positive integer arrivalTime denoting the arrival time of a
  // train in hours,
  // and another positive integer delayedTime denoting the amount of delay in
  // hours.
  // Calculate Delayed Arrival Time

  public static void main(String[] args) {
    String delayedArrivalTime1 = findDelayedArrivalTime(15, 5); // 20
    String delayedArrivalTime2 = findDelayedArrivalTime(23, 5); // 4
    String delayedArrivalTime3 = findDelayedArrivalTime(18, 6); // 0

    System.out.println(delayedArrivalTime1);
    System.out.println(delayedArrivalTime2);
    System.out.println(delayedArrivalTime3);
  }

  public static String findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    // code here ...
    int delayedArrivalTime = (arrivalTime + delayedTime) % 24;
    
    if (delayedArrivalTime == 0) {
        delayedArrivalTime = 24;
    }
    
    String explanation = delayedArrivalTime + " Explanation: Reach at " 
      + arrivalTime + "+" + delayedTime + " = " 
      + (arrivalTime + delayedTime) + " (" + (delayedArrivalTime < 10 ? "0" 
      + delayedArrivalTime : delayedArrivalTime) + ":00).";
    
    return explanation;
  
  }
}
