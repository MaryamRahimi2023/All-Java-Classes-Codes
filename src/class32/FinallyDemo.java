package class32;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("1"); // 1

        try {
            System.out.println("2");// 2
           // System.out.println(10/0);// ArithmeticException: / by zero
            String name=null;
            name.length();// .NullPointerException
            System.out.println("3");// ignored not printed after exception
        }catch (ArithmeticException ae){
            System.out.println("4");// 4
            System.out.println(10/0);// ArithmeticException: / by zero, and no catch block for this exception
            System.out.println("5");// ignored not printed after exception
        }
        finally {// will close the browsers even exceptions error acquires in test cases as practical example
            // basically finally is used to cleaning all of our code after executing the codes (no mather what are our codes inside the try/catch)
            // to clean up system, resources
            // finalize is a method of object class can be called by any classes which will clean the memory or cleanup logic if no more references to the object in memory.
            // but not recommended to use coz Performance issues:because it can delay the garbage collection process.
            // and Unpredictable nature: The finalize() method is called by the garbage collector at an unpredictable time, and there is no guarantee that it will be called at all.
            // This can make it difficult to rely on the finalize() method for critical cleanup operations.

            System.out.println("Will always be executed");// Will always be executed, this will print even after exception error
        }
        System.out.println("6");// ignored not printed after exception
    }
}
