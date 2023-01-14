package class7;

import java.util.Scanner;

public class WhileLoopDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        boolean condition=true;
        Scanner scanner=new Scanner(System.in);

        int number=15;
        while(condition){// while loop always working with boolean true or falase we can write true
            // or save true inside a variable then write in while loop or with the help of regional operations
            System.out.println("Please enter a number between 10 to 20");
            int userNumber=scanner.nextInt();
            if(userNumber>number) {
                System.out.println("You entered number is greater");
            } else if (userNumber<number) {
                System.out.println("You entered a smaller number");
            }else {
                System.out.println("You won!!!!");
                condition=false;
            }

            }

        }
}
