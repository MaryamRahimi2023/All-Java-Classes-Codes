package class2;

public class Variables {
    public static void main(String[] args) {
        /* below line is reserving a box in the computers memory.
         we are calling it box 1 and if we need the information that we are storing inside this box
         we can say to computer give us the contents of box1.
         int= what type of data we want to store, we can store water in a paper box
         box1= is the name of the box
         = sign will take whatever we write after it and will store it inside the box1
         10= is what we are storing inside the box
         */

int box1=10;
// if we are printing something from the box we don't need these "" if we put something inside the computer will print it as text.
        System.out.println(box1); // bring the contents of box1 and print them on the console
        // To store whole numbers ( numbers without decimals points) we have 4 different types of boxes.
        // for ex: numbers like 10, 20, 30, 3000, 330000
        // 1) byte 20 short 3) int 4) long

        byte box2=127; // range for byte is form -128 to 127 if we need to store larger numbers we should try short.
        byte box3=-128;
        short box4=32767;
        int biggerBox=123456484; // most common type of box
        long maxBox=15131351465464L;

        short myBox=10000;
        System.out.println(myBox);

    }
}

