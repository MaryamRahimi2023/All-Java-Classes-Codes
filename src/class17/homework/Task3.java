package class17.homework;

public class Task3 {

    /* 3) Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.
     */

    public Task3(String sName){

    }
    private Task3(boolean Smart){

    }
    Task3(char sGender){

    }
    protected Task3(float avgMarks){

    }

    public static void main(String[] args) {
        Task3 task1=new Task3("Maryam");
        Task3 task2=new Task3(true);// private method only can be called inside the same class
        Task3 task3=new Task3('F');
        Task3 task4=new Task3(70.45f);
    }


}
