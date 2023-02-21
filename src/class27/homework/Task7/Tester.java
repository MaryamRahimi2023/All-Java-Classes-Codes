package class27.homework.Task7;

import java.util.Iterator;
import java.util.LinkedList;

public class Tester {

    public static void main(String[] args) {

        LinkedList<Card> name=new LinkedList<>();
        name.add(new Card(0.3,"Credit card"));
        name.add(new Card(0.5,"Debit card"));
        name.add(new Card(0.4,"Visa card"));

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i).cardType);
            System.out.println(name.get(i).interest);
            name.get(i).open();
            name.get(i).charges();
        }
        System.out.println("_______________________");

        for (Card card:name) {
            System.out.println(card.cardType);
            System.out.println(card.interest);
            card.open();
            card.charges();
        }
        System.out.println("________________________");

        Iterator <Card> iterator= name.iterator();
        while (iterator.hasNext()){
            Card c=iterator.next();
            System.out.println(c.cardType);
            System.out.println(c.interest);
            c.open();
            c.charges();
        }
    }
}
