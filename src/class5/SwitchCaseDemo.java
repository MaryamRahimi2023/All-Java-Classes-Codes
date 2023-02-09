package class5;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        // this way we can perform with if else too, but we are using this way coz it is way faster and only working
        // with one variable
        // writing break is important if no break java will go to each case's if break then java will go exactly to that case

        int day=2;
        switch (day){// relational operators >,<,==,!=,<=,>=, logical operators !, ||, && no working with these

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");
        }

        int day1 = 10;
        if (day1 == 1) { // we can convert this codes to Switch case statement by putting your click after i and f in if the bulb will appear
            // click on it and go to option replace with switch
            System.out.println("Monday");
        } else if (day1 == 2) {
            System.out.println("Tuesday");
        } else if (day1 == 3) {
            System.out.println("Wednesday");
        } else if (day1 == 4) {
            System.out.println("Thursday");
        } else if (day1 == 5) {
            System.out.println("Friday");
        } else if (day1 == 6) {
            System.out.println("Saturday");
        } else if (day1 == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong day");}



    }
}
