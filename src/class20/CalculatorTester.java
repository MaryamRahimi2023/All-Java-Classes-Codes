package class20;

public class CalculatorTester {

    public static void main(String[] args) {


        Calculator method1 = new Calculator();
        method1.add(10,10);// as per our entries java will find the best match method and select that
        method1.add(2,5,7);
        method1.add(45.0,23);
        method1.add(8,60.5);

        // if even java could not find the best method java will try best matching possible
        // by casting the data to other data type if there is no loss of information narrowing casting from small to big not gib to small



    }

}
