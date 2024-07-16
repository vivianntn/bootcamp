import java.math.BigDecimal;

public class Box2 {
  private String x;
public Box2(){
  this.x = "";
}
  public Box2 append(String y){
    this.x += y;
    return this;
  }

  public String toString(){
    return this.x;
  }

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("hello");
    System.out.println(sb);

    Box2 box = new Box2();
    box.append("hello");
    System.out.println(box);

    BigDecimal bd = new BigDecimal(0.0d);
    BigDecimal bd2 = bd.add(BigDecimal.valueOf(1.0d));//add() -> create new object
    System.out.println(bd.doubleValue());
    System.out.println(bd2.doubleValue());

  }
}
