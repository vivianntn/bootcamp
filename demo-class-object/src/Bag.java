import java.util.Arrays;

public class Bag {
  private int[] integers;

  public Bag(){

  }

  public Bag(int[] integers){
    this.integers = integers;
  }
  
  public int[] getIntegers(){
    return this.integers;
  }

  public void setIntegers(int[] integers){
    this.integers = integers;
  }

  public String toString(){
    return "Bag(" + "integers=" + Arrays.toString(this.integers) + ")";
  }

  public static void main(String[] args) {
    int[] integers = new int[] {3, 1, 2};
    Bag b1 = new Bag(integers);
    System.out.println(b1.toString()); //Bag(integers=[3, 1, 2])

    //Bag(intgers = {100, -2, 6})
    System.out.println(new Bag(new int[] {100, -2,6}).toString());
  }

}
