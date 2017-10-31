import java.util.*;
/*Declare collection myCollection of 10 integers and fill it (from the console or random).
Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
Remove from collection myCollection elements, which are greater then 20. Print result
Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
Sort and print collection
*/


public class Main {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String... args) {
        /*

        ArrayList <Integer> meCollection = new <Integer>ArrayList();
        ArrayList <Integer> newCollection = new <Integer>ArrayList();
        Task1 task1 = new Task1();
        task1.randomFell(meCollection,10,0, 20);

        task1.moreThen5(meCollection,newCollection);
        for (Integer y: newCollection){
           System.out.println(y);
        }
        System.out.println();
        task1.delGreaterThen20(meCollection);
        for (Integer jj: meCollection){
           System.out.println(jj);
        }
        System.out.println();
        task1.setElement(newCollection, 9,-88);
        task1.printValueOfElement(newCollection);

        task1.listSort(newCollection);
        System.out.println();
        task1.printValueOfElement(newCollection); */

        /*In the main() method declare map employeeMap of pairs <Integer, String>.
            Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
            Ask user to enter ID, then find and write corresponding name from your map.
                If you can't find this ID - say about it to user (use function containsKey()).
            Ask user to enter name, verify than you have name in your map and write corresponding ID.
                If you can't find this name - say about it to user (use function containsValue()). */
      /*  Task2 task2=new Task2();
        HashMap<Integer,String> employeeMap = new HashMap<Integer,String>();
        employeeMap.put(123,"Pablo");
        employeeMap.put(432,"Simona");
        employeeMap.put(532,"Igor");
        employeeMap.put(654,"King-kong");
        employeeMap.put(777,"Java");
        employeeMap.put(888,"Lesya");
        employeeMap.put(999, "Sasha");
        task2.printMap(employeeMap);
        task2.findValueFromID(employeeMap, 777);
        task2.findIDFromValue(employeeMap, "Java");         */


    HomeWorkTask1 task1= new HomeWorkTask1();
    HashSet<Integer> set1=new HashSet<Integer>();
    for (int i=0; i<5; i++){
        set1.add(i);
    }
    HashSet<Integer> set2=new HashSet<Integer>();
        for (int y=7; y>2;y--){
            set2.add(y);
        }
  /*      task1.printSet(set1);
        System.out.println();
        task1.printSet(set2);
        try {
            task1.union(set1,set2);
        }catch (NullPointerException ex){
            System.err.println(ex.getMessage());
        }
        task1.printSet(set1); */
      /*  try {
            task1.intersect(set1, set2);
        }catch (NullPointerException ex){
            System.err.println(ex.getMessage());
        }
        task1.printSet(set1);   */


   /*     HomeWorkTask2 homeWorkTask2 = new HomeWorkTask2();
        HashMap<String,String> personMap = new HashMap<String,String>();
        personMap.put("Kistanov", "Sergyu");
        personMap.put("Ravluk", "Pavlo");
        personMap.put("Chorney","Viktor");
        personMap.put("Kushnyr", "Artur");
        personMap.put("Yvanov","Ivan");
        personMap.put("Kyrynko","Viktor");
        personMap.put("Antalik", "Juryu");
        personMap.put("Berna", "Lesya");
        personMap.put("Chelentano", "Adryano");
        personMap.put("Jaremchuk", "Nazaryu");

       // homeWorkTask2.printMapString(personMap);

        homeWorkTask2.sameNames(personMap);
      //  homeWorkTask2.findAndDel(personMap,"Pavlo");  */
   Student student1 = new Student();
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Pavlo",2));
    students.add(new Student("Valya",3));
    students.add(new Student("Tanya",1));
    students.add(new Student("Petya", 3));
    students.add(new Student("Julia",4));
    student1.printStudents(students);
        System.out.println();
    student1.compareStudentsByName(students);
    student1.printStudents(students);
        System.out.println();
    student1.compareStudentsByCurse(students);
    student1.printStudents(students);
    }
}
