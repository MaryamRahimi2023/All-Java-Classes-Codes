package class11.homework;

public class Task6 {

    public static void main(String[] args) {

        /* Create 2D array of countries: north america countries, south america countries, europe countries, asian countries,
         african countries.
        Then print all values from that array using 2 different loops and calculate how many total countries been stored
        */

        String [][] countries={{"Canada", "Mexico","United States","Belize"},
                               {"Brazil","Argentina","Chile","Colombia"},
                               {"Germany","United","Kingdom","France","Spain"},
                               {"China","India","Japan","Russia"},
                               {"Egypt","Nigeria","South Africa","Ethiopia"}
        };

        int sum=0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                sum++;
            }
            System.out.println();
        }
        System.out.println("The total number of countries "+sum);

        System.out.println("_________________________________");


        int sum1=0;

        for (String [] x:countries) {
            for (String b:x) {
                System.out.print(b+" ");
                sum1++;

            }
            System.out.println();
        }System.out.println("The total number of countries "+sum1);





    }
}
