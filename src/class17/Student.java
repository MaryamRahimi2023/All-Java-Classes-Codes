package class17;

public class Student {

    String id;
    String name;
    int age;
    double weight;

    public Student(String studentId,String studentName,int studentAge,double studentWeight) {// This is a constructor, and only it takes the class name
        //method use for implement the logic but constructor use for initialize, 95% constructors are created by public modifiers
        id = studentId;
        name =studentName;
        age =studentAge;
        weight =studentWeight;
    }
    public Student(String studentId,String studentName,int studentAge){// we can write multipart constructors at the same time more or less elements but
        // if we have 2 same elements we will get error we can change the place of variables or type to work
        id = studentId;
        name =studentName;
        age =studentAge;
    }
    void printInfo(){
        System.out.println("ID "+id+" Name "+name+" age "+age+" Weight "+weight);
    }
}
