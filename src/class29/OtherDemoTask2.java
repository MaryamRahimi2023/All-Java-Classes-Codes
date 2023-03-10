package class29;

import java.util.TreeMap;

public class OtherDemoTask2 {

        public static void main(String[] args) {

            TreeMap<String,String> countries=new TreeMap<>();
            countries.put("Nepal","Kathmandu");
            countries.put("Belgium","Brussels");
            countries.put("Afghanistan","Kabul");
            countries.put("UK","London");
            countries.put("Russia","Masscow");

            var values=countries.values();
            for (var value:values) {
                System.out.println(value.toUpperCase());
            }
            System.out.println("____________________________");
            var iterator=countries.values().iterator();
            while (iterator.hasNext()){
                var value=iterator.next();
                System.out.println(value);
            }
    }
}
