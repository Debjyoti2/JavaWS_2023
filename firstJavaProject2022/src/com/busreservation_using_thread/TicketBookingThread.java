package com.busreservation_using_thread;

public class TicketBookingThread extends Thread{
	
	private TicketBooking ticketbooking;
	private String pname;
	private int noOfSeats;
	
	public TicketBookingThread(TicketBooking ticketbooking,String pname,int noOfSeats) {
		this.ticketbooking=ticketbooking;
		this.pname=pname;
		this.noOfSeats=noOfSeats;
	}

	@Override
	public void run() {
		ticketbooking.bookTicket(pname, noOfSeats);
	}
	
}
