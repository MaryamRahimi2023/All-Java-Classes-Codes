package Project2.Task2;

public class MarksTester {

    public static void main(String[] args) {

        Marks [] students={new StudentA(89,90,76),
                            new StudentB(90,66,87,100)};

        for (Marks student:students) {
            System.out.println(student.getPercentage()+"%");

        }
    }
}
