package class11.homework;

public class Task1 {

    public static void main(String[] args) {

        // 1) Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        // Then your program should print name of the students that has A and B grade

        String [][] names={{"Luna","Jasper","Nova","Phoenix"},
                           {"A","B","C","D"},
        };
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length ; j++) {
                if (names[i][j].equals("A") || names[i][j].equals("B")) {
                    System.out.println(names[0][j] + " has A grade or B grade ");
                }
            }
            System.out.println();

        }

    }
}
