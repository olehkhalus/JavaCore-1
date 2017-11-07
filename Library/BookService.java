public class BookService {
    private Book book;
    public BookService(Book book){
        this.book = book;
    }

    public boolean isWrittenBy(Author author){
        if( book.getAuthor().equals(author)) {
            return true;
        }
        else {
            return false;}
    }
}
