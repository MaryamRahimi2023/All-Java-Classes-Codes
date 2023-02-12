package class6;


public class WhileLoopDemo3 {
    public static void main(String[] args) {


        int number=1;
        int sum=0;
        while (number<=5){
            sum=sum+number;
            System.out.println(number);
            number++;
        }
        System.out.println(sum);

        System.out.println("if the sout is inside the bracket the different result");

        int number1=1;
        int sum1=0;
        while (number1<=5){
            sum1=sum1+number1;
            number1++;
            System.out.println(sum1);
        }


    }
}

