package class18.homework.Task3;

public class TeacherTester {

    public static void main(String[] args) {

        Teacher obj1=new Teacher();
        mathTeacher obj2=new mathTeacher();
        chemistryTeacher obj3=new chemistryTeacher();
        pianoTeacher obj4=new pianoTeacher();

        System.out.println("______________________");
        obj1.name="Nasir";
        obj1.age=30;
        obj1.scream();
        System.out.println(obj1.eat("Sandwich"));
        obj1.homeWork();
        System.out.println(obj1.helpWithHomework("yes"));

        System.out.println("____________________________");
        obj2.name="Muna";
        obj2.age=27;
        obj2.scream();
        obj2.eat("Burger");
        obj2.homeWork();
        obj2.helpWithHomework("yes");
        obj2.alwaysPresent=true;

        System.out.println("____________________________");
        obj3.name="Huma";
        obj3.age=40;
        obj3.scream();
        System.out.println(obj3.eat("Pasta"));
        obj3.homeWork();
        System.out.println(obj3.helpWithHomework("yes"));
        obj3.angry=true;

        System.out.println("____________________________");
        obj4.name="Mina";
        obj4.age=30;
        obj4.scream();
        System.out.println(obj4.eat("Peanut"));
        obj4.homeWork();
        System.out.println(obj4.helpWithHomework("no"));
        obj4.teaches="hard";

    }
}
