package class29;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {

        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("Mascara",70.0);
        makeup.put("Eyeliner",12.2);
        makeup.put("Blush-on",12.2);

        // to get all the keys we can use keySet Method from Map interface

        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);// [Eyeliner, Mascara, Blush-on, foundation, Lipstick]

        // Delete all the entries from the map for which the size of key is greater than 7
        allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);// [Mascara]
        System.out.println(makeup);// {Mascara=70.0}
    }
}
