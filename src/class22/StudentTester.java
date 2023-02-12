package class22;

public class StudentTester {

    public static void main(String[] args) {

        /* Student student0 = new SyntaxStudent(); could be call this way as well or below way
        Student student1 = new CollegeStudent();
        Student student2 = new SchoolStudent();*/

        Student [] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for (Student student:students){
            student.enrollment();
            student.attendance();// we can not call the specific child class behaviour here


        }


    }

}
