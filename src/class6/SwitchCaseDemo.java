package class6;


import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a country name:");
        String country=scanner.next();

        //System.out.println(country.toLowerCase());

        switch (country.toLowerCase()) { // coverts the text to lowercase USA=usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "itlay":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kabab");
                break;
            default:
                System.out.println("Wrong country");

        }
    }
}

