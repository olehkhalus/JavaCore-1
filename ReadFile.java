import java.io.*;
import java.util.*;

public class ReadFile {
    private String file;
    private List<String> fileInStrings;

    public ReadFile(String file){
        this.file=file;
    }

    public void readFile() throws FileNotFoundException {
        Scanner inFile=new Scanner(new File(file));
        fileInStrings=new ArrayList<>();
        while(inFile.hasNext()){
            fileInStrings.add(inFile.nextLine());
        }
    }


    public List<String> getFileInStrings() {
        return fileInStrings;
    }
    

    public static void main(String[] args) {
        ReadFile file = new ReadFile("C:\\Users\\skindtc\\IdeaProjects\\ReadFile\\src\\input.txt");
        try{
            file.readFile();
        }
        catch(IOException e){

        }
        for(String s : file.getFileInStrings()){
            System.out.println(s);
        }
    }
}
