package class6;


public class WhileLoopDemo1Increment {
    public static void main(String[] args) {

        // write a loop to print numbers from 1 to 100
        // write a loop to print odd numbers from 1 to 15, even 2,4,6,8 ----odd 3,5,7,
        // write a loop to print these number 5,10,15,20,25,30.... 50

        int number=1;
        while (number<101){
            System.out.println(number);
            number++;
        }

        int number1=1;
        while (number1<=15){
            System.out.println(number1);
            number1+=2;
        }
        int number2=5;
        while (number2<=50){
            System.out.println(number2);
            number2+=5;
        }

    }
}

