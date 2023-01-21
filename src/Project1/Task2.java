package Project1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

/*        2)Using Scanner create an array of countries. When an array is created,
            retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops). */

        Scanner scan=new Scanner(System.in);
        System.out.println("How many countries do you know in South America?");

        int size= scan.nextInt();

        String [] country=new String[size];

        System.out.println("Please enter name of these " +size+" countries:");

        for (int i = 0; i < country.length; i++) {
            System.out.print("");
            country[i]=scan.next();
        }
        System.out.println(Arrays.toString((country)));

        for (int i = 0; i < size; i++) {

            switch (country[i].toLowerCase()) {
                    case "argentina":
                        System.out.println("The capital of "+country[i] + " is Buenos Aires");
                        break;
                    case "bolivia":
                        System.out.println("The capital of "+country[i] + " is La Paz");
                        break;
                    case "brazil":
                        System.out.println("The capital of "+country[i] + " is Brasília");
                        break;
                    case "chile":
                        System.out.println("The capital of "+country[i] + " is Santiago");
                        break;
                    case "colombia":
                        System.out.println("The capital of "+country[i] + " is Bogotá");
                        break;
                    case "cuba":
                        System.out.println("The capital of "+country[i] + " is Havana");
                        break;
                    case "ecuador":
                        System.out.println("The capital of "+country[i] + " is Quito");
                        break;
                    case "guyana":
                        System.out.println("The capital of "+country[i] + " is Georgetown");
                        break;
                    case "paraguay":
                        System.out.println("The capital of "+country[i] + " is Asunción");
                        break;
                    case "peru":
                        System.out.println("The capital of "+country[i] + " is Lima");
                        break;
                    case "suriname":
                        System.out.println("The capital of "+country[i] + " is Paramaribo");
                        break;
                    case "uruguay":
                        System.out.println("The capital of "+country[i] + " is Montevideo");
                        break;
                    case "venezuela":
                        System.out.println("The capital of "+country[i] + " is Caracas");
                        break;
                    default:
                        System.out.println(country[i]+" is not a South American country");


            }

        }

    }

}

