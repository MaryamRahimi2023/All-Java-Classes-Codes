package class20;

public class classTask1 {

    void calculateArea(double length,double width){
        System.out.println("Area of rectangle is "+length*width);

    }
    void calculateArea(double side) {
        System.out.println("Area of square is "+(side * side));
    }


    public static void main(String[] args) {

        classTask1 obj=new classTask1();

        obj.calculateArea(5.6,4.2);
        obj.calculateArea(6.2);
    }
}
