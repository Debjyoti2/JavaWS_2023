package com.inter_thread_communication;

public class MovieTicketApp {

	public static void main(String[] args) throws InterruptedException {
		Earnings erThread = new Earnings();
		erThread.start();

		synchronized (erThread) {
			erThread.wait();
			System.out.println("Total earnings is ::" + erThread.totalEarnings);
		}
		//total earnings 0 dekhacche karon erThread run hobar age ei main thread execute hoye jacche..diye 0 pa66e.. run method execute hobar agei
	}
}

class Earnings extends Thread {                                                                                                                                                                                        
	int totalEarnings=0;

	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<10;i++) {
				totalEarnings=totalEarnings+100; 
			}
			notify();
		}
	}
}
