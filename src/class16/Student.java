package class16;

public class Student {

    String name;
    String id;
   static String schoolName;// java is not going to reserve separate memory for this variable for all 3 zafar, hamid and nelson
    // only one memory location shared and just pointing to that for zafar, hamid and nelson's schoolName
    int age;
    double weight;

    void printName(){
        int SSN=1345454354;
        System.out.println(name);
        System.out.println(schoolName);
    }

    static void printStudentInfo(){
        // System.out.println(name); Can't access here
        System.out.println(schoolName);
    }

}
