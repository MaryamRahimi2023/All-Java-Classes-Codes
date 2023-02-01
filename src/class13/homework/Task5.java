package class13.homework;

public class Task5 {

    public static void main(String[] args) {

        // 5) How would you check if String is palindrome or not? aba=> true
        //Abbc =>false

        String str="Noon";
        boolean check=true;
        String reversed=new StringBuilder(str.toLowerCase()).reverse().toString();

        if(str.equalsIgnoreCase(reversed)){
            check=true;
            System.out.println("The String is a palindrome");
        }else {
            check=false;
            System.out.println("The String is not a palindrome");
        }
        System.out.println(check);
    }
}
