package class8;

public class test {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i+=4) {// outer for loop
            for (int j = 0; j < 5; j++) {// inner for loop
                System.out.println("i = " + i + " j = " + j);
            }
            System.out.println("********************");
        }
    }
}
