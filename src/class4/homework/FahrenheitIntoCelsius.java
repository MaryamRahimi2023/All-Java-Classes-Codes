package class4.homework;

import java.util.Scanner;

public class FahrenheitIntoCelsius {
    public static void main(String[] args) {

        // Create a Java program that will ask user to input city and temperature.
        // Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”


        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your city");
        String city=input.nextLine();
        System.out.println("What is the temperature there in Fahrenheit");
        double temp= input.nextDouble();
        double Cl=(0.5556)*(temp-32);
        System.out.println("The temperature in the "+city+" is "+ Cl + " celsius " );


    }
}
