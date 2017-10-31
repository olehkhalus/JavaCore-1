import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public void printMap(HashMap<Integer, String>hashMap){
        for (Map.Entry<Integer,String>entry: hashMap.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
    }
    public void findValueFromID(HashMap<Integer,String>hashMap, Integer id){
         if (hashMap.containsKey(id)){
                System.out.printf("From this ID we are get value: %s", hashMap.get(id));
                System.out.println();
         }
         else System.out.println("Can't find this ID ");
    }
    public void findIDFromValue(HashMap<Integer,String> hashMap, String name){
        if (hashMap.containsValue(name)){
            Set<Map.Entry<Integer, String>> entrySet=hashMap.entrySet();
            Integer b =0;

            for (Map.Entry<Integer, String> pair : entrySet) {
                if (name.equals(pair.getValue())) {
                    b= pair.getKey();
                }
            }


            System.out.printf("From this Name we are get key: %d", b);
            System.out.println();
        }
        else System.out.println("Can't find this Name");
    }

}
