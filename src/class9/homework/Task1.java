package class9.homework;

public class Task1 {
    public static void main(String[] args) {

// 1) Create an array of chars and store grades into it: A,B,C,D,E,F.
// Then print a grade B (use 2 different ways of creating an array).

    // First way

        char [] letters={'A','B','C','D','E','F'};
         System.out.println(letters[1]);

    // 2nd way

       char [] grades=new char[5];

        grades[0]='A';
        grades[1]='B';
        grades[2]='C';
        grades[3]='D';
        grades[4]='E';

        for (int i = 4; i < grades.length ; i++) {
            System.out.println(grades[1]);

        }














    }
}
