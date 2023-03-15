package class32;

public class ExceptionDemo2 {

    public static void main(String[] args) {// exceptions are error in run time

        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        try {
            // here we put the code which might throw an error and catch block is a back-up code if any exception error
            System.out.println(10/0);// if multiple error will take the first and ignore others
            String str="Java";
            str.charAt(10);
            String name=null;
            System.out.println(name.length());
        }catch (NullPointerException npe) {// if we put multiple exceptions blocks will catch the one related to our error
            System.out.println(npe);// we can only write one exception in catch blocks
        }catch (ArithmeticException e){
            System.out.println("someone divided number by 0");
        }catch (Exception f){// we put the parent class Exception in catch blocks if we are not sure what will be exactly the exception
            // for the error
            System.out.println("some thing went wrong");
        }

        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
        System.out.println("Line1");
    }
}
