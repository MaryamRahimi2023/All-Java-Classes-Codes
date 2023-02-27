package class28;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

         HashMap<String,Integer> groceries=new HashMap<>();// store two types of data, not index base key base
        // String act as Key and Integer as value
        // HashMap  not part of list collection so some methods not available

        // LinkedHashMap LinkedHashMap<String,Integer> groceries=new LinkedHashMap<>(); if need to maintain in order we can put

        // TreeMap<String,Integer> groceries=new TreeMap<>(); // if need to get result in Alphabetical order

        groceries.put("Eggs",10);// storing these labels and store based on indexes
        groceries.put("Milk",5);
        groceries.put("Bread",5);
        groceries.put("Rice",6);
        groceries.put("Meat",7);
        groceries.put("Soap",5);

        System.out.println(groceries.get("Rice"));// Rice key act as index and we get 6
        System.out.println(groceries);// {Soap=5, Eggs=10, Milk=5, Bread=5, Rice=6, Meat=7}
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());// how many entries (elements) are present
        System.out.println(groceries.remove("Meat"));
        System.out.println(groceries);

    }
}
