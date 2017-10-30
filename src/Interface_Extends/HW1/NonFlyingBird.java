package Interface_Extends.HW1;

public class NonFlyingBird extends Bird {

   final boolean layEggs = true;
    @Override
    String fly() {
        return "non fly";
    }

    @Override
    public String toString() {
        return null;
    }
}
