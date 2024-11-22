package practice.com.printA1B2C3_2_thread;

public class LetterTask implements Runnable{

    boolean isLetter;
    Object lock;
    LetterTask(boolean isLetter,Object lock){
        this.isLetter=isLetter;
        this.lock =lock;
    }
    @Override
    public void run() {
        for(char c='A';c<='Z';c++){
            synchronized (lock){
                if(!this.isLetter){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print(c + " ");
                isLetter=false;
                lock.notify();

            }

        }

    }
}
