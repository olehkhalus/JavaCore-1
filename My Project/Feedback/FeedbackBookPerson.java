package Feedback;

import Books.Book;
import Books.Person;

public class FeedbackBookPerson {
   private Person person;
   private Feedback feedback;
   private Book book;

    public FeedbackBookPerson(Person person, Feedback feedback, Book book) {
        this.person = person;
        this.feedback = feedback;
        this.book = book;
    }
    public FeedbackBookPerson(){}

    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public Feedback getFeedback() {
        return feedback;
    }
    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
}
