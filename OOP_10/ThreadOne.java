public class ThreadOne extends Thread{
ThreadOne (String name){
    super(name);
}

public void run(){

    System.out.printf("Thread number %s", Thread.currentThread().getName());
    System.out.println();
    ThreadTwo two =new ThreadTwo("Two");
    two.start();
}
}
