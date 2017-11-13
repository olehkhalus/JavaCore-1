package Library;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
	private String LibraryAdress;
	private LocalTime LibraryIsOpenAt;
	private LocalTime LibraryIsClosedAt;
	private Map<Book, Integer > LibraryBooks = new HashMap<>();
	
	public Library() {
		
	}
	public Library ( String LibraryAdress , int openedHour , int openedMinute  , int closedHour , int closedMinute  ) {
		this.LibraryAdress = LibraryAdress;
		this.LibraryIsOpenAt = LocalTime.of(openedHour, openedMinute);
        this.LibraryIsClosedAt = LocalTime.of(closedHour, closedMinute);
	}
	
	
	
	public String getLibraryAdress() {
		return LibraryAdress;
	}
	public void setLibraryAdress( String LibraryAdress) {
		this.LibraryAdress = LibraryAdress;
	}
	
	
	public LocalTime getIsOpenAt() {
		return LibraryIsOpenAt;
	}
	public void setLibraryIsOpenAt( LocalTime LibraryIsOpenAt) {
		this.LibraryIsOpenAt = LibraryIsOpenAt;
	}
	
	
	public LocalTime getIsClosedAt() {
		return LibraryIsClosedAt;
	}
	public void setLibraryIsClosedAt( LocalTime LibraryIsClosedAt) {
		this.LibraryIsClosedAt = LibraryIsClosedAt;
	}
	
	
	public Map<Book, Integer> getLibraryBooks() {
		return LibraryBooks;
	}

	
	public void addBook( Book Book , Integer NumberOfBooks ) {
		LibraryBooks.put(Book, NumberOfBooks);
	}
	
	
	
	

}
