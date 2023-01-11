package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125; // if we try to put a smaller box inside the larger box the java will accept it coz it fits.
        // if I want to put a bigger box inside the smaller box java will not accept it unless we put the ().
        byte shorterNumber=(byte) number; // typecasting even if there is an error we will ask java to do it. forcing java to do it.
        // we need typecasting if we want to change one data to another or use others codes.
        float f=10.5f;
        // int num=10.5;
        int num=(int)f;

        System.out.println(shorterNumber); // so in int after add the decimal numbers are cut.
        System.out.println(num);

        float eggs=12.5f; // I only need the whole number not the decimals.
        int wholePart=(int)eggs;
        System.out.println(wholePart);



    }
}
