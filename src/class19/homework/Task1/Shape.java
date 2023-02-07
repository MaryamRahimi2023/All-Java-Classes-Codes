package class19.homework.Task1;

public class Shape {

    /*  1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
           In circle class create a method to calculate the area of circle. Test your code
     */

    double radius;

    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape {

    Circle(double radius ){
        super(radius);
    }void areaPrint(){
        double area=3.14*radius;
        System.out.println(" The area of a circle with "+radius+" cm radius is "+area);
    }

}
