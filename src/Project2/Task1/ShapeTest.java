package Project2.Task1;

import Project2.Task1.Circle;
import Project2.Task1.Shape;
import Project2.Task1.Square;

public class ShapeTest {

        public static void main(String[] args) {

            Shape[] shapes={new Circle(3),new Square(5)};
            for (Shape shape:shapes) {

                shape.calculateArea();
                shape.calculatePerimiter();

            }

        }
}
