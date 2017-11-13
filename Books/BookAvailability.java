package Books;

import java.util.Map;
import java.util.TreeMap;

public class BookAvailability {
    Map<Book, Integer> map;

    public BookAvailability(Map<Book, Integer> map) {
        this.map = map;
    }
    public BookAvailability() {
    }

    public Map<Book, Integer> getMap() {
        return map;
    }
    public void setMap(Map<Book, Integer> map) {
        this.map = map;
    }
}
