package class29.homework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {

    /*
    2) Create a Person class with following private fields: name, lastName, age, salary.
       Variables should be initialized through constructor.
       Inside the class also create a method to print user details.
       In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
       Print each object details.*/
}
class Person{

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void printUserDetails(){
        System.out.println("Name "+name+" Last Name "+lastName+" Age "+age+" Salary "+salary);

    }
}
class Test{
    public static void main(String[] args) {

        Map<Integer,Person> person=new TreeMap<>();
        person.put(3,new Person("Majeed","Rahimi",23,25000));
        person.put(4,new Person("Mati","Rahimi",20,2000));
        person.put(2,new Person("Yousof","Farhat",17,15000));
        person.put(1,new Person("Arteen","Saqib",19,2200));

        // Set<Map.Entry<Integer,Person>> personDetails=person.entrySet(); or
        var personDetails=person.entrySet();
        for (var personDetail : personDetails) {
            System.out.print(personDetail.getKey()+" ");
            personDetail.getValue().printUserDetails();
        }

    }
}