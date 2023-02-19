package class26;

public class BoxingDemo {

    public static void main(String[] args) {

        int number = 15;
        printData(number);// AutoBoxing, converting a primitive to a reference type automatically
    }

    public static void printData(Integer number){
        System.out.println(number);
    }

}
