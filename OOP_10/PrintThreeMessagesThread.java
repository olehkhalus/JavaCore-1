/**
 * Created by User on 29.10.2017.
 */
public class PrintThreeMessagesThread extends Thread {
    PrintThreeMessagesThread(String name){
        super(name);
    }
    public void run(){
        try {
            for (int i=0; i<5; i++){
            Thread.sleep(2000);
            System.out.println("Hello, world");
            Thread.sleep(3000);
            System.out.println("Peace in the peace");}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
