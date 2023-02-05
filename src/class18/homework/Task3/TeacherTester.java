package class18.homework.Task3;

public class TeacherTester {

    public static void main(String[] args) {

        Teacher obj1=new Teacher();
        mathTeacher obj2=new mathTeacher();
        chemistryTeacher obj3=new chemistryTeacher();
        pianoTeacher obj4=new pianoTeacher();

        System.out.println("______________________");
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        obj1.scream();
        System.out.println(obj1.eat("Sandwich"));
        obj1.homeWork();
        System.out.println(obj1.helpWithHomework("yes"));

        System.out.println("____________________________");
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        obj2.scream();
        System.out.println(obj2.eat("Burger"));
        obj2.homeWork();
        System.out.println(obj2.helpWithHomework("yes"));
        System.out.println(obj2.alwaysPresent);

        System.out.println("____________________________");
        System.out.println(obj3.name);
        System.out.println(obj3.age);
        obj3.scream();
        System.out.println(obj3.eat("Pasta"));
        obj3.homeWork();
        System.out.println(obj3.helpWithHomework("yes"));
        System.out.println(obj3.angry);

        System.out.println("____________________________");
        System.out.println(obj4.name);
        System.out.println(obj4.age);
        obj4.scream();
        System.out.println(obj4.eat("Peanut"));
        obj4.homeWork();
        System.out.println(obj4.helpWithHomework("no"));
        System.out.println(obj4.teaches);

    }
}
