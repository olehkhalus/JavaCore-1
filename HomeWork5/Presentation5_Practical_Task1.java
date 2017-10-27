//Create interface Animal with methods voice() and feed().
// Create two classes Cat and Dog, which implement this interface.
// Create array of Animal and add some Cats and Dogs to it.
// Call voice() and feed() method for all of it

package HomeWork5;

interface animal {
    String voice();
    String feed();
}

class Cat implements animal {
    @Override
    public String voice() {
        return "Meow";
    }
    @Override
    public String feed() {
        return "Frrr";
    }
}

class Dog implements animal {
    @Override
    public String voice() {
        return "Wouf";
    }
    @Override
    public String feed() {
        return "Grrr";
    }
}


public class Presentation5_Practical_Task1 {
    public static void main ( String[] Args) {
        Cat cat1 = new Cat() ;
        Dog dog1 = new Dog() ;

        System.out.println(cat1.voice());
        System.out.println(cat1.feed());
        System.out.println(dog1.voice());
        System.out.println(dog1.feed());
    }
}
