package Library;

import java.util.ArrayList;
import java.util.List;

public class Author {
<<<<<<< HEAD
	private String firstName;
	private String lastName;
	private List<Book> books;
	public Author() {
		
	}
	
	public Author(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName() {
		return firstName+lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	public void addBook(Book book) {
		books.add(book);
	}
=======
    private String fullName; // FN, LN
    private List<Book> books;

    public Author() {

    }

    public Author(String AuthorName , ArrayList<Book> AuthorBooks) {
        this.fullName = AuthorName;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String AuthorName) {
        this.fullName = AuthorName;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(String AuthorName) {
        this.books = books;
    }
>>>>>>> 8259596b6b6e4beb3f068b87bbff0a9c766dcd19
}

