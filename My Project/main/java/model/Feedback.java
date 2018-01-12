package model;

public class Feedback {
   private Integer rating;
   private String review;
   private Boolean typeFeedback;

   public Feedback(){}

   public Feedback(Integer rating, String review, Boolean typeFeedback){
       this.rating = rating;
       this.review = review;
       this.typeFeedback = typeFeedback;
   }

    public Integer getRating() {
       return rating;
    }

    public String getReview() {
       return review;
    }

    public Boolean getTypeFeedback() {
       return typeFeedback;
    }

    public void setTypeFeedback(Boolean typeFeedback) {
       this.typeFeedback = typeFeedback;
    }
}
