package class16.homework;

public class Task2 {

    /*  1) Create a method that will take a String as a parameter and returns reversed String.
         Method should be available to all classes within your project and accessible by class name.

    */

    public String str(String input){

        String reversed=new StringBuilder(input).reverse().toString();

        return reversed;
    }

    public static void main(String[] args) {

        Task2 string=new Task2();
        System.out.println(string.str("Monday"));
    }
}
