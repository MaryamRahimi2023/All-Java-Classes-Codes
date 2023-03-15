package class32.homework;

import java.util.LinkedList;
import java.util.List;

public class Task2 {

     /*
        2) Create a static method that will return a List of Exceptions.
        Inside your method create objects of 4 exception classes using
        try and catch blocks and store them inside your list.
        Call your method inside main and print name and details of all
        Exception objects.
         */
     public static void main(String[] args) {

         exceptionList();
     }
    public static List<Exception> exceptionList(){
        List<Exception> list=new LinkedList<>();

        try {
            System.out.println(2/0);
        }catch (ArithmeticException ae){
            System.out.println(ae+ " is not divisible by 0");// java.lang.ArithmeticException: / by zero is not divisible by 0
            list.add(ae);
        }
        try {
            String [] array=new String[5];
            System.out.println(array[6]);
        }catch (IndexOutOfBoundsException ie){
            System.out.println(ie+ "No element found in index 6");// java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5No element found in index 6
            list.add(ie);
        }
        try {
            String str=null;
            System.out.println(str.length());
        }catch (NullPointerException ne){
            System.out.println(ne+ "null object error found");// java.lang.NullPointerExceptionnull object error found
            list.add(ne);
        }

        try {int age=-5;
            if(age<0){
                throw new IllegalArgumentException("Age can not be negative");
            }
        }catch (IllegalArgumentException iae){
            System.out.println(iae);// java.lang.IllegalArgumentException: Age can not be negative
            list.add(iae);
        }
        return list;
    }

}
