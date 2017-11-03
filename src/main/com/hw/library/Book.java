package library;

public class Book {

    private String author;
    private String title;   
    private int published;
    private boolean borrowed;

    public Book() {
    }

    public Book(String author, String title, int published) {
        this.author = author;
        this.title = title;
        this.published = published;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public void borrowed() {
        borrowed = true;
    }

    public void returned() {
        borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", author, title, published);
    }
}