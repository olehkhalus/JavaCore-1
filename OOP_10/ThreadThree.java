public class ThreadThree extends Thread {
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
