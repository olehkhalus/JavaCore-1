import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {

    public void randomFell (ArrayList<Integer>list, int size, int min, int max) {
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            list.add(ThreadLocalRandom.current().nextInt(min,max));
        }
    }

    public void moreThen5(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (Integer i : first) {    //Integer more then 5
            if (i > 5)
                second.add(i);
        }
    }

    public void delGreaterThen20(ArrayList<Integer> arrayList) {
        int a=arrayList.size();
        for (int j = 0; j < a; ) {  // del greater then 20
            if (arrayList.get(j) > 20) {
                arrayList.remove(j);
                a -= 1;
            }
            else j++;
        }
    }
    public void setElement(ArrayList<Integer>arrayList, int position, int value ){
        if (arrayList.size()>=position)
        arrayList.set(position,value);
        else {
            for (int y =arrayList.size(); y<=position;y++){
                arrayList.add(ThreadLocalRandom.current().nextInt(100,200));
            }
            arrayList.set(position,value);
        }
    }
    public void listSort(ArrayList<Integer>newCollection){
        Collections.sort(newCollection, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return (o1.compareTo(o2));
            }
        });
    }
    public void printValueOfElement(ArrayList<Integer> arrayList){
        for (int pos = 0; pos<arrayList.size();pos++) {
            System.out.printf("Position – %d, value of element – %d", pos, arrayList.get(pos));
            System.out.println();
        }
    }
}
