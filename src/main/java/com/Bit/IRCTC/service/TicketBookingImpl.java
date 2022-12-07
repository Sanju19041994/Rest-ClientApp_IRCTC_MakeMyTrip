package com.Bit.IRCTC.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bit.IRCTC.model.Passenger;
import com.Bit.IRCTC.model.Ticket;
import com.Bit.IRCTC.repository.PassengerRepo;
import com.Bit.IRCTC.repository.TicketRepo;



@Service
public class TicketBookingImpl implements TicketBooking {

	@Autowired
	private PassengerRepo passengerRepo;
	
	@Autowired
	private TicketRepo ticketRepo;
	
	@Override
	public Ticket bookTicket(Passenger psg) {
		 Passenger passenger = passengerRepo.save(psg);
		if( passenger != null) {

//			Ticket t = new Ticket();
//			t.setPnr(Math.random()*1000);
//			t.setPrice(450.00);
//			t.setTicketStatus("Booked");
//			
//			Ticket ticket = ticketRepo.findById(t.getId()).get();
			Ticket ticket = ticketRepo.findById(1).get();
			return ticket;
		}

		return null;
	}

}
