package practice.com.printA1B2C3_2_thread;

public class Runner {

    private static  boolean isLetter =true;
    private static final Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread letterThread = new Thread(new LetterTask(isLetter,lock));
        Thread numberThread = new Thread(new NumberTask(isLetter,lock));
        letterThread.start();
        numberThread.start();

        letterThread.join();
        numberThread.join();

    }
}
