package class3;

public class IfElse_10 {
    public static void main(String[] args) {
        boolean hungry = true;
        System.out.println(hungry);
        System.out.println(!hungry);
        if (!hungry) {
            System.out.println("lets eat");

            if (!hungry) {// ! symbol can change true to false and false to true
                System.out.println(hungry);

            }
            boolean notHungry = false;
            System.out.println(notHungry);
            if (!notHungry) {
                System.out.println(hungry);
                System.out.println(notHungry);
            }
            if (!hungry) {
                System.out.println(notHungry);
            }


        }
    }
}
