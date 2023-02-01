package class17.homework;

public class Task3Tester {

    /* 3) Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.
     */

    public static void main(String[] args) {

        Task3 obj=new Task3('M');// default method
        Task3 obj2=new Task3(69);// protected method
    }


}
