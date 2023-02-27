package class29;

import java.util.*;

public class Task2 {
    /* Create a map of countries with its capital that will store countries in alphabetical order.
       Print all keys and values from a country map using for each loop and iterator.
       Print all values from a country map using for each loop and iterator. */
    public static void main(String[] args) {

        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("Nepal","Kathmandu");
        countries.put("Belgium","Brussels");
        countries.put("Afghanistan","Kabul");
        countries.put("UK","London");
        countries.put("Russia","Masscow");

        // Set<Map.Entry<String,String>> entrySet=countries.entrySet();// we use this in Map to prints values

        var entrySet=countries.entrySet();// var is only in java 10 not java 7, 8, so we need to follow the above

        for (var country : entrySet){
            System.out.println(country.getKey()+" "+country.getValue());
        }

        System.out.println("_____________________________");

        var country = countries.entrySet().iterator();

        while (country.hasNext()) {
           var entry = country.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
