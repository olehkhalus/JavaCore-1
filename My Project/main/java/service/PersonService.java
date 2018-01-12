package service;

import model.Author;
import model.Book;
import model.Person;


public class PersonService extends Author {
   private Person person;


   public void addToList(Person person, Book book) throws Exception{
       person.getBooks().add(book);
   }

    public Boolean removeFromList(Person person, Book book) throws Exception {
        if (person.getBooks().contains(book)) {
            person.getBooks().remove(book);
            return true;
        } else {
            return false;
        }
    }
}
