package class18;

public class Student {

    // Write a Student class   that have instance variables name and address. Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.


    String name;
    String address;

    Student(String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {

        Student student1=new Student("Jami","256 dunkin way Bensalem, PA 19040");
        student1.displayInfo();
    }


}
