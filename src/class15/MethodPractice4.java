package class15;

public class MethodPractice4 {

    // create a method that takes two numbers as parameters and return the larger number

    int largeNumber(int number1, int number2){
        if(number1>number2){
            return number1;
        }else {
            return number2;
        }
    }

    int max (int a,int b){
        return Math.max(a,b);
    }

    public static void main(String[] args) {

            MethodPractice4 mp=new MethodPractice4();
            System.out.println(mp.largeNumber(2,3));// short way

            int number1=2;
            int number2=3;
            System.out.println(mp.largeNumber(number1,number2));



    }
}
