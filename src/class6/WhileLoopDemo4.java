package class6;


import java.util.Scanner;

public class WhileLoopDemo4 {
    public static void main(String[] args) {

        int number=1;
        boolean flag=true;
        while (flag){

            System.out.println(number);
            if(number>3){
                flag=false;// here we store false value to store a condition and the loop stop otherwise it will keep going
                // we store the false condition in flag so until it is not true
                // the body is printing if it changed to false the next operation will not work.
            }
            number++;
        }






    }
}

