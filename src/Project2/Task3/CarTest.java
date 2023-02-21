package Project2.Task3;

public class CarTest {

    public static void main(String[] args) {

        Car [] cars={new Sedan(7000,"Black",17),new Truck(8000,"Red",2200)};
        for (Car car:cars) {
            System.out.println(car.calculateSalePrice());

            // or creating object separately is the 2nd way

            /*
            Sedan sedan=new Sedan(7000,"Black",17);

            System.out.println("Sedan Price "+sedan.calculateSalePrice());
            System.out.println(sedan.carPrice);
            System.out.println(sedan.color);
            System.out.println(sedan.length);

            Truck truck=new Truck(8000,"Red",2200);
            System.out.println("Truck Price "+truck.calculateSalePrice());
            System.out.println(truck.carPrice);
            System.out.println(truck.color);
            System.out.println(truck.weight);
            */

        }
    }
}
