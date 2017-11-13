package Library;

public class Book {
	private String BookName;
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
	
	public void outputBook() {
		System.out.println("Book name "+BookName+" Author "+BookAuthor+" year "+YearOfPublication);
	}
}
