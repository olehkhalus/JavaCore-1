import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
Output the entities of the map on the screen.
There are at less two persons with the same firstName among these 10 people?
Remove from the map person whose firstName is ”Orest” (or other). Print result.
 */
public class HomeWorkTask2 {
    public void printMapString(HashMap<String, String> hashMap){
        for (Map.Entry<String,String>entry: hashMap.entrySet()){
            System.out.println("LastName: "+entry.getKey()+"/ FirsName: "+entry.getValue());
        }
    }
    public void sameNames(HashMap <String, String> map) {

        for (String y : map.values()) {
           int tmp=0;
            for (String j: map.values()){
                if (y.equals(j))
                    tmp++;
                if (tmp>=2) {
                    System.out.printf("Two person or more have same name %s",y);
                    break;
                }
            }
            if (tmp>=2)
            break;
        }
    }
    public void findAndDel(HashMap<String,String> hashMap, String name){
        if (hashMap.containsValue(name)){
            Set<Map.Entry<String, String>> entrySet=hashMap.entrySet();
            String b ="";

            for (Map.Entry<String, String> pair : entrySet) {
                if (name.equals(pair.getValue())) {
                    b= pair.getKey();
                }
            }
            hashMap.remove(b);
            HomeWorkTask2 a= new HomeWorkTask2();
            a.printMapString(hashMap);
        }
        else System.out.println("Can't find this Name");
    }

}
