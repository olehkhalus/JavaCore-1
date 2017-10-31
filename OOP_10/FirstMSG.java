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
