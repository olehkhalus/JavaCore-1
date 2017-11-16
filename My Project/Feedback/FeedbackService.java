package Feedback;

import Books.Book;
import Books.Person;

import java.util.*;

public class FeedbackService {
   private List<FeedbackBookPerson> listFeedbackBookPeople = new ArrayList<FeedbackBookPerson>();
   private Map<Book, Double> mapBooksByRating = new HashMap<>();

    public List<FeedbackBookPerson> getListFeedbackBookPeople() {
        return listFeedbackBookPeople;
    }

    public Double getRatingBook(Book book){
        Double sumOfRating = 0.00;
        Double count = 0.00;
        for (Feedback currentFeedback: getAllFeadbacks(book)){
            sumOfRating += currentFeedback.getRating();
            count++;
        }
        return sumOfRating/count;
    }

    public Book getHiRatingBook(){
        Book bookMaxRat = new Book();
        Double maxRat =0.00;
        for (Book currentBook: mapBooksByRating.keySet()){
            if(mapBooksByRating.get(currentBook)>maxRat){
                maxRat =mapBooksByRating.get(currentBook);
                bookMaxRat = currentBook;
            }
        }
        return bookMaxRat;
    }

    public List<Feedback> getAllFeadbacks(Person person){
        List<Feedback> feedbackList = new ArrayList<Feedback>();
        for (FeedbackBookPerson currentFBP: listFeedbackBookPeople){
            if(currentFBP.getPerson().equals(person)){
                feedbackList.add(currentFBP.getFeedback());
            }
        }
        return feedbackList;
    }

    public List<Feedback> gatAllNegFeadByPerson(Person person){
        List<Feedback> negFeedbackList = new ArrayList<Feedback>();
        for (Feedback currentFeedback: getAllFeadbacks(person)){
            if (currentFeedback.getTypeFeedback()==false){
                negFeedbackList.add(currentFeedback);
            }
        }
        return negFeedbackList;
    }

    public List<Feedback> getAllFeadbacks(Book book){
        List<Feedback> feedbackList = new ArrayList<Feedback>();
        for (FeedbackBookPerson currentFBP: listFeedbackBookPeople){
            if(currentFBP.getBook().equals(book)){
                feedbackList.add(currentFBP.getFeedback());
            }
        }
        return feedbackList;
    }

    public Map<Book, Double> setMapRatingBooks(Book book){
        mapBooksByRating.put(book, getRatingBook(book));
        return mapBooksByRating;
    }
}
