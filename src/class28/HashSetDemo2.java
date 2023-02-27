package class28;

import java.util.LinkedHashSet;

public class HashSetDemo2 {

    public static void main(String[] args) {

        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit); // [Mango, Kiwi, Orange] maintain the insertion order
    }
}
