package class11.homework;

public class PhoneTester {
    public static void main(String[] args) {

        /* 1) Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors. */

        Phone phone1=new Phone();
        phone1.brand="iPhone";
        phone1.model="Pro Max 13";
        phone1.color="Golden";
        phone1.storage=512;
        phone1.fingarPrintScanner=true;
        phone1.cameraMP=12;

        phone1.call();
        phone1.Text();
        phone1.GPS();

        Phone phone2=new Phone();
        phone2.brand="Pixel";
        phone2.model="Pixel Pro 6";
        phone2.color="Aurora";
        phone2.storage=256;
        phone2.fingarPrintScanner=true;
        phone2.cameraMP=12;

        phone2.call();
        phone2.Text();
        phone2.GPS();

        Phone phone3=new Phone();
        phone3.brand="Samsung";
        phone3.model="Galaxy S21";
        phone3.color="Phantom White";
        phone3.storage=517;
        phone3.fingarPrintScanner=true;
        phone3.cameraMP=12;

        phone3.call();
        phone3.Text();
        phone3.Internet();




    }
}
