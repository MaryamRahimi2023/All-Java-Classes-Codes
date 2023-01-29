package class15.homework;

public class Task3 {

    // 3) Create a method that will print whether given String is palindrome or not.

    boolean isPalindrome(String input){
        String reversed= new StringBuilder(input).reverse().toString();
        if(input.equals(reversed)){
            return true;
        }else return false;
    }

}
