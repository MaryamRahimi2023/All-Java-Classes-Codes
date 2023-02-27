package class28;

import java.util.Iterator;
import java.util.TreeSet;

public class Task2 {
    /* Create a Set collection in which you need to add names of the countries.
       In this set we want all objects to be sorted in alphabetical order.
       Using 2 different ways retrieve all elements from set.
     */

    public static void main(String[] args) {

        TreeSet<String> countries=new TreeSet<>();
        countries.add("Nepal");
        countries.add("Belgium");
        countries.add("Afghanistan");
        countries.add("UK");
        countries.add("Russia");

        System.out.println(countries);

        for (String country : countries) {
            System.out.println(country);
        }




    }
}
