package class15.homework;


public class Task3Tester {

    // 3) Create a method that will print whether given String is palindrome or not.
    public static void main(String[] args) {

        Task3 palindrome=new Task3();
        palindrome.isPalindrome("noon");
        //System.out.println(palindrome.isPalindrome("noon")); can't use void methods in Println
        // String result=palindrome("noon"); cant assign void method to variables

    }
}
