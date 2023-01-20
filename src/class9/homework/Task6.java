package class9.homework;

public class Task6 {
    public static void main(String[] args) {

        /* 6) Create an array of countries.
        While retrieving all values from an array print capital for each country choose any five countries.
        */



        String[] country= {"Japan","China","Nepal","Malaysia","Korea","Russia"};

        for (int i = 0; i < country.length; i++) {
                switch (country[i]) {
                    case "Japan":
                        System.out.print("The capital of " + country[0] + " is Tokyo");
                        break;
                    case "China":
                        System.out.print("The capital of " + country[1] + " is Beijing");
                        break;
                    case "Nepal":
                        System.out.print("The capital of " + country[2] + " is Kathmandu");
                        break;
                    case "Malaysia":
                        System.out.print("The capital of " + country[3] + " is Kuala Lumpur");
                        break;
                    case "Korea":
                        System.out.print("The capital of " + country[4] + " is Seoul");
                        break;
                    case "Russia":
                        System.out.print("The capital of " + country[5] + " is Mascow");

                }
            System.out.println();
        }
    }
}
