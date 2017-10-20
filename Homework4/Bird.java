abstract public class Bird {
    String feathers;
    boolean layEggs;
    abstract void fly();
}
class FlyingBird extends Bird{

    @Override
    void fly() {
        System.out.println("This bird can fly");
    }
}
class NonFlyingBird extends Bird{
    @Override
    void fly() {
        System.out.println("This bird can't fly");
    }
}
class Eagle extends FlyingBird{
}
class Swallow extends FlyingBird{
}
class Penguin extends NonFlyingBird{
}
class Chicken extends NonFlyingBird{
}
