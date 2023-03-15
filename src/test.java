import java.util.ArrayList;
import java.util.LinkedList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class test {

    public static void main(String[] args) {

/*        LinkedList<Integer> number=new LinkedList<>();

        ArrayList<String> a=new ArrayList<>();

        for (int i=1; i<7; i++){
            a.add(i+""+i+i);
        }

        for (int i=0; i<5; i+=2){
            System.out.println(a.get(i));
        }

        ArrayList <Integer> b=new ArrayList<>();

        for (int i=111; i<667; i+=111){
            b.add(i);
        }

        for (int i=0; i<5; i+=2){
            System.out.println(b.get(i));
        }*/


        /*
        1) How would handle InputMismatchException? Input Mismatch Exception
        when user enters mismatch value then programmer expected.
         */
       /* Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int n = scan.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Input received must be a whole number");
        }
*/
        /*Scanner scan = new Scanner(System.in);


        try {
            System.out.print("Enter your account number: ");
            int accountNumber = scan.nextInt();
        } catch (InputMismatchException invalidAC) {
            System.out.println("Invalid input. Please enter numeric values for your account number");

        }*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");

        try {
            String name = scan.nextLine();
            System.out.println("Hello, " + name + "!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a string.");
        }

        String str = "name"; // initializing a String variable inside the try block

       System.out.println("The value of str is: " + str);

    }
}

