package class11.homework;

public class Task2 {

    public static void main(String[] args) {

        /*
        2) Create 2D array of cars : american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops */

        String [][] cars={{"Ford","Tesla"},
                {"Audi","BMW","Porsche"},
                {"Hyundai","Kia"},
                {"Ferrari","Lamborghini","Fiat"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("_______________________");

        for (String[] sum:cars){
            for (String brand:sum) {
                System.out.print(brand+" ");

            }
            System.out.println();

        }



    }
}
