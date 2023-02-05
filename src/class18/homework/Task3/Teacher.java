package class18.homework.Task3;

public class Teacher {

    /*Write a Java program called Teacher.
    Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher,
    ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes*/

    String name;
    int age;
    void scream(){
        System.out.println("aaaaaaa");
    }

    String eat(String a){

        if(a.equalsIgnoreCase("food")){
            return "Yeah, sure";
        }else {
            return "I will fail you";
        }
    }

    void homeWork(){
        System.out.println("Please do your homework everyday");
    }
    boolean helpWithHomework(String b) {
        if (b.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }
}
class mathTeacher extends Teacher{

    boolean alwaysPresent;
    void mathPrint(){
        System.out.println("do practice");
    }
}

class chemistryTeacher extends Teacher{
    boolean angry;
    void ChemPrint(){
        System.out.println("let's do an experiment");
    }
}
class pianoTeacher extends Teacher{

    String teaches="nothing";

    void pianoPrint(){
        System.out.println("Pay your fee");
    }
}