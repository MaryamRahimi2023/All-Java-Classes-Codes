package class22.homework;

public class ComputerTeacherSolved {

    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.*/


    public static void main(String[] args) {
        // int a=(int)12.5; data type casting

        ComputerTeacherSolved [] computers={new Apple1(),new HP1()};

        for (ComputerTeacherSolved computer:computers){
            computer.playVideo();
            computer.browserInternet();

            // if we need to call the instance variable and variables of the child class

            if(computer instanceof Apple1){ // we are checking if the variable computer contains the object of an Apple class
                Apple1 apple=(Apple1)computer; // converting the variable computer back to an apple object
                apple.installApp();
                apple.editVideos();
                System.out.println(apple.OS="seven");
                System.out.println(apple.RAM=1298);
            }
        }
    }

    int RAM;
    int storage;
    String OS;

    void playVideo(){
        System.out.println("Video is playing");
    }
    void browserInternet(){
        System.out.println("Browse the internet");
    }
}

class Apple1 extends ComputerTeacherSolved{

    @Override
    void playVideo() {
        System.out.println("Playing the video on quick time player");
    }

    @Override
    void browserInternet() {
        System.out.println("Browsing the internet using safari");
    }

    void editVideos(){
        System.out.println("Editing on iMovies");
    }

    void installApp(){
        System.out.println("installing the apps from App Store");
    }
}

class HP1 extends ComputerTeacherSolved{

    @Override
    void browserInternet() {
        System.out.println("Browsing using chrome");
    }

    @Override
    void playVideo() {
        System.out.println("playing the video using VLC player");
    }
    void installApps(){
        System.out.println("You can install any app on me");
    }
}

