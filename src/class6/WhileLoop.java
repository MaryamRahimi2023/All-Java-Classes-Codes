package class6;


public class WhileLoop {
    public static void main(String[] args) {

        // System.out.println("Hello World"); // if we want to print this code 100000 times, so we use loops
       // System.out.println("Hello World");// we ask the loop to print this code 10 times
        // System.out.println("Hello World");

        int number=1;
        if(number<3){
            System.out.println("Hello World");
        }
        number++;// increment the value of variable by 1
        if(number<3){
            System.out.println("Hello World");
        }

        number++;
        if(number<3){
            System.out.println("Hello World");
        }

        int number1=0;
        if(number<3){
            System.out.println("Hello World");
        }
        number++;// increment the value of variable by 1
        if(number<3){
            System.out.println("Hello World");// to comment all codes ctr sfit /
        }

        number++;
        if(number<3){
            System.out.println("Hello World");
        }
// for loop
        int number2=0;
        while (number2<3){
            System.out.println("Hello World");
            number2++;// while print the body then go back to the condition and again print the body until the condition became false

        }
// for printing serval time the same body of the loop

        int number3=0;
        while (true) {// keeps on checking the condition as along as it returns true
            System.out.println("Hello World");
            number2++;// increment the numbers by one

        }
        // if we write number2++ outside the bracket of the loop then we get hello world text running forever
    }
}

