import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
public static void main(String[] args) {
  Queue<String> pq = new PriorityQueue<>();
  pq.add("def"); //sorting, [def]
  pq.add("abc"); //sorting, [def, abc] -> [abc, def]
  pq.add("bbb"); //sorting, [abc, def] -> [abc, bbb, def]
  pq.add("aax");
  System.out.println(pq); //[abc, bbb, def], add() method doesn't perform sorting..

  //while loop
  while (!pq.isEmpty()){
    System.out.println(pq.poll()); // complete sorting when you call poll() method.
    // abc, bbb, def

    // PriorityQueue.class add() and poll() differs to LinkedList.class (implementation)
    List<String> pq2 = new LinkedList<>();
    pq2.add("def"); 
    pq2.add("abc"); 
    pq2.add("bbb"); 
    pq2.add("aax");
    System.out.println(pq2);
    Collections.sort(pq2); //error bc didn't implement comparable
    System.out.println(pq2);
    // 1. Java 8 -> Stream (List)
    // 2. Convert to Array -> Arrays.sort()

    Queue<Integer> pq3 = new PriorityQueue<>(); 
    pq3.add(-23);
    pq3.add(1000);
    pq3.add(10);
    pq3.add(-200);
    System.out.println(pq3.poll()); //-200
    pq3.add(-400);
    System.out.println(pq3.poll()); //-400
    System.out.println(pq3.poll()); //-23
    System.out.println(pq3.poll()); //10
    System.out.println(pq3.poll()); //1000
    
  }
}
}
