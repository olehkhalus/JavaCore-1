import java.util.ArrayList;

public class Main{
    public static void main(String... args){
        ArrayList <Bird> birds=new ArrayList<>();
        Eagle eagle=new Eagle();
        birds.add(eagle);
        Swallow swallow=new Swallow();
        birds.add(swallow);
        Penguin penguin=new Penguin();
        birds.add(penguin);
        Chicken chicken=new Chicken();
        birds.add(chicken);
        for(Bird bird:birds){
            bird.fly();
        }
    }
}
