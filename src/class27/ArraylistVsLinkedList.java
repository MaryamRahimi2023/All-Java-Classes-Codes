package class27;

import java.util.ArrayList;

public class ArraylistVsLinkedList {

    public static void main(String[] args) {
        // linkedLis => 160 ms  420
        // ArrayList => 67285
        long startTime=System.currentTimeMillis();
        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0,"Test Data");
        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);


    }
}

        /*// for linkedList it gets 16o milisecound to do thid

        long startTime=System.currentTimeMillis();

        LinkedList<String> number=new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            number.add(0, "Test data");// Creating a 0 index and update the test data in it
            // another index will be 1
        }
            long endTime=System.currentTimeMillis();
            System.out.println(endTime-startTime);// how much time this loop is taking

        long startTime=System.currentTimeMillis();

        LinkedList<String> number=new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            number.add(0, "Test data");// Creating a 0 index and update the test data in it
            // another index will be 1
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);// how much time this loop is taking*/


