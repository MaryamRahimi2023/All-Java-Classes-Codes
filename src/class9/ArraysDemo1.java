package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {

/*
        String [] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};
        // writing a loop to prints all the name
        System.out.println(names.length);
        for (int i = 0; i <= 6; i++) {
            System.out.println(names[i]);
        }*/

        String [] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};
        // writing a loop to prints all the name
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {// replace from top line the names.length in below line in order to get all name length we have
            System.out.println(names[i]);
        }
    }
}
