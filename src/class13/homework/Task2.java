package class13.homework;

public class Task2 {

    public static void main(String[] args) {

        // 2) Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str = "Working 1234 !@# hard";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length());





    }
}
