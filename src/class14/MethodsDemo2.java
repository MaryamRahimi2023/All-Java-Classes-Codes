package class14;

public class MethodsDemo2 {


    // define a method
   void printHello(){// input inside these ()
       System.out.println("Hello world");
       System.out.println("Hello world");
       System.out.println("Hello world");
    }
    void printHelloManyTimes(int times){

        for (int i = 0; i < times; i++) {
            System.out.println("Hello world");
        }

    }
    void printManyTimes(int number,String word){

        for (int i = 0; i < number; i++) {
            System.out.print(word);

        }
        System.out.println();
    }
}
