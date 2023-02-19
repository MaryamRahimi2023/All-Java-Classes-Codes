package class24.homework;

import class24.homework.Car;
import class24.homework.Dog;
import class24.homework.MovAble;
import class24.homework.OwnAble;

public class MovAbleTester {

    public static void main(String[] args) {

        OwnAble[] ownAbles={new Car(),new Dog()};
        for (OwnAble ownAble:ownAbles) {
            ownAble.Own();
            ownAble.move();
        }
    }
}
