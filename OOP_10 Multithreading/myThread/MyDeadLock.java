package myThread;

public class MyDeadLock {
    String string1 ="Hello world";
    String string2 = "Bay bay";
    public Thread thread1 = new Thread("My Thread1"){
      public void run(){
        while (true){
            synchronized (string1){
                synchronized (string2){
                    System.out.println(string1+string2);
                }
            }
        }
      }
    };
   public Thread thread2 = new Thread("My Thread2"){
        public void run(){
            while (true){
                synchronized (string2){
                    synchronized (string1){
                        System.out.println(string2+string1);
                    }
                }
            }
        }
    };

}
