package practice.com.alternate_num_2_thread;

public class Runner {

    public static void main(String[] args) {

        EvenOddRunnable evenOddRunnable = new EvenOddRunnable(1,100);
        Thread th1 = new Thread(evenOddRunnable,"even");
        Thread th2 = new Thread(evenOddRunnable,"odd");
        th1.start();
        th2.start();

    }
}

