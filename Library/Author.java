package Library;

import java.util.ArrayList;
import java.util.List;

public class Author {
	private String AuthorName;
	private List<Book> AuthorBooks;
	public Author() {
		
	}
	
	public Author(String AuthorName , ArrayList<Book> AuthorBooks) {
		this.AuthorName = AuthorName;
	}
	
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String AuthorName) {
		this.AuthorName = AuthorName;
	}
	
	public List<Book> getAuthorBooks() {
		return AuthorBooks;
	}
	public void setAuthorBooks(String AuthorName) {
		this.AuthorBooks = AuthorBooks;
	}
}
