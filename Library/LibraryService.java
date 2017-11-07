public class LibraryService {
    private Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    public boolean addBook(Book book){
        if(this.library.getBooks().put(book, true)) { return true;}
        else {return false;}
    }

    public void borrowBook(Book book){
        if(this.library.getBooks().containsKey(book) && isBookInStock(book)) this.library.getBooks().put(book, isBookInStock(book));
    }

    public void returnBook(Book book){
        if(this.library.getBooks().containsKey(book) && !isBookInStock(book)) this.library.getBooks().put(book, isBookInStock(book));
    }

    public boolean isBookInStock(Book book){
        if(this.library.getBooks().containsKey(book) && this.library.getBooks().get(book) == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isBookInLibrary(Book book){
        if(this.library.getBooks().containsKey(book)) {
            return true;
        }
        else{
            return false;
        }
    }
}
