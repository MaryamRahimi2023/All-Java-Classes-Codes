package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.0);
        numbers.add(20.0);
        numbers.add(30.0);
        numbers.add(40.0);
        numbers.add(10.0);

        System.out.println(numbers);

       /*for (Double number:numbers) {
          if (number > 11.0) {
                numbers.remove(number);// error due to changing size of Array (ConcurrentModificationException)
       }*/

           // so we use Iterator to remove to not get error

           Iterator<Double> iterator = numbers.iterator(); // getting the object of iterator

           while (iterator.hasNext()) {
               double number= iterator.next();
               if (number > 11) {
                   iterator.remove();
               }
           }
       System.out.println(numbers);
        /*
        // how iterator works:

        System.out.println(iterator.hasNext());// true
        System.out.println(iterator.next());// shift the pointer 10.0
        System.out.println(iterator.hasNext());// true
        System.out.println(iterator.next());// shift the pointer 10.0
        System.out.println(iterator.hasNext());// error no more elements
        System.out.println(iterator.next());// error
        // hasNext() keeps on returning true as long as there are elements left to be iterated
        */

        // for more flexibility we use lambda

        numbers.removeIf(number->number>11);
        System.out.println(numbers);
    }
}
