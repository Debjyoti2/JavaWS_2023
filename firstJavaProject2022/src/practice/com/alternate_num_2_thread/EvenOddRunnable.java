package practice.com.alternate_num_2_thread;

public class EvenOddRunnable implements Runnable {

    int minValue;
    int maxValue;
    Object lock;

    EvenOddRunnable(int minValue,int maxValue){
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.lock=new Object();
    }


    @Override
    public void run() {
        while(minValue<=maxValue){
            if(minValue%2==0 && "even".equalsIgnoreCase(Thread.currentThread().getName())){
                synchronized (lock){
                    try {
                        System.out.println(Thread.currentThread().getName() + " :: " + minValue);
                        minValue ++;
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if(minValue%2!=0 && "odd".equalsIgnoreCase(Thread.currentThread().getName())){
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName() + " :: " + minValue);
                    minValue++;
                    lock.notify();
                }
            }
        }


    }
}
