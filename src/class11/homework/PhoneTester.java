package class11.homework;

public class PhoneTester {
    public static void main(String[] args) {

        /* 1) Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors. */

        Phone iphone=new Phone();
        iphone.brand="iPhone";
        iphone.model="Pro Max 13";
        iphone.color="Golden";
        iphone.storage=512;
        iphone.fingarPrintScanner=true;
        iphone.cameraMP=12;

        iphone.call();
        iphone.Text();
        iphone.GPS();

        Phone googlePixel=new Phone();
        googlePixel.brand="Pixel";
        googlePixel.model="Pixel Pro 6";
        googlePixel.color="Aurora";
        googlePixel.storage=256;
        googlePixel.fingarPrintScanner=true;
        googlePixel.cameraMP=12;

        googlePixel.call();
        googlePixel.Text();
        googlePixel.GPS();

        Phone samsungGalaxy=new Phone();
        samsungGalaxy.brand="Samsung";
        samsungGalaxy.model="Galaxy S21";
        samsungGalaxy.color="Phantom White";
        samsungGalaxy.storage=517;
        samsungGalaxy.fingarPrintScanner=true;
        samsungGalaxy.cameraMP=12;

        samsungGalaxy.call();
        samsungGalaxy.Text();
        samsungGalaxy.Internet();




    }
}
