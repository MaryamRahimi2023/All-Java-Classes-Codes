package class24.homework;

public interface MovAble {
    void move();
}
interface OwnAble extends MovAble{
    void Own();
}
class Car implements MovAble,OwnAble{// Possible in interface multipart but not in inheritance
    @Override
    public void move() {
        System.out.println("I can move");

    }

    @Override
    public void Own() {
        System.out.println("you can own me");

    }
}
class Dog implements MovAble,OwnAble{

    @Override
    public void move() {
        System.out.println("I can Move");

    }

    @Override
    public void Own() {
        System.out.println("You can Own me");


    }
}

