package class28;

import java.util.LinkedList;
import java.util.List;

public class ChangingObjDemo {

    public static void main(String[] args) {

       /* List<String> list=new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("mama");
        list.add("papa");
        System.out.println(list);*/

        // if I need to change the object due to some better performance of programing, so only I should change the first line
        // all other following methods will be the same coz List(variable type interface which these classes implement)
        // is a parent interface that can store multipart child class objects which is polymorphism

        List<String> list=new LinkedList<>();// polymorphism
        list.add("hi");
        list.add("hello");
        list.add("mama");
        list.add("papa");
        System.out.println(list);

    }
}
