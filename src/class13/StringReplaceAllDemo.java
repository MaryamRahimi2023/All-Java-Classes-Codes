package class13;

public class StringReplaceAllDemo {

    public static void main(String[] args) {

        // USED FOR PATTERNS: uppercase, lowercase, numbers, 3 numbers, after j numbers and etc

        String str = "kjDDKhfGFDGHJGGHighdcf467784hjj%^&*9*(()";
        System.out.println(str.replaceAll("[A-Z]","#"));// all upercase letters from A-Z will be replaced
        System.out.println(str.replaceAll("[A-K]","#"));// only upercase letters A-K will be replaced
        System.out.println(str.replaceAll("[a-z]","#"));// the lowercase letters a-z will be replaced
        System.out.println(str.replaceAll("[0-9]","#"));// all numbers from 0-9 will be replaced
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));// do not replace ^ is used for not
        System.out.println(str.replaceAll("[^A-Za-z0-9]","")); // this will delete the elements which meets the

    }
}
