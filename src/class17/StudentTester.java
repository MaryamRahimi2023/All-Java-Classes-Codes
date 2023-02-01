package class17;

public class StudentTester {

    public static void main(String[] args) {


        Student student1=new Student ("S234","Omid",23,65.21);
        student1.printInfo();
        Student student2=new Student ("S204","Tamim",29,61.21);
        student2.printInfo();
        Student student3=new Student ("S274","Omar",27,63.21);
        student3.printInfo();
        Student student4=new Student ("S244","Osai",25,66.21);
        student4.printInfo();
        Student student5=new Student ("S254","Heram",20,68.21);
        student5.printInfo();

        Student student6=new Student("S654","Mosa",19);
        student6.printInfo();//
    }
}
