package practice.com.printA1B2C3_2_thread;

public class NumberTask implements Runnable{

    boolean isLetter;
    Object lock;

    NumberTask(boolean isLetter, Object lock){
        this.isLetter=isLetter;
        this.lock=lock;
    }
    @Override
    public void run() {
        for(int i=1;i<=26;i++){
            synchronized (lock){
                if(isLetter){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print(i + " ");
                isLetter=true;
                lock.notify();
            }
        }
    }
}
