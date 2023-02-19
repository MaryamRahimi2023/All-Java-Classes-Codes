package class27;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
public class BoxingDemo {
        public static void main(String[] args) {

            Integer integer=new Integer(10);// boxing
            int number=integer; // its auto unboxing
            int number2=integer.intValue(); // unboxing but not auto through int.Value we will get it

            double d=12.3;
            Double wrapperD=new Double(d); // boxing
            Double wrapperP=d; // or 10; // autoBoxing

            // Casting

            Float f=12f;
            ArrayList<Float> arrayList=new ArrayList<>();
            arrayList.add(12.0f);

            /* ArrayList<Double> arrayList=new ArrayList<>();
            arrayList.add(12.0f) error can not cast double to float different from primitive data type
            */

            /* ArrayList<Double> arrayList1=new ArrayList<>();
            arrayList.add(12.0); */

            double fg=12f;

        }
}
