//Create next structure.
// In abstract class Person with property name, declare abstract method print().
// In other classes in body of method print() output text “I am a …”.
// In class Staff declare abstract method salary().
// In each concrete class create constant TYPE_PERSON.
// Output type of person in each constructors. Create array of Person and add some Teachers, Cleaners and Students to it.
// Call method print() for all of it. Call method salary() for all Teachers and Cleaner

package HomeWork5;

abstract class Person {

    String name;

    //Constructors

    Person() {}
    Person( String name) {
        this.name = name;
    }

    //Methods

    abstract String print() ;
}

abstract class Stuff extends Person {

    double salary;

    //Constructors

    Stuff(){}
    Stuff( String name , double salary) {
        super (name);
        this.salary = salary;
    }

    //Methods

    double getSalary() {
        return salary;
    }

}

class Teacher extends Stuff {
    static final String TYPE_PERSON = "Teacher";

    Teacher(){ }
    Teacher(String name , double salary ) {
        super (name , salary);
    }

    String print() {
        return "My name "+name+" i am "+TYPE_PERSON;
    }
}

class Cleaner extends Stuff {
    static final String TYPE_PERSON = "Cleaner";

    Cleaner(){ }
    Cleaner(String name , String TYPE_PERSON , double salary ) {
        super (name , salary);
    }


    String print() {
        return "My name "+name+"i am "+TYPE_PERSON;
    }
}

class Student extends Person {
    static final String TYPE_PERSON = "Student";

    Student(){ }
    Student(String name ) {
        super (name );
    }


    String print() {
        return "My name "+name+"i am "+TYPE_PERSON;
    }
}

public class Presentation5_Practical_Task2 {
    public static void main(String[] Args) {

        Student[] studentList = new Student[3];
        studentList[0] = new Student( "Oleg" );
        studentList[1] = new Student( "Ivan" );
        studentList[2] = new Student( "Vovan" );

        for ( int i = 0 ; i < 3 ; i++) {
            System.out.println(studentList[i].print());
        }


        Teacher[] TeacherList = new Teacher[3];
        TeacherList[0] = new Teacher( "Adolf" , 2000.0 );
        TeacherList[1] = new Teacher( "Alex" , 1000.0);
        TeacherList[2] = new Teacher( "Vovan" , 1500.0 );

        for ( int i = 0 ; i < 3 ; i++) {
            System.out.println(TeacherList[i].print());
        }

        for ( int i = 0 ; i < 3 ; i++) {
            System.out.println(TeacherList[i].getSalary());
        }

        Kiwi Kiwi1 = new Kiwi("Kiwi1");
        System.out.println(Kiwi1.fly());


    }
}
