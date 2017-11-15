package Library;



public class Book {
<<<<<<< HEAD
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
=======
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
>>>>>>> 8259596b6b6e4beb3f068b87bbff0a9c766dcd19
    }
}

