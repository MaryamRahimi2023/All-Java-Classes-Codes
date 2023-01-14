package class8;

public class BreakKeywordDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i==6){
                break;// we can break the loops in the middle as well, we can achive the codes without break statement as
                // well it is just a facility to read our codes better and others can understand it better
                // break will stop righaway and will not print anything anymore
                // but in continue will continue until the atrget is achived like printing until 10
            }
            System.out.println(i);
        }
    }
}
