package class17.homework;

public class Task3 {

    /* 3) Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.
     */

    public Task3(String sName){

    }
    private Task3(int sID){

    }
    Task3(char sGender){

    }
    protected Task3(double avgMarks){

    }

    public static void main(String[] args) {

        Task3 obj=new Task3(1008);// private method

    }


}
