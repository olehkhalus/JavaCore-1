package myThread;
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

class ThreadTwo extends Thread {
    ThreadTwo(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.printf("Thread number %s", Thread.currentThread().getName());
            System.out.println();
        }
        ThreadThree threadThree = new ThreadThree("Three");
        threadThree.start();
    }
}

class ThreadThree extends Thread {
    ThreadThree(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Thread number %s", Thread.currentThread().getName());
            System.out.println();
        }
    }
}

