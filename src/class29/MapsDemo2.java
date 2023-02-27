package class29;

import java.util.HashMap;

public class MapsDemo2 {

    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Orange",2.99);
        fruit.put("Banana",4.99);
        fruit.put("Kiwi",0.99);
        fruit.put("Apple",0.00);
        fruit.put(null,null);
        System.out.println(fruit);// {null=null, Apple=0.0, Kiwi=0.99, Orange=2.99, Banana=4.99}

        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("Mascara",70.0);
        makeup.put("Eyeliner",12.2);
        makeup.put("Blush-on",12.2);

        HashMap<String,Double> groceries=new HashMap<>();// will not work with different datatype
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);// {null=null, Apple=0.0, Eyeliner=12.2, Kiwi=0.99, Mascara=70.0, Blush-on=12.2, foundation=40.0, Lipstick=50.0, Orange=2.99, Banana=4.99}



    }
}
