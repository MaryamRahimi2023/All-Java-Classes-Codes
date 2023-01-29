package class15.homework;

public class StudentTester {

    // 6) Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F
    public static void main(String[] args) {

        Student grades=new Student();
        System.out.println(grades.getGrade(50));


    }

}
