package class28.homework;

import java.util.LinkedHashSet;

public class Task1 {

    /* Create a Set of cities in which you want to make sure that insertion order is maintained.
       Then remove any city that starts with “A”;
      */
    public static void main(String[] args) {

        LinkedHashSet<String> cities =new LinkedHashSet<>();

        cities.add("New York");
        cities.add("Bensalem");
        cities.add("Austin");
        cities.add("Atlanta");
        cities.add("Chicago");
        cities.add("Albany");
        System.out.println("Before removing "+cities);
        cities.removeIf(c->c.startsWith("A")||c.startsWith("a"));
        System.out.println("After removing "+cities);
    }
}
