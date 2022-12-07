package com.Bit.IRCTC.service;

import com.Bit.IRCTC.model.Passenger;
import com.Bit.IRCTC.model.Ticket;

public interface TicketBooking {

	public  abstract Ticket bookTicket(Passenger psg); 
	
	
}
