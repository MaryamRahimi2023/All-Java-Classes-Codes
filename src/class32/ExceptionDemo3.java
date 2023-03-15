package class32;

public class ExceptionDemo3 {

    public static void main(String[] args) {// exceptions are error in run time 

        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");
        System.out.println("Line5");
        System.out.println("Line6");

// how to find anf figure out the errors from console after run

           // System.out.println(10/0);
            String str="Java";
            str.charAt(10);// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10

        System.out.println("Line7");
        System.out.println("Line8");
        System.out.println("Line9");
        System.out.println("Line10");
        System.out.println("Line11");
    }
}
