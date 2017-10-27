package Interface_Extends.Task1;
public class All {
    public static void main(String [] args){
        Cat cat1 = new Cat();
        cat1.setName("Marfy");
        Cat cat2 = new Cat();
        cat2.setName("Saly");
        System.out.println(cat1.getName()+" " + cat1.voice());
        System.out.println(cat2.getName()+" " + cat2.voice());
    }


}
