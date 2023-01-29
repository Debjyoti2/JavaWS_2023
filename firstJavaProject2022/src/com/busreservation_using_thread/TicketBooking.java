package com.busreservation_using_thread;

public class TicketBooking {
	
	private int availableTicket=3;
	
	public synchronized void bookTicket(String pName, int noOfTickets) {
		if(availableTicket>noOfTickets && noOfTickets>0) {
			System.out.println("Hi !!" + pName + " Ticket Booked Successfully - Nos:" + noOfTickets);
			availableTicket =availableTicket-noOfTickets;
		}
		else {
			System.out.println("Hi !!" + pName + " Sorry !! No ticket available!!");
		}
	}

}
