package class15.homework;

public class Task4 {

    // 4)Create a method that will say Hello in different language based on the country that will passed when method is executed

    String input(String country) {

        switch(country.toLowerCase()){
            case "china":
                return "hai";
            case "iran":
                return "Salaam";
            case "england":
                return "Hello";
            case "africa":
                return "Hallo";
            case "poland":
                return "witam";
            default:
                return "Unknown country";
        }
    }
}
