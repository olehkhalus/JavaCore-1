public class ThreadTwo extends Thread {
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
