public class Chicken extends NonFlyingBird {
    final boolean feathers = true;
    final boolean layEggs = true;

    @Override
    String fly() {
        return "can't fly";
    }
    @Override
    public String toString(){
        return ("Chicken, feathers: " +feathers+ ", layEggs: "+layEggs);
    }
}
