package class4;

public class IfDemo_1 {
    public static void main(String[] args) {

        int money=15000;
        if(money>1000){
            System.out.println("Lets buy an Iphone");
        }// we need a pair of curly bracket for each if condition
        if(money>2000){
            System.out.println("Lets also buy a Macbook");
        }
        boolean mothersDay=true;
        if(mothersDay) {
            System.out.println("Happy Mother's Day");
        }
        String name="Sardar";
        if(name.equals("Sardar")){// for srting we need .equals to ask for equal or == (equal method is only used for non-primitives)
            System.out.println("I love football");// ctrl+alt+l to format the brackets.
        }
    }
}
