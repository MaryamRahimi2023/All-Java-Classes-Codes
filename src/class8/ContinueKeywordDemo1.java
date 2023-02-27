package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if(i%3==0){// if the valuse of i is 3,6,9 skip the printing then continue
                // if(i==3||i==3||i==9)
                continue; // skip processing all codes inside body of this for loop for i=3,6,9 and will not print anything in console
                // when it sees the continue it get backs to the loop and continue printing the codes until target is achieved.
                // break will stop righaway and will not print anything anymore when it sees break
                // but in continue will continue until the target is archived like printing until 10 times

            }else {
                System.out.println(i);

            }System.out.println("Hello Java");



        }


    }
}
