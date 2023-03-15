import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Map<String,Object>> dataList= new ArrayList<>();

        Map<String,Object> appleMap=new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

        dataList.add(appleMap);

        Map<String,Object> orangeMap=new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);

        dataList.add(orangeMap);

        double totalPurchase=0;
        for (var list : dataList) {
            String item=(String) list.get("Items");
            double price=(double) list.get(("Price"));
            double quantity=(int) list.get("Quantity");

            double subTotol=price*quantity;

            totalPurchase+=subTotol;

            System.out.println("Items: " +item+" Price: "+price+ " Quantity: " +quantity+" SubTotal: "+subTotol);
            System.out.println();
        }
        System.out.println();
        System.out.println("Your Purchase total : "+totalPurchase);
    }
    /*Scanner scan=new Scanner(System.in);

                System.out.println("Please enter your username:");
    String str = scan.next();
                try {
        if(str.equals("Maryam.Rahimi"))
            System.out.println("Please enter your password:");
    }catch(InputMismatchException usernameInvalid){
        System.out.println("Username is not valid");
        System.out.println("Please try again");
*/
}
