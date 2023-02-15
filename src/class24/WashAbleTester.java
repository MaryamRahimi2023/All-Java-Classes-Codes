package class24;

public class WashAbleTester {

    public static void main(String[] args) {

        WashAble [] washAbles={new SmartWatch(),new Phone(),new Inverter() };

        for (WashAble washable:washAbles) {
            washable.wash();

        }
    }
}
