package class13.homework;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        // 6) How would you swap  2 strings without a temporary variable?

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name and last name: ");
        String str1=scanner.next();
        String str2=scanner.next();

        System.out.println("Before: " +str1+" "+str2);

        str1=str1+str2;
        str2=str1.substring(0,str2.length());
        str1=str1.substring(str2.length());

        System.out.println("After: "+str1+" "+str2);

    }
}
