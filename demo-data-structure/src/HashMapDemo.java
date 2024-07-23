import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    // key & value pair
    HashMap<Integer, String> nameMap = new HashMap<>(); //key -> Integer, value -> String
    nameMap.put(100, "Vicent");
    //nameMap.put("Vincent", 100); // CANNOT, violate the hashMap definiition

    // we can get value by KEY
    System.out.println(nameMap.get(100)); //Vincent

    // you CANNOT get key by VALUE
    System.out.println(nameMap.get("Vincent")); //null

    // No ordering
    nameMap.put(1010,"Cindy");
    nameMap.put(-45, "Sally");
    System.out.println(nameMap.get(-45)); //Sally

    //Key + Value = Entry
    //A map consists of many entries

    // For LOOP -> HashMap.class
    // Loop for entries
    for (Map.Entry<Integer, String> entry : nameMap.entrySet()){ // ***important
      System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
    }

    //Handle duplicated key -> overwrite the value if the key exists
    nameMap.put(1010, "Peter");
    System.out.println(nameMap); //{1010=Peter, 100=Vicent, -45=Sally} -> replaced Cindy by Peter

    // null key
    nameMap.put(null, "Oscar"); //ok, null is a key
    System.out.println(nameMap); //{null=Oscar, 1010=Peter, 100=Vicent, -45=Sally}

    //null value
    nameMap.put(-45, null);
    System.out.println(nameMap); //{null=Oscar, 1010=Peter, 100=Vicent, -45=null}

    //
    String oldValue = nameMap.remove(1010); // remove entry by KEY
    System.out.println(nameMap); //{null=Oscar, 100=Vicent, -45=null}
    System.out.println(oldValue); //Peter

    System.out.println(nameMap.containsKey(-45)); //true

    // Loop keyset()
    for (Integer x : nameMap.keySet()){
      System.out.println(x); // Oscar Vincent
    }

    // Loop value()
    for (String x : nameMap.values()){
      System.out.println(x); // null
    }

    System.out.println(nameMap.size()); // 3
    
    System.out.println(nameMap.containsValue("Oscar")); // true
    System.out.println(nameMap.containsValue("Peter")); // false

  }
}
