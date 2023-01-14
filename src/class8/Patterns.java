package class8;

public class Patterns {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {// outer for loop controls how many lines of stars we want to print
            for (int j = 0; j < 20; j++) {// inner for loop will control how many stars we want to print
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------------------------");

        for (int h = 0; h < 3; h++) {
            for (int g = 0; g < 5; g++){
                if (h == 1 || h == 2) {
                    continue;// two iterations are skipped
                }System.out.print("$ ");
            }
        }System.out.println();

        System.out.println("*******************");

        for (int f = 0; f < 3; f++) {
            for (int g = 0; g < 5; g++) {
                System.out.println("0");
                if (f == 1 || f == 2) {
                    continue;// two iterations are skipped
                }
                System.out.print("* ");
            }
        }System.out.println();
    }
}
