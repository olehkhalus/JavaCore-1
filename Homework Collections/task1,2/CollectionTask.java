import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CollectionTask {

  List<Integer> list;

    public CollectionTask(int size, int min, int max){
      list=new ArrayList<Integer>();
      addElements(list, size, min, max);

    }

    public List<Integer> getList() {
        return list;
    }

    public void addElements(List<Integer> list, int size, int min, int max){

        for(int i=0;i<size;i++){
            list.add(ThreadLocalRandom.current().nextInt(min,max));
        }
    }

    public List<Integer> IndexOfElementsGreaterThanValue(int value){
        List<Integer> newCollection=new ArrayList<>();
        for(int i=0; i < this.getList().size(); i++){
            if(list.get(i) > value) newCollection.add(i);
        }
        return newCollection;
    }

    public void RemoveElementsGreaterTnanValue(int value){
        Iterator<Integer> iterator=this.getList().iterator();
        while(iterator.hasNext()){
            if(iterator.next() < value) iterator.remove();
        }
    }

    public void sort(){
        Collections.sort(this.getList());
    }


}
