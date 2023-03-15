package class32.Practice;

import class32.Practice.Calculator;

public class CalTester {

    public static void main(String[] args) {

        Calculator calculator=new Calculator();

        calculator.divide();

        // how to find the errors and figure it out

        /*Dividing
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at class32.Practice.Divider.divide(Divider.java:5)
        at class32.Practice.Calculator.divide(Calculator.java:12)
        at class32.Practice.CalTester.main(CalTester.java:11)*/

    }
}
