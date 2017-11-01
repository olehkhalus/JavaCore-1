import java.io.*;

public class WriteFile {


    public static void writeTextInNewFile(String text){
        BufferedWriter writer;
        try{
            writer = new BufferedWriter(new FileWriter(new File("E:\\IntelliJ IDEA 2017.2.5\\Projects\\ReadFile\\src\\input2.txt")));
            writer.append(text);
            writer.close();
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
    public static void writeTextInExistingFile(String text){
        BufferedWriter writer;
        try{
            writer = new BufferedWriter(new FileWriter(new File("E:\\IntelliJ IDEA 2017.2.5\\Projects\\ReadFile\\src\\input2.txt"),true));
            writer.append("\n");
            writer.append(text);
            writer.close();
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
}
