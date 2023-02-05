package class18;

public class Teacher {

    String name;
    int teacherID;
    String subject;

    Teacher(String name,int teacherID ){
        this.name=name;
        this.teacherID=teacherID;
    }
    Teacher(String name, int teacherID, String subject){
        /*this.name=name;
        this.teacherID=teacherID; I already created so lets just call*/
        this(name,teacherID);
        this.subject=subject;
    }
    void print(){
        System.out.println(name+" "+teacherID+" "+subject);
    }
}
