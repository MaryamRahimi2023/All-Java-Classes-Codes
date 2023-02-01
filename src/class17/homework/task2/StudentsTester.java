package class17.homework.task2;

import class17.homework.task2.Students;

public class StudentsTester {

    /* 2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
         Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
         Your program should print an average mark of each students name.
         NOTE: please use different names for instance and local variables.
     */

    public static void main(String[] args) {

        Students st1=new Students("Omid",70,80,90);
        st1.printAverage();
        Students st2=new Students("Susan",90,100,70);
        st2.printAverage();
        Students st3=new Students("Majeed",50,20,30);
        st3.printAverage();
        Students st4=new Students("Max",60,40,60);
        st4.printAverage();
        Students st5=new Students("Lola",45,50,97);
        st5.printAverage();
    }


}
