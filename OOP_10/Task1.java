import java.io.*;
import java.util.ArrayList;

public class Task1 extends Thread {
    private ArrayList <String> list = new ArrayList<String>();
    private Integer timeSleep;
    private Integer iter;

    public Task1(Integer timeSleep, Integer iter) {
        this.timeSleep = timeSleep;
        this.iter = iter;
    }
     /* Output text «I study Java» 10 times with
    the intervals of one second (Thread.sleep(1000);). */

    public void printThread(){
        for (int i=0; i<iter; i++){
            try {
                Thread.sleep(timeSleep);
                System.out.println("I study Java");
            }catch (InterruptedException ex){
                System.out.println(ex.fillInStackTrace());
            }
        }
    }
    /*Output two messages «Hello, world» and «Peace in the peace» 5 times each with the intervals of 2 seconds,
    and the second - 3 seconds. After printing messages, print the text «My name is …»
     */
    public void printThread2 () throws InterruptedException {
        for (int i=0; i<5; i++){
            try {
                Thread.sleep(2000);
                System.out.println("Hello, world");
                Thread.sleep(3000);
                System.out.println("Peace in the peace");
            }catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
            System.out.println("My name is …");
    }

    /*Prepare mytext.txt file with a lot of text inside.
Read context from file into array of strings.
Each array item contains one line from file.
Complete next tasks:
   1) count and write the number of symbols in every line.
   2) find the longest and the shortest line.
   3) find and write only that lines, which consist of word «var» */


    public void textInput() throws IOException {
        String fileName = "C:\\Users\\User\\IdeaProjects\\OOP_10\\src\\text.txt";
        int i=0;
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        ArrayList <String> s = new ArrayList<String>();
        String []a =new String[100];
        System.out.println("Read data from file: " + fileName);
        while ((a[i] = br.readLine()) != null) {
            s.add(a[i]);
            System.out.println("Read line: " + s.get(i));
            i++;
        }
        br.close();
        this.list = s;
    }
    public void countLine(){
        ArrayList <String> list1 = this.list;
        for (String s: list){
            System.out.println(s.length());
        }
    }
    public void longestAndShortestLine(){
        this.list =list;
        int longest =0;
        int longestIndex =0;
        int shortest=Integer.MAX_VALUE;
        int shortestIndex =0;
        for (int i =0; i<list.size(); i++){
            if (longest <list.get(i).length()){
                longest =list.get(i).length();
                longestIndex = i;
            }
            if (shortest>list.get(i).length()){
                shortest = list.get(i).length();
                shortestIndex = i;
            }
        }
        System.out.printf("The longest line is: %s \n The shortest line is: %s", list.get(longestIndex), list.get(shortestIndex));
    }
    public void findLine(String s){
        this.list =list;
        int a;
        for (String i: list){
            a=i.toLowerCase().indexOf(s.toLowerCase());
            if (a>0){
                System.out.printf("String which consist of word %s: \t %s",s.toUpperCase(), i);
            }
        }
    }

}
