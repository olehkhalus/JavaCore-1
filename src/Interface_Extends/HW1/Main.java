package Interface_Extends.HW1;

public class Main {
    public static void main (String [] args){
        Bird [] bird = new Bird[4];
        Eagle eagle = new Eagle();
        Swallow swallow = new Swallow();
        Penguin penguin = new Penguin();
        Kiwi kiwi = new Kiwi();
        bird[0] = eagle;
        bird[1] = swallow;
        bird[2] = penguin;
        bird[3] = kiwi;
        for (Bird i: bird){
            System.out.println(i);
            System.out.println(i.fly());
    }
}

}
