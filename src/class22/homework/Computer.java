package class22.homework;

public class Computer {

    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.*/


 public void processAndStoreData (){

     System.out.println("This System is able to process and store data");
 }
 public void followInstructions(){
     System.out.println("This System is able to follow the instructions and provide you the result");
 }
}
class Apple extends Computer{

    @Override
    public void processAndStoreData() {
        System.out.println("Apple is equipped with the necessary hardware and software components to perform these tasks efficiently and effectively");
    }

    @Override
    public void followInstructions() {
        System.out.println("Apple is Equipped with powerful CPUs and a wide range of software applications that allow them to perform a wide range of tasks");
    }
}
class Lenovo extends Computer{

    @Override
    public void processAndStoreData() {
        System.out.println("Lenovo designed to provide efficient and effective data processing capabilities");
    }

    @Override
    public void followInstructions() {
        System.out.println("Lenovo performed by the central processing unit (CPU) and the software that is installed on the computer");
    }
}
class HP extends Computer{

    @Override
    public void processAndStoreData() {
        System.out.println("HP data processing specification depend on the specific model and configuration of the computer");
    }

    @Override
    public void followInstructions() {
        System.out.println("The software installed on a HP computer provides the instructions that the CPU follows to perform specific tasks");
    }
}
class Dell extends Computer{
    @Override
    public void processAndStoreData() {
        super.processAndStoreData();
    }

    @Override
    public void followInstructions() {
        super.followInstructions();
    }
}