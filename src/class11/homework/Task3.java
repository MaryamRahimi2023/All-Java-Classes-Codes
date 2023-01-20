package class11.homework;

public class Task3 {

    public static void main(String[] args) {
        /* 3) Using 2D array create a grocery list.
              Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops

        */

        String [][] groceryList={{"tomatos","eggplant","potatoes"},
                {"pears","watermelon","banannas"},
                {"butter","yogurt","cheese"},
                {"kitkat","cake","chocolate"},
        };

        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("____________________");

        for (String [] list:groceryList) {
            for (String item:list) {
                System.out.print(item+" ");

            }
            System.out.println();
        }
    }
}
