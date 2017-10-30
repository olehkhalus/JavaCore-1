package Interface_Extends.HW1;

public class Penguin extends NonFlyingBird {
    final boolean feathers = false;
    final boolean layEggs = true;
    @Override
    String fly() {
        return "can't fly";
    }
    @Override
    public String toString(){
        return ("Penguin, feathers: " +feathers+ ", layEggs: "+layEggs);
    }
}
