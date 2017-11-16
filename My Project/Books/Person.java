package Books;

import java.util.ArrayList;
import java.util.List;

public class Person extends Author {
   private List<Book> books=new ArrayList<>();
   private Integer iD;

    public Person(Integer iD, String firstName, String lastName, Country countryEnum){
        super(firstName, lastName, countryEnum);
        this.iD = iD;
    }

   void addToList(Book book) throws Exception{
       books.add(book);
   }

    Boolean removeFromList(Book book) throws Exception {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        } else {
            return false;
        }
    }

}
