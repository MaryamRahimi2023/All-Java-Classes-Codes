package class4;

public class IfElseConditions_2 {
    public static void main(String[] args) {

        boolean rain=true;
        if(rain){
            System.out.println("Lets take the umbrella");//  Plan A
        }else {
            System.out.println("Lets just take the hat");// Plan B
        }

        rain=false;
        if(rain){
            System.out.println("Lets take the umbrella");
        }else {
            System.out.println("Lets just take the hat");
        }

        boolean breakTime=true;
        if(breakTime){
            System.out.println("lets take a break");
        }else {
            System.out.println("Lets continue the class");
        }

    }
}
