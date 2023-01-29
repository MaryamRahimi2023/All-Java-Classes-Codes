package class15;

import java.util.Scanner;

public class MethodsDemo1Tester {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a number");
       int num= scanner.nextInt();

        System.out.println("You entered "+num);

        MethodsDemo1 methods=new MethodsDemo1();
      // String num2= methods.doSomeThing();
        String c=methods.method2();

    }
}
