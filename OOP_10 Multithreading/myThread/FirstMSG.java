package myThread;
public class FirstMSG extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                FirstMSG.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("First message");
        }
    }
}
class SecondMSG extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                SecondMSG.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Second message");
        }
    }
}
class ThirdMSG extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Third message");
        }
    }
}
