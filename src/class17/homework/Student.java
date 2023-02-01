package class17.homework;

public class Student {

    /* 5) Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.
    */

    String name;
    String address;
    Student (String stName, String stAddress){
        name=stName;
        address=stAddress;
    }

    void displayInfo(){
        System.out.println(name+","+address);
    }

    public static void main(String[] args) {

        Student st1=new Student("Omid"," 400 lincoln Hwy,Fairless Hills, PA-19030");
        st1.displayInfo();
    }
}
