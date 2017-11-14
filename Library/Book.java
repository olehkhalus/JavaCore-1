package Library;



public class Book {
    // TODO field  MUST started from lowerCase !!!!!!!
    private String BookName;
    //TODO Create Author type
    private String BookAuthor;

    private int YearOfPublication;

    public Book() {

    }

    public Book(String BookName , String BookAuthor , int YearOfPublication) {
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.YearOfPublication = YearOfPublication;
    }

    public String getBookName() {
        return BookName;
    }
    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }
    public void setBookAuthor(String BookAuthor) {
        this.BookAuthor = BookAuthor;
    }

    public int getYearOfPublication() {
        return YearOfPublication;
    }
    public void setYearOfPublication(int YearOfPublication) {
        this.YearOfPublication = YearOfPublication;
    }

    @Override
    public String toString() {
        return "Book name "+BookName+" Author "+BookAuthor+" year "+YearOfPublication;
    }
}

