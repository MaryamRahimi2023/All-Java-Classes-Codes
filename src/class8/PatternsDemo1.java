package class8;

public class PatternsDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {// number of lines
            if(i==1){
                System.out.println();
                continue;
            }
            for (int j = 0; j < 5; j++) {// number of stars
                System.out.println("* ");
            }
            System.out.println();

        }
    }
}
