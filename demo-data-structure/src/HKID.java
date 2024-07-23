import java.util.HashMap;
import java.util.Objects;

public class HKID {
  private String value;

  public HKID(String value){
    this.value = value;
  }

  public String getValue(){
    return this.value;
  }

  @Override
  public String toString(){
    return "HKID(" + "value=" + this.value + ")";
  }

  // if you don't override equals() and hashCode(),
  // it extends them from Object.class (from where?)
  // so, we compare "hkid object 1" and "hkid object 2" 

  // if you override equals() and hashCode(),
  // if implies that you want to define their condition to be equal yourself.
  @Override
  public boolean equals(Object obj){
    if (this == obj)
    return true;
    if (!(obj instanceof HKID))
    return false;
    HKID hkid = (HKID) obj;
    return Objects.equals(this.value, hkid.getValue());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.value);
  }

  public static void main(String[] args) {
    HashMap<HKID, Customer> customerMap = new HashMap<>();
    //"A1234567", 34, John
    //"H2345678", 18, "Jenny"
    customerMap.put(new HKID("A1234567"), new Customer(34, "John")); // List<Customer>

    HKID hkid = new HKID("H2345678");
    Customer customer = new Customer(18, "Jenny");
    customerMap.put(hkid, customer); // put() logic compare existing keys and the new key

    //duplicated key "A1234567"
    //put one more customer with same key -> "A1234567", 34, "John"
    customerMap.put(new HKID("A1234567"), new Customer(21, "Oscar"));
    System.out.println(customerMap); // 3 entries

    // why? how to solve?
    // solution: Override equals() and hashCode() in Key.class (HashMap<key, value>)

    System.out.println(new HKID("1234").equals(new HKID("1234")));
    // true, just because you override equals() and hashCode()

    // put() -> use equales() and hashCode()
    // objective of equals() and hashCode() = identify if they're the same object
    // HashMap.class equals() is to identify if they are the same key
    // check address = check value
   
    //put() program flow; hashmap.put(key, value) -> calls key.equals() & key.hashCode()

    // how about HashMap<String, String> ?
    // String.class is already done, you cannot change the implementation of equals() and hashCode()
    // so String.equals() compares the calue itself to determine if they are same object

    // all 8 wrapper classes cannot change the implementation
    System.out.println(new Integer(120).equals(new Integer(120))); // true
    System.out.println(new Integer(120) == (new Integer(120))); //false
  }
}
