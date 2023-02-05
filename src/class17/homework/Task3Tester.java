package class17.homework;

public class Task3Tester {

    /* 3) Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.
     */

    public static void main(String[] args) {

        Task3 task1=new Task3("Maryam");
        //Task3 task2=new Task3(true); private modifiers, can't be called in a different class
        Task3 task3=new Task3('F');
        Task3 task4=new Task3(70.45f);
    }


}
