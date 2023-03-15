package class32.homework;

public class Task4 {

    /*
        4) Create a method checkUserName that will throw a runtime exception.
        Method should throw an exception when entered username is less than 5 characters.
         */

    public static void main(String[] args) {

        checkUserName("MR");

        /*Exception in thread "main" java.lang.RuntimeException: username is less than 5 characters
        at class32.homework.Task4.checkUserName(Task4.java:11)
        at class32.homework.Task4.main(Task4.java:18)*/

    }
public static void checkUserName(String str){
    if(str.length()<5){
        throw new RuntimeException("username is less than 5 characters");
    }else {
        System.out.println("Enter password");
    }
}

}
