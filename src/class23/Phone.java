package class23;

public abstract class Phone {// we declare this class abstract as well that no one can create an object of this class

    /* create a phone class lets create abstract methods like displayPictures
     unlockPhone SendText
     2 child classes Iphone Samsung Google and provide specific implementation
     lets write code to achieve runtime polymorphism */

    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void SendText();

}

class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Iphotos to display pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("FaceId to unlock the phone");
    }

    @Override
    void SendText() {
        System.out.println("send text by IMessages");
    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Using Gallary APP to browse the photos\"");

    }

    @Override
    void unlockPhone() {
        System.out.println("Using finger print sensor or camera");
    }

    @Override
    void SendText() {
        System.out.println("Messages app to send the message");
    }
}
class Google extends Phone{
    @Override
    void displayPictures() {
        System.out.println("display pictures in gallary");

    }

    @Override
    void unlockPhone() {
        System.out.println("lock by code");
    }

    @Override
    void SendText() {
        System.out.println("send text by messages");
    }
}
