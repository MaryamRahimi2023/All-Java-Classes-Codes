package class15.homework;

public class Task3 {

    // 3) Create a method that will print whether given String is palindrome or not.

    void isPalindrome(String input){

        String reversedStr=new StringBuilder(input).reverse().toString();

        if(input.equals(reversedStr)){
            System.out.println(input+" Is a Palindrome");;
        }else {
            System.out.println(input+" Is not a Palindrome");
        }
    }

}
