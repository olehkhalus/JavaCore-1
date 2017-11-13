package main;

import main.ReadAndWriteFile;
import main.Task1;
import myThread.*;
import java.io.IOException;

public class Main {
public static void main(String...args) throws IOException, InterruptedException {
    /* Output text «I study Java» 10 times with
    the intervals of one second (Thread.sleep(1000);). */
    Task1 task1= new Task1(1000,10);
   // task1.printThread();




    /*Output two messages «Hello, world» and «Peace in the peace» 5 times each with the intervals of 2 seconds,
    and the second - 3 seconds. After printing messages, print the text «My name is …»
     */
//  task1.printThread2();


    try {
        task1.textInput();
    }catch (IOException ex){
        System.out.println("File Write Error: " );
    }
    task1.countLine();
    System.out.println(task1.longestLine());
    System.out.println(task1.shortestLine());
    task1.findLine("var");



    /* HomeWork task1
    Run three threads and output there different messages for 5 times.
    The third thread supposed to start after finishing working of the two previous threads.
     */
   /* FirstMSG firstMSG = new FirstMSG();
    SecondMSG secondMSG = new SecondMSG();
    ThirdMSG thirdMSG = new ThirdMSG();
    firstMSG.start();
    secondMSG.start();
    firstMSG.join();
    secondMSG.join();
    thirdMSG.start();  */


   /* Cause a deadlock. Organize the expectations of ending a thread in main(),
   and make the end of the method main() in this thread. */
//   MyDeadLock myDeadLock = new MyDeadLock();
//   myDeadLock.thread1.start();
//   myDeadLock.thread2.start();


   /*
   Create a thread «one», which would start the thread «two», which has to output its number
   («Thread number two») 3 times and create thread «three»,
   which would to output message «Thread number three» 5 times.
    */
   // ThreadOne threadOne = new ThreadOne("One");
   // threadOne.start();



   /* Create file1.txt file with a text about your career.
    Read context from file into array of strings. Each array item contains one line from file.
    Write in to the file2.txt
    1) number of lines in file1.txt.
    2) the longest line in file1.txt.
    3) your name and birthday date. */

    ReadAndWriteFile test = new ReadAndWriteFile();
  //  test.readAndWriteFile();

}
}
