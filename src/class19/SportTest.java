package class19;

public class SportTest {

    public static void main(String[] args) {

         Cricket cricket=new Cricket("Cricket","Pakistan","Green Helmet");
         cricket.display();
         cricket.print();

        Soccer soc=new Soccer("Soccer","Argentina","Oliver's",12);
        soc.display();
        soc.displayTeam();
    }

}
