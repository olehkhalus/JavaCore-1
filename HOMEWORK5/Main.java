abstract class Bird{
    String feathers;
    String layEggs;

    abstract public void fly();
}
class FlyingBird extends Bird{
    public void fly(){
        System.out.println("this is fly bird");
    }

}
class noFlyingBird extends Bird{
    public void fly(){
        System.out.println("this is no fly bird");
    }

}

class Eagle extends FlyingBird{

}
class Swallow extends FlyingBird{

    }
class Penguin extends noFlyingBird{

    }
class Chicken extends noFlyingBird{

}
public class Main {

    public static void main(String[] args) {
	Penguin Penguin = new Penguin();
	Eagle Eagle = new Eagle();
	Chicken Chicken = new Chicken();
	Swallow Swallow = new Swallow();
	Bird arrayBirds [] = {Penguin , Eagle, Chicken, Swallow};
	for (int t = 0; t < arrayBirds.length; t++){
	   arrayBirds[t].fly();
    }

    }
}
