package class16.homework;

public class Task2 {

    /*  1) Create a method that will take a String as a parameter and returns reversed String.
         Method should be available to all classes within your project and accessible by class name.

    */

    public static String reversedStr(String input){// instance method are without static word,
        // with static word we do not need to create an object and then call the method in the other class

        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {

        Task2 task2=new Task2();
        reversedStr("Monday");// if we are with the same class we don't even need class name just write the method name
    }
}
