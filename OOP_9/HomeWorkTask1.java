import java.util.Collections;
import java.util.HashSet;

/*Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
realizing the operations of union and intersection of two sets.
Test the operation of these techniques on two pre-filled sets.
 */
public class HomeWorkTask1 {
public void printSet (HashSet <Integer> set){
    for (Integer i: set){
        System.out.println(i);
    }
}
public void union( HashSet<Integer>set1,HashSet<Integer>set2) throws NullPointerException{
    set1.addAll(set2);
}
public  void intersect(HashSet<Integer>set1,HashSet<Integer>set2) throws NullPointerException{
set1.retainAll(set2);
}


}
