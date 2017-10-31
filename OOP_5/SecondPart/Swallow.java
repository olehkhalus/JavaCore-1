
public class Swallow extends FlyingBird {
    final boolean feathers = true;
    final boolean layEggs = true;

    @Override
    String fly() {
        return "fly";
    }
    @Override
    public String toString(){
        return ("Swallow, feathers: " +feathers+ ", layEggs: "+layEggs);
    }
}
