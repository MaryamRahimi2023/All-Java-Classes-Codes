package class9;

public class ArraysDemo {

    public static void main(String[] args) {

        String name="Slava";
        String name1="Safi";
        String name2="Jason";
        String name3="Nabi";
        String name4="Anees";

        String [] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};

        /*System.out.println(name2);// we can not enter this way we will not get an output
        System.out.println(names[4]);// Anees
        System.out.println(names[3]);// Nabi
        System.out.println(names[5]); // Joseph
       // System.out.println(names[500]); // error because there is no name on the index 500
       // System.out.println(names[-5]);  // error due to negative number*/

        for (int i = 0; i <= 5; i++) {
            System.out.println(names[i]);
        }
    }
}
