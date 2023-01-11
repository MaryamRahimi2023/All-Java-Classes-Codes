package class6;


public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="China";
        //System.out.println(country.toLowerCase());

        switch ((country.toLowerCase())) { // coverts the text to lowercase USA=usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "itlay":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kabab");
            default:
                System.out.println("Wrong country");

        }
    }
}

