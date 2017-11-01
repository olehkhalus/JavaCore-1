import java.io.*;
import java.util.*;

public class ReadFile {
    private String file;
    private List<String> fileInStrings;
    public static final Comparator<String> BY_LENGTH = (s1,s2) -> Integer.compare(s1.length(), s2.length());

    public ReadFile(String file){
        this.file=file;
    }

    public void readFile(){
        try{
            Scanner inFile=new Scanner(new File(this.file));
            fileInStrings=new ArrayList<>();
            while(inFile.hasNext()){
                fileInStrings.add(inFile.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.err.println(e);
        }

    }


    public List<String> getFileInStrings() {
        return fileInStrings;
    }

    public String shortestLine(){
        return Collections.min(this.getFileInStrings(),BY_LENGTH);
    }

    public String longestLine(){
        return Collections.max(this.getFileInStrings(),BY_LENGTH);
    }

    public Set<String> findLinesWithWord(String word){
        String tmp = "";
        Set<String> setWithWords = new HashSet<>();
        Iterator<String> iterator = this.getFileInStrings().iterator();
        while (iterator.hasNext()){
            tmp=iterator.next();
            if (tmp.contains(word)) {setWithWords.add(tmp);}
        }
        return setWithWords;
    }

}