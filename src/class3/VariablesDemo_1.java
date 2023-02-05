package class3;

public class VariablesDemo_1 {
    public static void main(String[] args) {
        int age=10; // requesting the computer to create a box of type int and store a value 10 in it.
        int salary;// only create a box of type int and don't assign any value to it. in java we can create empty boxes
        // without any value. I need the empty box in some cases when something is not clear, and we want to put on it data later on
        salary=120000; // updating or reassigning the variables
        System.out.println(salary);
        String name, city, country;//  we can create multiple empty boxes in a single line of code
        name="Maryam";
        city="Phila";
        country="USA";
        System.out.println(city);// we get error coz we did not assigned value to the city.
        System.out.println(country);
        char gender, letter;
        System.out.println(name);
        gender='F';
        System.out.println(gender);
        letter='M';
        System.out.println(letter);



    }
}
