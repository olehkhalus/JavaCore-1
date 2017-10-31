public class NonFlyingBird extends Bird{
    final boolean layEggs = true;

    @Override
    String fly() {
        return "can't fly";
    }

    @Override
    public String toString() {
        return null;
    }
}
