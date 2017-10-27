package HomeWork5;

//Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  
// Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
//Create array Bird and add different birds to it.
//Call fly() method for all of it.
// Output the information aboutn each type of created bird.

abstract class Bird {
    String name;

    Bird() {}
    Bird( String name) {
        this.name = name;
    }

    abstract String fly();
}

abstract class FlyBird extends Bird {
    FlyBird() {}
    FlyBird( String name) {
        super( name );
    }
    @Override
    String fly() {
        return "I can fly";
    }
}

abstract class notFlyBird extends Bird {
    notFlyBird() {}
    notFlyBird(String name) {
        super(name);
    }

    @Override
    String fly() {
        return "I can't fly";
    }
}

class Eagle extends FlyBird {
    static final String species = "Eagle";
    Eagle() {}
    Eagle( String name) {
        super (name);
    }
}
class Swallow extends FlyBird {
    static final String species = "Swallow";
    Swallow() {}
    Swallow( String name) {
        super (name);
    }
}
class Penguin extends notFlyBird {
    static final String species = "Penguin";
    Penguin() {}
    Penguin( String name) {
        super (name);
    }
}
class Kiwi extends notFlyBird {
    static final String species = "Kiwi";
    Kiwi() {}
    Kiwi( String name) {
        super (name);
    }
}
public class Presentation5_Slide37_Task {
    public static void main( String[] Args) {
        Eagle Eagle1 = new Eagle("Eagle1");
        System.out.println("I am an "+" Eagle "+Eagle1.fly());
        Swallow Swallow1 = new Swallow("Swallow1");
        System.out.println("I am an "+" Swallow "+Swallow1.fly());
        Penguin Penguin1 = new Penguin("Penguin1");
        System.out.println("I am an "+" Penguin "+Penguin1.fly());
        Kiwi Kiwi1 = new Kiwi("Kiwi1");
        System.out.println("I am an "+" Kiwi "+Kiwi1.fly());
    }
}
