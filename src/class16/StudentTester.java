package class16;

public class StudentTester {

    public static void main(String[] args) {

        Student student=new Student();
        student.name="Zafar";
        student.id="123";
        student.age=22;
        student.weight=70;
        student.schoolName="Syntax";

        Student student1=new Student();
        student1.name="Hamid";
        student1.id="456";
        student1.age=5;
        student1.weight=86;
        student1.schoolName="Syntax";

        Student student2=new Student();
        student.name="Nelson";
        student.id="789";
        student.age=26;
        student.weight=90;
        student.schoolName="Syntax";
        //System.out.println(student2.schoolName); we can use it outside the object coz it is a static variable.
        //System.out.println(student2.name); we will get a null if we print coz it is a instance variable and can not access outside the object (Student student=new Student();)
        System.out.println(Student.schoolName); // another way that you might see a lot to access static variables
    }
}
