package class23;

public class PhoneTester {

    public static void main(String[] args) {
        
        Phone [] phones={new Samsung(),new Iphone(),new Google()};

        for (Phone phone:phones) {
            phone.displayPictures();
            phone.SendText();
            phone.unlockPhone();
            
        }
    }
}
