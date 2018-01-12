package model;

import model.Book;
import model.Feedback;
import model.Person;

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

    public Feedback getFeedback() {
        return feedback;
    }

    public Book getBook() {
        return book;
    }
}
