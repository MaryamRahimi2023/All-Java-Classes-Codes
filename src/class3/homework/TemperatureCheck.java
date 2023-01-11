package class3.homework;

public class TemperatureCheck {
    public static void main(String[] args) {

        int Temp=32;

        if(Temp<32){
            System.out.println("Water will freeze with temperature "+Temp);
        }
        else if (Temp>=32){
            System.out.println("Water will NOT freeze with temperature "+Temp);
        }
    }
}
