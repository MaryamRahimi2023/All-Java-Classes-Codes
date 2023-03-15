package class32.Practice;

public class Calculator {

        public void add(){

        }
        public  void  divide(){
            System.out.println("Dividing");

            Divider divider=new Divider();
            divider.divide();

            System.out.println(10/0);
            System.out.println("Done");
        }
}
