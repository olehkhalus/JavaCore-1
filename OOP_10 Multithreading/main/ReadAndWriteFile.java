package main;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Create file1.txt file with a text about your career.
    Read context from file into array of strings. Each array item contains one line from file.
    Write in to the file2.txt
    1) number of lines in file1.txt.
    2) the longest line in file1.txt.
    3) your name and birthday date. */

public class ReadAndWriteFile {
    String fileForReading = "C:\\Users\\User\\IdeaProjects\\OOP_10\\src\\text.txt";
    String fileForWrite="C:\\Users\\User\\IdeaProjects\\OOP_10\\src\\file2.txt";
    List<String>textInArray = new ArrayList<>();

    public void readFromFile() throws IOException {
        FileReader fr = new FileReader(fileForReading);
        BufferedReader br = new BufferedReader(fr);
        String tmpSrring="";
        while ((tmpSrring = br.readLine()) != null) {
            textInArray.add(tmpSrring);
        }
    }
    public Integer lenghtOflongestString(){
        Integer longestLineIndex =0;
        for (int i=0; i<textInArray.size(); i++) {
            if ( longestLineIndex< textInArray.get(i).length()){
                longestLineIndex=i;
            }
        }
        return longestLineIndex;
    }

    public void writeinFile() throws IOException {
        FileWriter fw = new FileWriter(fileForWrite);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(Integer.toString(textInArray.size()));
        bw.write("\n");
        bw.write(Integer.toString(lenghtOflongestString()));
        bw.write("\n");
        bw.write("Vsevolod, 12/01/1984");
        bw.close();
        }
    }

