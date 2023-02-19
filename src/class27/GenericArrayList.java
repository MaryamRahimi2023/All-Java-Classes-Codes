package class27;

import class25.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {

    public static void main(String[] args) {

        // ArrayList<String> food=new ArrayList<>();generic ArrayList to have only one type of object in collection.

        // Before java 5 we did not have <> which was so problematic that we could not do operation or apply methods of different datatype

        ArrayList name=new ArrayList();// non-generic (there were no diamond operators in java)
        // to have different data type of object in collection: you can put any datatype inside array, no one now use the Arrays like this
        name.add("Ehsan");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky","Green","unknown"));

        Object a=new String("Some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);// obj class is the Great father of all class and when we create a class  we can use it's methods

        for (Object j:name) {// there is a Parent class obj for anything in java so our created class can be a child and can you use it's methods
           // j.toString();
            ((String)j).trim();// if we want to use String class methods first we will cast it to String.

        }
        // no compile time error

        // but will get error in run time; hard to find run time error and costly business will lose customers
        // the application crash or bug happened while customer was using the App

        // so java developers created <> to reduce the run time error
    }
}
