package class16;

public class Student1 {

    /*

    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */

    String name;
    String id;
    static int numberOfStudents=0;

    public static void main(String[] args) {

        Student1 nazir=new Student1();
        nazir.name="Jamshid";
        nazir.id="S12345";
        nazir.numberOfStudents++;

        Student1 Omid=new Student1();
        Omid.name="Jamsh";
        Omid.id="S10986";
        Omid.numberOfStudents++;

        Student1 Majeed=new Student1();
        Majeed.name="Jamshidjan";
        Majeed.id="S1256";
        Majeed.numberOfStudents++;
        System.out.println(Student1.numberOfStudents);





    }
}
