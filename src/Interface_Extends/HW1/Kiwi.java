package Interface_Extends.HW1;

public class Kiwi extends NonFlyingBird {
    final boolean feathers = true;
    final boolean layEggs = true;
    @Override
    String fly() {
        return "can't fly";
    }
    @Override
    public String toString(){
        return ("Kiwi, feathers: " +feathers+ ", layEggs: "+layEggs);
    }
}
