package Project1;

public class Task8 {
    public static void main(String[] args) {

/*        8)Write a Java Program to print the first 10 numbers of Fibonacci series.
            0 1 1 2 3 5 8 13 21 ... */


        int num1=0;
        int num2=1;
        int num3;

        System.out.print(num1+" ");
        System.out.print(num2+" ");

        for (int i = 2; i < 10; i++) {
            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;

        }

    }
}
