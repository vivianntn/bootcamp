package order;

import java.math.BigDecimal;

public class Order {

  private static int count = 0;

  private int id;
  private Item[] items; //object ref
  private String coupon;

  public Order(String coupon) {
    this.id = ++count;
    this.items = new Item[0];
  }

  public int getId(){
    return this.id;
  }

  public Item[] getItems(){
    return this.items;
  }

  public double getDiscount(){
    if (isCouponValid())
    return 0.2d;
    return 0.0d;
  }

  public boolean isCouponValid(){
    return true;
  }

  public void addItem(Item item){
    Item[] itemList = new Item[this.items.length+1];
    for (int i = 0; i < this.items.length; i++){
      itemList[i] = this.items[i];
    }
    itemList[itemList.length-1] = item;
    this.items = itemList;
  }
    
  

  public double total(){
    BigDecimal amount = BigDecimal.valueOf(0L);
    for (int i = 0; i < this.items.length; i++){
      amount = amount.add(BigDecimal.valueOf(this.items[i].subtotal()));
    }
    amount  = amount.multiply(BigDecimal.valueOf(1.0 - getDiscount()));
    return amount.doubleValue();
  }

  public static void main(String[] args) {
    Order order = new Order("ABC");
    Item item = new Item(96.0d, 2);
    System.out.println(item.subtotal());
    order.addItem(item);

    Item item2 = new Item(10.0d, 3);
    order.addItem(item2);
    System.out.println(order.total());
  }
}
