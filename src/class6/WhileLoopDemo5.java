package class6;


public class WhileLoopDemo5 {
    public static void main(String[] args) {

        boolean condition=true;
        int number=0;
        while (condition){
            System.out.println("Hello world");
            if(number>3){
                condition=false;
            }
            number++;

            int number1=0;
            while (number1<10){
                if(number1%2==0){// while debug and can not see any operation like number1%2 then we right-click and add a watch
                    System.out.println("Even "+number1);}
                }
                number1++;

                int number2=0;
                while (number2<10) {
                    if (number2%2==1) {// while debug and can not see any operation like number1%2 then we right-click and add a watch
                        System.out.println("Odd " + number2);
                    }
                    number2++;
                }           }
    }
}

