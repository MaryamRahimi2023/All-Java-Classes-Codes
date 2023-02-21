package class27.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

    /* 4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.*/

    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Cola");
        drinks.add("Tea");
        drinks.add("Juice");
        drinks.add("Coffee");

        for (String drink:drinks) {

            if(drink.contains("a")|| drink.contains("e")) {
                drinks.set(drinks.indexOf(drink), "Water");
            }
            
        }
        System.out.println("After replacing"+drinks);


    }
}
