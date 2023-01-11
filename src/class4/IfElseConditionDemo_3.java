package class4;

public class IfElseConditionDemo_3 {
    public static void main(String[] args) {

        int day=1;

        if(day==1){
            System.out.println("Monday");// If Block
        }else {
            System.out.println("Some other day than Monday"); // else Block
        }

        day=2;

        if(day==1){
            System.out.println("Monday");// If Block
        }else {
            System.out.println("Some other day than Monday"); // else Block
        }

        day=1;// day=2, day=2, day=3, day=4, day=5, day=6, day=7, day=8

        if(day==1){
            System.out.println("Monday");// If Block
        }else if(day==2) {
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Please enter a day between 1-7");// this will print only if we have day=8
        }







    }
}
