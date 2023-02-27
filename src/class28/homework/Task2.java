package class28.homework;

import java.util.HashSet;
import java.util.Set;

class Student {

    /*  Create a Set collection that will hold Objects of Student Type. In this set we do not care
       about the insertion order. Each student object should have name and studentID.
       Display name of each student. */

    public static void main(String[] args) {

        Set<Student> student= new HashSet<>();

        student.add(new Student("Majeed", 123));
        student.add(new Student("Laila", 456));
        student.add(new Student("Omid", 567));
        student.add(new Student("Maryam", 555));

        for (Student students : student) {
            System.out.println(students.getName());
        }



    }

    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }
}
