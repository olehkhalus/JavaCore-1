public class LibraryService {
    private Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    public boolean addBook(Book book){
        return library.getBooks().put(book, true);
    }

    public void borrowBook(Book book){
        if(isBookInStock(book)) library.getBooks().put(book, false);
    }

    public void returnBook(Book book){
        if(library.getBooks().containsKey(book) && !isBookInStock(book)) library.getBooks().put(book, true);
    }

    public boolean isBookInStock(Book book){
        return isBookInLibrary(book) && library.getBooks().get(book);
    }

    public boolean isBookInLibrary(Book book){
        return library.getBooks().containsKey(book);
    }
}
