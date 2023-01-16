package class8.homework;

public class test {
    public static void main(String[] args) {

        String [] country = {"Ukraine", "United Kingdom", "Uruguay", "Uganda", "Uzbekistan", "USA"};
        String [] capital = {"Kyiv", "London", "Montevideo", "Kampala", "Tashkent", "Washington, D.C."};

        for (int i = 0; i < country.length; i++) {
            System.out.println("The capital of "+country[i]+" is "+capital[i]);

        }

        //String[] country={"South Korea","Japan","France","Peru","Italy"};

       /* switch (country[3]){
            case "South Korea" :
                System.out.println("Captital city of "+country[0]+" is Seoul");break;
            case "Japan" :
                System.out.println("Captital city of "+country[1]+" is Tokyo");break;
            case "France" :
                System.out.println("Captital city of "+country[2]+" is Paris");break;
            case "Peru" :
                System.out.println("Captital city of "+country[3]+" is Lima");break;
            default:
                System.out.println("Captital city of "+country[4]+" is Rome");*/

    }
}
