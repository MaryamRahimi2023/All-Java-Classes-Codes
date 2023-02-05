package class17.homework.task2;

import class17.homework.Task3;

public class Task3Tester {

    public static void main(String[] args) {

        Task3 task1=new Task3("Maryam");// public modifiers can be called in different class and package inside your project
        //Task3 task2=new Task3(true); private modifiers, can't be called in a different class or package
        //Task3 task3=new Task3('F'); default modifiers, can't be called in a different package
        //Task3 task4=new Task3(70.45f); protected modifiers,can't be called in a different package
    }
}
