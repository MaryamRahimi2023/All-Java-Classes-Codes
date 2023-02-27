package class28;

import java.util.HashSet;

public class HashSetDemo1 {

    public static void main(String[] args) {

        HashSet<String> fruit=new HashSet<>();// do not allow duplicate values and does not care about maintain insertion order
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit);// [Kiwi, Mango, Orange] does not maintain insertion order

    }
}
