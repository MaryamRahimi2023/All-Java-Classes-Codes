package class31;

public class ExceptionDemo1 {

    public static void main(String[] args) {

        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        try {
            System.out.println(10/0);
        }catch (Exception e) {
            System.out.println(e);// java.lang.ArithmeticException: / by zero
        }

        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");

        /*Two main types of runtime errors:
        Exception
        Error

        With the exception ending we will avoid this type of issues (The whole app crashing due to one function not running properly).

                If you think you are writing code that will have problems later on running properly, you can use 
        try {
            problematic line of code goes here
        } catch (Exception e) {
            sout (e);
        }

        The issue will still occur, but the rest of the code will continue working.
        Exceptions are issues that occur in the runtime, and they stop the app of working normally. The mechanism to stop this is to use
        try blocks.*/

    }
}
