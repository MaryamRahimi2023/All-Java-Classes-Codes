package class19.homework.Task2;

public class Employee {

    /* 2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
          Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
          Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
          Test your code!*/

    String name;
    int empID;
    private short empSalary;

    void weekdays(){
        System.out.println("I am tired");
    }
    void weekend(){
        System.out.println("Still gets up at 6 AM in the weekends");
    }

    Employee(String name,int empID,short empSalary){
        this.name=name;
        this.empID=empID;
        this.empSalary=empSalary;

    }
    void details(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+empID);
        System.out.println("Salary: "+empSalary);
    }
}
class PartTimeEmp extends Employee{
    String shift;
    void daysPresent(String[]days){
        for (String day:days) {
            System.out.print(day+" ");
        }
        System.out.println();

    }
    PartTimeEmp(String shift, String name, int empID, short empSalary){
        super(name,empID,empSalary);
        this.shift = shift;
    }
    void details(){
       super.details();
        System.out.println("Shift: "+shift);
    }
}
class FullTimeEmp extends Employee{
    String department;
    void vacation(){
        System.out.println("I need vacation");
    }
    FullTimeEmp(String department, String name, int empID, short empSalary){
        super(name,empID,empSalary);
        this.department = department;
    }
    void details() {
        super.details();
        System.out.println("Department: "+department);

    }
}
class HRFullTimeEmp extends FullTimeEmp{
    String responsibility;

    String unpaidLeaves(int x){
        return "If you take "+x+" days of unpaid leaves, wages of "+x+" days will be deducted from your payroll";
    }

    HRFullTimeEmp(String responsibility,String department,String name,int empID,short empSalary){
        super(department,name,empID,empSalary);
        this.responsibility=responsibility;
    }
    void classDetails(){
        System.out.println("Responsibility: "+responsibility);
    }
    void details() {
        super.details();
        classDetails();

    }
}