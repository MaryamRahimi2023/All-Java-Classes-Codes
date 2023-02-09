package class21;

public class Employee {

    String name;
   static int baseSalary=30000;
   static int baseHolidays=10;

    void printSalary(){
        System.out.println(baseSalary);
    }
    void printHolidays(){
        System.out.println(baseHolidays);
    }
}
class OfficeBoy extends Employee{

}
class Manager extends Employee{

    void printSalary(){
        System.out.println((baseSalary*4)+200000);// if task is the same and just we need to add something to that method we will overridie
        // the method from parent class and just add the changes
    }
}
class Developer extends Employee {
    void printSalary() {
        System.out.println((baseSalary * 3) + 30000);
    }
}

    class QA extends Employee {
        void printSalary() {
            System.out.println((baseSalary * 2) + 30000);
        }
       public void printHolidays(){// we can increase the visibility (access) of the method not decrease by making it private of protected
            System.out.println(baseHolidays+5);
        }
    }





