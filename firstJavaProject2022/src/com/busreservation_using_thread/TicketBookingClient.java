package com.busreservation_using_thread;

public class TicketBookingClient {
	
	public static void main(String[] args) throws InterruptedException {
		TicketBooking tb = new TicketBooking();
		
		TicketBookingThread t1 = new TicketBookingThread(tb, "Kittu", 2);
		t1.start();
		
		TicketBookingThread t2 = new TicketBookingThread(tb, "Debrup", 2);
		t2.start();
 		//t1.join();
 		//t2.join();  //1st wait Kittu to get 2 ticket then debrup will proceed for 2 ticket.
	}

} 
