package class28;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo3 {

    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Banana");
        System.out.println(fruit); // [Apple, Banana, Kiwi, Mango, Orange] remove the duplicate plus sort the data to Alphabetical order

        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(100);
        numbers.add(20);
        numbers.add(35);
        numbers.add(50);
        System.out.println(numbers);// remove the duplicate plus sort the data to Numerical order



    }
}
