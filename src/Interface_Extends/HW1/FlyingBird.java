package Interface_Extends.HW1;

public class FlyingBird extends Bird {
    final boolean feathers = true;
    final boolean layEggs = true;
    @Override
    String fly() {
        return "fly";
    }

    @Override
    public String toString() {
        return null;
    }
}
