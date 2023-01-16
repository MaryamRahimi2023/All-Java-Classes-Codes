package class9.homework;

public class Task4 {
    public static void main(String[] args) {

        /* 4) Create an array that can store names of cars and store 6 elements into it. Print all values from the array. */

        String[] cars=new String[6];

        cars[0]="Toyota Camry";
        cars[1]="Honda Civic";
        cars[2]="Ford Mustang";
        cars[3]="Chevrolet Silverado";
        cars[4]="Tesla Model S";
        cars[5]="BMW 3 Series";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }







    }
}
