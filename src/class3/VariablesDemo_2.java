package class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {
        // int number=10;
        int number3=10;
        System.out.println(number3);// I can rename it and will rename everywhere. right click=refactor=rename
        System.out.println(number3);
        System.out.println(number3);
        System.out.println(number3);

        int age=10;
        System.out.println(age);
        age=20;
        System.out.println(age);
        int number=10;
        age=number;
        System.out.println(age);
        age=number+10;
        System.out.println(age);
        age=age+20;
        System.out.println(age);

    }
}
