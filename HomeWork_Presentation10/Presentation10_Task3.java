package HomeWork_Presentation10;

//Create a thread «one», which would start the thread «two»,
// which has to output its number («Thread number two») 3 times and create thread «three»,
// which would to output message «Thread number three» 5 times.

class MyThread extends Thread {
    String name ;
    int iterations;

    MyThread( String name , int iterations) {
        this.name = name;
        this.iterations = iterations;
    }

    public void run(){
      	
        for ( int i = 0 ; i < iterations ; i++) {
            System.out.println("Thread number " +name+" "+this.getName());
        }
        if ( iterations == 0 ) {
            new MyThread(" two" , 3).start();
        } else if ( iterations == 3 ) {
            new MyThread(" three" , 5 ).start();
        } else if ( iterations > 3 ) {
            System.out.println("Finaly!!!!");
        }
    }

}



public class Presentation10_Task3 {
    public static void main( String[] Args) {
        MyThread thread1 = new MyThread ("one" , 0);
        
        thread1.start();
        
    }
}
