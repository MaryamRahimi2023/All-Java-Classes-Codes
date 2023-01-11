package class6.homework;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        /*Ask user to enter their country and capture it. Once values are captured print which language user speaks.
        Allow user to enter grade and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
        should print which grade was entered by a user with explanation.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your country name");
        String country=scan.next();

        switch ((country.toLowerCase())){

            case"usa":
                System.out.println("English");
                break;
            case"pakistan":
                System.out.println("Urdo");
                break;
            case "germany":
                System.out.println("German");
                break;
            case"ozbekistan":
                System.out.println("Ozbek");
                break;
            case"iran":
                System.out.println("Farsi");
        }
        System.out.println("From the scale of A to D how will you grade your language skill");
        char grade=scan.next().charAt(0);
        if(grade=='A'){
            System.out.println("You entered "+grade+" and it is graded Excellent");
        }else if(grade=='B'){
            System.out.println("You entered "+grade+" and it is graded Good");
        }else if (grade=='C'){
            System.out.println("You entered "+grade+" and it is graded Average");
        } else if (grade=='D') {
            System.out.println("You entered "+grade+" and it is graded Bad");
        }else {
            System.out.println("Not Acceptable");
        }scan.close();




    }
}

