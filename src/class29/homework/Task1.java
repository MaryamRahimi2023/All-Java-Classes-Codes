package class29.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {

    /*
    1) Create a map of Best Buy store. Place
    item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet. */

    public static void main(String[] args) {

        Map<Integer,String> items=new HashMap<>();

        items.put(1000,"Apple laptop");
        items.put(2000,"Canon Printer");
        items.put(3000,"HP Printer");
        items.put(4000,"TV");

        // Set<Map.Entry<Integer,String>> entrySet= items.entrySet();

        var entrySet= items.entrySet();
        for (var entry : entrySet) {
           // System.out.println(entry); or
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
