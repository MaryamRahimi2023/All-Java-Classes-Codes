package class19.homework.Task2;

public class Tester {
    public static void main(String[] args) {
        FullTimeEmp emp1=new FullTimeEmp("Finance","Abdullah",56748,(short)7500);
        emp1.details();
        emp1.weekdays();
        emp1.weekend();
        emp1.vacation();
        System.out.println("_______________________________");

        PartTimeEmp emp2=new PartTimeEmp("Morning","Samad",8765,(short) 50);
        emp2.details();
        emp2.weekdays();
        emp2.daysPresent(new String[]{"My shift is "+"Monday","Tuesday","Wednesday"});
        System.out.println("_______________________________");

        HRFullTimeEmp emp3=new HRFullTimeEmp("Supervising","HR Manager","Mobashir",5432,(short) 5000);
        emp3.details();// from itself
        emp3.weekdays();// from grandparent
        emp3.vacation();// from parent
        System.out.println(emp3.unpaidLeaves(3));

    }
}
