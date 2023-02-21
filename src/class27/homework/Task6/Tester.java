package class27.homework.Task6;

import java.util.ArrayList;
import java.util.Iterator;

public class Tester {
    public static void main(String[] args) {


        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Corolla"));
        insurances.add(new Pet("Cat"));
        insurances.add(new Health());

        for (int i = 0; i < insurances.size(); i++) {
            System.out.println(Insurance.insuranceName);
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
            System.out.println("____________________");
        }

        for (Insurance company:insurances) {
            System.out.println(Insurance.insuranceName);
            company.getQuote();
            company.cancelInsurance();
            System.out.println("_____________________");
        }
        Iterator<Insurance> iterator= insurances.iterator();
        while (iterator.hasNext()) {
            System.out.println(Insurance.insuranceName);
           Insurance i= iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }
    }
}
