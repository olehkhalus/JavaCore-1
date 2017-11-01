import java.io.*;

public class Main {
    public static void main(String[] args) {
        ReadFile file = new ReadFile("E:\\IntelliJ IDEA 2017.2.5\\Projects\\ReadFile\\src\\input.txt");
        file.readFile();
        System.out.println(file.findLinesWithWord("hello"));
        WriteFile.writeTextInNewFile(Integer.toString(file.getFileInStrings().size()));
        WriteFile.writeTextInExistingFile(file.longestLine());
        WriteFile.writeTextInExistingFile("17.07.1999");
    }
}
