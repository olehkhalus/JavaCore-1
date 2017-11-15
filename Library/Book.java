package Library;



public class Book {

	private String name;
	private Author author;
	private int yearOfPublication;
	
	public Book() {
		
	}
	
	public Book(String name , Author author , int yearOfPublication) {
		this.name = name;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
	}
	
	public String getBookName() {
		return name;
	}
	public void setBookName(String name) {
		this.name = name;
	}
	
	public Author getBookAuthor() {
		return author;
	}
	public void setBookAuthor(Author author) {
		this.author = author;
	}
	
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	
	@Override
    public String toString() {
        return "Book name "+name+" Author "+author.getName()+" year "+yearOfPublication;
    }
}

