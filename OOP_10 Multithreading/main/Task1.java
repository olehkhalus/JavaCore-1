package main;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 extends Thread {
    private ArrayList <String> list = new ArrayList<String>();
    private Integer timeSleep;
    private Integer iter;
    private String fileName = "C:\\Users\\User\\IdeaProjects\\OOP_10\\src\\text.txt";

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
                MyThredByTasks1 myThred1 = new MyThredByTasks1();
                myThred1.start();
                MyThredByTasks2 myThred2 = new MyThredByTasks2();
                myThred2.start();
                myThred1.join();
                myThred2.join();
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
        int i=0;
        String stringTMP;
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        ArrayList <String> arrayOfText = new ArrayList<String>();
        System.out.println("Read data from file: " + fileName);
        while ((stringTMP = br.readLine()) != null) {
            arrayOfText.add(stringTMP);
            i++;
        }
        br.close();
        this.list = arrayOfText;
    }

    public List<Integer> countLine(){
        ArrayList <String> list1 = this.list;
        ArrayList<Integer> listOfInteger = new ArrayList<>();
        for (String s: list){
            listOfInteger.add(s.length());
        }
        return listOfInteger;
    }
    public String longestLine(){
        String longestLine ="";
        for (int i =0; i<list.size(); i++) {
            if (longestLine.length() < list.get(i).length()) {
                longestLine = list.get(i);
            }
        }
        return longestLine;
    }
    public String shortestLine() {
        int shortest = Integer.MAX_VALUE;
        String shortestLine = null;
        for (int i = 0; i < list.size(); i++) {
            if (shortest > list.get(i).length()) {
                shortest = list.get(i).length();
                shortestLine = list.get(i);
            }
        }
        return shortestLine;
    }

    public void findLine(String s){
        this.list =list;
        int indexOf;
        for (String i: list){
            indexOf=i.toLowerCase().indexOf(s.toLowerCase());
            if (indexOf>0){
                System.out.printf("String which consist of word %s: \t %s",s.toUpperCase(), i);
            }
        }
    }
}
class MyThredByTasks1 extends Thread{
    public void run() {
        for (int i=0; i<5; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello, world");
    }
    }
}
class MyThredByTasks2 extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Peace in the peace");
        }
    }
}