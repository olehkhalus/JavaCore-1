
public class Main {
    public static void main(String... args) {
/*        Animal [] pets = new Animal[4];
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        pets[0] = cat1;
        pets[1] = cat2;
        pets[2] = dog1;
        pets[3] = dog2;
        for (Animal animal: pets){
            System.out.println(animal.feed());
            System.out.println(animal.voice());
        } */
        Person[] people = new Person[5];
        Student student = new Student("Peter");
        Teacher teacher = new Teacher("Greg");
        Cleaner cleaner = new Cleaner("Gorge");
        Cleaner cleaner1 = new Cleaner("Jone");
        Teacher teacher1 = new Teacher("Kate");
        people[0] = student;
        people[1] = cleaner;
        people[2] = teacher;
        people[3] = cleaner1;
        people[4] = teacher1;
        for (Person person : people) {
            System.out.println(person.print());
            if (person instanceof Staff) {
                System.out.println(((Staff) person).salary());
            }
        }
    }
}

