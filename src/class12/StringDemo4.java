package class12;

public class StringDemo4 {
    public static void main(String[] args) {

        String firstName="";// inside this variable is a boolean true or false
        boolean isEmpty=firstName.isEmpty();// checks if the string is empty or not count the space as well,
        // used while we want to log in  and write the username if we do not it asks that it is empty
        System.out.println(firstName.isEmpty());// we can write without assign the boolean variable to isempty as well
        System.out.println(firstName.isBlank());// checking the samething but will not count the space

        String firstName1=" ";
        boolean empty=firstName1.isEmpty();
        System.out.println(firstName1.isEmpty());


    }
}
