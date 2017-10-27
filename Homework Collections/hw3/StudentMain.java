import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Stas", 4));
        list.add(new Student("Yulia", 3));
        list.add(new Student("Andrew", 2));
        list.add(new Student("Vasia", 2));
        list.add(new Student("Dima", 1));


        Student.printStudents(list,5);
        Student.sortListByName(list);
        Student.sortListByCourse(list);
        System.out.println(list);
    }
}
