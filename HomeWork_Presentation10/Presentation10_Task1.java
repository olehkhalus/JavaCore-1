package HomeWork_Presentation10;


//Run three threads and output there different messages for 5 times.
//The third thread supposed to start after finishing working of the two previous threads.


class MyThread extends Thread {
    int number ;
    int pause;

    MyThread( int number , int pause) {
        this.number = number;
        this.pause = pause;
    }


    public void run(){
        for ( int i = 0 ; i < 5 ; i++) {
            try { sleep(pause);
            } catch (InterruptedException e) {}
            System.out.println("Thread " + number);
        }
    }
}

public class Presentation10_Task1 {
    public static void main( String[] Args){

        MyThread t1 = new MyThread(1,200);
        MyThread t2 = new MyThread(2,300);
        MyThread t3 = new MyThread(3,100);
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
        }

        t3.start();


    }

}
