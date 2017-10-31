import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/* Create file1.txt file with a text about your career.
    Read context from file into array of strings. Each array item contains one line from file.
    Write in to the file2.txt
    1) number of lines in file1.txt.
    2) the longest line in file1.txt.
    3) your name and birthday date. */

public class ReadAndWriteFile {

    public void readAndWriteFile() throws IOException {
        String file1 = "C:\\Users\\User\\IdeaProjects\\OOP_10\\src\\text.txt";
        String file2 ="C:\\Users\\User\\IdeaProjects\\OOP_10\\src\\file2.txt";
        int i = 0;
        FileWriter fw = new FileWriter(file2);
        BufferedWriter bw = new BufferedWriter(fw);

        FileReader fr = new FileReader(file1);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> textInArray = new ArrayList<String>();
        String[] a = new String[100];
        while ((a[i] = br.readLine()) != null) {
                textInArray.add(a[i]);
             //   System.out.println("Read line: " + textInArray.get(i));
                i++;
            }
        Integer longestLineIndex =0;
        for (int ii=0; i<textInArray.size(); i++) {
            if ( longestLineIndex< textInArray.get(ii).length()){
                longestLineIndex=ii;
            }
        }
        bw.write(Integer.toString(textInArray.size()));
        bw.write("\n");
        bw.write(textInArray.get(longestLineIndex));
        bw.write("\n");
        bw.write("Vsevolod, 12/01/1984");
        bw.close();
        }
    }

