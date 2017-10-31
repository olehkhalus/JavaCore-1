
public class Main {
    public static void main(String...args){
    Bird [] bird = new Bird[4];
    Eagle eagle = new Eagle();
    Swallow swallow = new Swallow();
    Penguin penguin = new Penguin();
    Chicken chicken = new Chicken();
    bird[0] = eagle;
    bird[1] = swallow;
    bird[2] = penguin;
    bird[3] = chicken;
    for (Bird i: bird){
        System.out.println(i);
        System.out.println(i.fly());
    }
    }
}
