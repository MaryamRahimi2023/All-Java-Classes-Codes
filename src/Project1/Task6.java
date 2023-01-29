package Project1;

public class Task6 {
    public static void main(String[] args) {

/*      6)Write a program to swap 2 numbers without a temporary variable? */

        int a=5;
        int b=10;

        System.out.println("Before: ");
        System.out.println("x = "+a);
        System.out.println("y= "+b);

        System.out.println("*************************");

        a=a*b;   //50 (a=5*10)
        b=a/b;  //5 (b=50/10)
        a=a/b; //10 (a=50/5)

        System.out.println("After: ");
        System.out.println("x = "+a);
        System.out.println("y= "+b);

        System.out.println("*************************");

        // 2nd way

        a=a+b;//15
        b=a-b;//15-10=5=b=5
        a=a-b;//15-5=10= a=10

        System.out.println("a= "+a +" b= "+b);// back to first format coz I swap it in 1st way



    }
}
