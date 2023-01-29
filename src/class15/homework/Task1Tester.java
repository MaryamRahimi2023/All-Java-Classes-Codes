package class15.homework;

public class Task1Tester {

    // 1) Create a method that will take 2 parameters as a numbers and prints which number is larger.

    public static void main(String[] args) {

        Task1 lNumber=new Task1();
        System.out.println(lNumber.largeNumber(100,200));

        //2nd way

        int number1=100;
        int number2=200;
        System.out.println(lNumber.largeNumber(number1,number2));

    }
}
