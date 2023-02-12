package class22;


        /* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
        Define common behavior within parent class and override some methods in child classes
        Define some methods specific to child classes
        Write example of achieving run time polymorphism */

public class Student {

    public void enrollment(){
        System.out.println("Enrollment is the first step to process your Application");
    }
   public void attendance(){
        System.out.println("90% Attendance is required for the classes to be enrolled");

    }

}
class SyntaxStudent extends Student{

    @Override
    public void enrollment() {
        super.enrollment();
    }

    @Override
    public void attendance() {
        super.attendance();
    }

    public void fee(){

      System.out.println("You should be able to pay $825 each month");
  }


}
class CollegeStudent extends Student {

    @Override
    public void enrollment() {
        super.enrollment();
    }

    @Override
    public void attendance() {
        super.attendance();
    }
    public void eslScore(){
        System.out.println("You need to have good ESL score");
    }
}
class SchoolStudent extends Student{

    @Override
    public void enrollment() {
        super.enrollment();
    }

    @Override
    public void attendance() {
        super.attendance();
    }

    public void studyHard(){

        System.out.println("You need to study hard");
    }
}
