public class MyThread extends Thread {
    public static void outputWithIntervals(String text, int pause, int count){
        for(int i = 0; i < count; i++){
            try{
                System.out.println(text);
                Thread.sleep(pause);
            }
            catch (InterruptedException ie){

            }
        }
    }

    public static void output2MessagesWithIntervals(String text1, int pause1, String text2, int pause2, int count){
        for(int i = 0; i < count; i++){
            try{
                System.out.println(text1);
                Thread.sleep(pause1);
                System.out.println(text2);
                Thread.sleep(pause2);

            }
            catch (InterruptedException e){

            }
        }
    }

    public static void main(String[] args) {
        MyThread.outputWithIntervals("I study Java", 1000, 5);
        MyThread.output2MessagesWithIntervals("Hello",2000,"Bye",3000,3);
    }
}
