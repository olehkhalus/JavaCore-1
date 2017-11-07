import java.util.*;
public class LibrariesService {
    private List<Library> libraries;

    public LibrariesService(){}
    public LibrariesService(List<Library> libraries){
        this.libraries.addAll(libraries);
    }

    public boolean addLibrary(Library library){
        if(libraries.add(library)){
            return true;
        }
        else{
            return false;
        }
    }

    public Library findLibraryWithBook(Book book){
        List<Library> availableLibraries = new ArrayList<>();
        for(Library library : this.libraries){
            if(new LibraryService(library).isBookInStock(book)){
                availableLibraries.add(library);
            }
        }
        if(availableLibraries.isEmpty()) {
            return null;
        }
        else{
            Collections.sort(availableLibraries, Comparator.comparingInt(o -> o.getOpeningTime().toSecondOfDay()));
            System.out.print("You can find this book there: ");
            return availableLibraries.get(0);
        }
    }
}
