package library;

import java.util.*;

public class Inventory {
    
    private List<Book> items = new ArrayList<>();
    
    public Inventory() {
        init();
    }

    public List<Book> loadBooks() {
        return items;
    }

    private void init() {
        items.add(new Book("Leo Tolstoy", "The Death of Ivan Ilyich", 1886));
        items.add(new Book("James Joyce", "Ulysses", 1922));
        items.add(new Book("David Wallace", "Infinite Jest", 1996));
        items.add(new Book("John Williams", "The Stoner", 1995));
        items.add(new Book("Laszlo Krasznahorkai", "Satantango", 1985));
        
    }

}