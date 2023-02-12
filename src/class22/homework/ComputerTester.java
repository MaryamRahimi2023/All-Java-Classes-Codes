package class22.homework;

public class ComputerTester {

    public static void main(String[] args) {

        Computer [] computers={new Apple(),new Lenovo(),new HP(),new Dell()};

        for (Computer computer:computers) {

            computer.followInstructions();
            computer.processAndStoreData();

        }
    }
}
