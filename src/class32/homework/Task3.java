package class32.homework;

public class Task3 {

    /*
        3) Create a method to check age eligibility that will throw a runtime exception.
        Method should throw an exception age is less than 16.
         */

    public static void main(String[] args) {

        ageEligibility(12);

        /*Exception in thread "main" java.lang.RuntimeException: Age Eligibility denied
        at class32.homework.Task3.ageEligibility(Task3.java:12)
        at class32.homework.Task3.main(Task3.java:20)*/

    }
    public static void ageEligibility(int age){

        if(age<16){
            throw new RuntimeException("Age Eligibility denied");
        }else {
            System.out.println("Age Eligibility Accepted");
        }
    }

}
