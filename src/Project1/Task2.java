package Project1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

/*        2)Using Scanner create an array of countries. When an array is created,
            retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops). */

        Scanner scan=new Scanner(System.in);
        System.out.println("How many countries are in South America?");

        int size= scan.nextInt();

        String [] country=new String[size];
        String [] capital=new String[size];

        System.out.println("Please enter name of these countries:");

        for (int i = 0; i < size; i++) {
            country[i]=scan.nextLine();
        }

        for (int i = 0; i < country.length; i++) {
            country[i]=scan.nextLine();
            switch (country[i].toLowerCase()) {
                    case "argentina":
                        System.out.println("The capital of "+country[i] + " is Buenos Aires");
                    case "bolivia":
                        System.out.println("The capital of "+country[i] + " is La Paz");
                    case "brazil":
                        System.out.println("The capital of "+country[i] + " is Brasília");
                    case "chile":
                        System.out.println("The capital of "+country[i] + " is Santiago");
                    case "colombia":
                        System.out.println("The capital of "+country[i] + " is Bogotá");
                    case "cuba":
                        System.out.println("The capital of "+country[i] + " is Havana");
                    case "ecuador":
                        System.out.println("The capital of "+country[i] + " is Quito");
                    case "guyana":
                        System.out.println("The capital of "+country[i] + " is Georgetown");
                    case "paraguay":
                        System.out.println("The capital of "+country[i] + " is Asunción");
                    case "peru":
                        System.out.println("The capital of "+country[i] + " is Lima");
                    case "suriname":
                        System.out.println("The capital of "+country[i] + " is Paramaribo");
                    case "uruguay":
                        System.out.println("The capital of "+country[i] + " is Montevideo");
                    case "venezuela":
                        System.out.println("The capital of "+country[i] + " is Caracas");
                    default:
                        System.out.println("This country is not a South American country");

            }

        }

    }

}

