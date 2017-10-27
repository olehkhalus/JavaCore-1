import java.util.*;

public class Main {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        CollectionTask collectionTask=new CollectionTask(10,0,100);
        System.out.println(collectionTask.getList());
        System.out.println(collectionTask.IndexOfElementsGreaterThanValue(5));
        collectionTask.RemoveElementsGreaterTnanValue(20);
        collectionTask.getList().add(2,1);
        collectionTask.getList().add(8,-3);
        collectionTask.getList().add(5,-4);
        System.out.println(collectionTask.getList());
        collectionTask.sort();
        System.out.println(collectionTask.getList());



        Map<Integer, String> employeeMap = new HashMap<>();
        int id;
        String name;
        employeeMap.put(1, "Stas");
        employeeMap.put(2, "Oleg");
        employeeMap.put(3, "Sasha");
        id=sc.nextInt();
        if(employeeMap.containsKey(id)) System.out.println(employeeMap.get(id));
        else System.out.println("You've entered invalid key");
        name=sc.next();
        for(Map.Entry<Integer, String> entry : employeeMap.entrySet()){
            if(name.equals(entry.getValue())) {
                System.out.println((Integer) entry.getKey());
                break;
            }
        }

    }
}
