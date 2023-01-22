package class12;

public class PrinterTester {

    public static void main(String[] args) {

        Printer p1=new Printer();
        p1.name="HP";
        p1.model="5550";
        p1.year=2022;
        p1.color="black";

        p1.allInOne();
        p1.network();
    }
}
