public class Eagle extends FlyingBird{
    final boolean feathers = true;
    final boolean layEggs = true;

    @Override
    String fly() {
        return "fly";
    }
    @Override
    public String toString(){
        return ("Eagle, feathers: " +feathers+ ", layEggs: "+layEggs);
    }
}
