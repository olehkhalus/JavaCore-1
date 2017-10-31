package HomeWork_Presentation10;

//Create a thread «one», which would start the thread «two»,
// which has to output its number («Thread number two») 3 times and create thread «three»,
// which would to output message «Thread number three» 5 times.

class T extends Thread {
    String number ;
    int iterations;

    T( String number , int iterations) {
        this.number = number;
        this.iterations = iterations;
    }

    public void run(){
        for ( int i = 0 ; i < iterations ; i++) {
            System.out.println("Thread number" + number);
        }
        if ( iterations == 0 ) {
            new T(" two" , 3).run();
        } else if ( iterations == 3 ) {
            new T(" three" , 5 ).run();
        } else if ( iterations > 3 ) {
            System.out.println("Finaly!!!!");
        }
    }

}



public class Presentation10_Task3 {
    public static void main( String[] Args) {
        T thread1 = new T ("one" , 0);
        

        thread1.run();
        



    }
}
