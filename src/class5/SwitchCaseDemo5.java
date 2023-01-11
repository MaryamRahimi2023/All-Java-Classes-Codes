package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender m f");
        char gender=scanner.next().charAt(0);

        switch (gender){

            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            case 'm':  // no breaks so if m this case or M both will print Male
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }


    }
}
