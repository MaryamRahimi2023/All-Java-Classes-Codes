package class3;

public class OperatorDemo_3 {
    public static void main(String[] args) {
        int number=10;
        System.out.println(number/3);//3
        /* in Java, the modulo operator (%) can be used to perform the modulo operation,
        which returns the remainder of a division operation.
         */
        System.out.println(number%3);//1,   model of operators, 10%3=1 so one is the reminder
        /* For example, 9 % 3 is 0, because 9 can be evenly divided by 3 with no remainder. 10 % 3 is 1,
        because 10 divided by 3 has a remainder of 1. 11 % 3 is 2,
        because 11 divided by 3 has a remainder of 2.

         */
        System.out.println(16/5); // we use % to check the number is even or odd, we get 1 so number is odd
        System.out.println(16%5); //1, odd

        System.out.println(156%2); // if 0 the number is even if 1 the number is odd. we always take the moduluis by 2.
        System.out.println(155%2);

        System.out.println(1555%5);
    }

}
