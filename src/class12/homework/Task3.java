package class12.homework;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        /* 3) Write a program that reads two people's first
               names and if they're expecting boy or girl?
               Based on the input suggests a name for a baby:
               Example Output:
               Mom’s first name? Mary
               Dad’s first name? Daniel
               Boy or Girl? boy
               Suggested baby name: DANRY

               Example Output:
               Mom’s first name? Mary
               Dad’s first name? Daniel
               Boy or Girl? girl
               Suggested baby name: MAIEL */

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is Father's first name:");
        String fFirstName=scanner.next();
        System.out.println("What is Mother's first name:");
        String mFName=scanner.next();
        System.out.println("Are you expecting a boy or a girl?");
        String baby=scanner.next();

        if(baby.equalsIgnoreCase("boy")){
            System.out.println("The baby boy name should be " +fFirstName.substring(0,fFirstName.length()/2)+mFName.substring(0,mFName.length()/2));
        }else {
            System.out.println("The baby girl name should be "+mFName.substring(0,mFName.length()/2)+fFirstName.substring(fFirstName.length()/2));
        }





    }
}
