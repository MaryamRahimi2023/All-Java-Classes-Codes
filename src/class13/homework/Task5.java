package class13.homework;

public class Task5 {

    public static void main(String[] args) {

        // 5) How would you check if String is palindrome or not? aba=> true
        //Abbc =>false

        String str="noon";

        String reversed=new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println("The String is a palindrome");
        }else {
            System.out.println("The String is not a palindrome");
        }
    }
}
