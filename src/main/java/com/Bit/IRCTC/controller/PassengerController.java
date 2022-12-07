package com.Bit.IRCTC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bit.IRCTC.model.Passenger;
import com.Bit.IRCTC.model.Ticket;
import com.Bit.IRCTC.service.TicketBooking;


@RestController
public class PassengerController {

	@Autowired
	private TicketBooking ticketBooking;
	
	@PostMapping(value = "/bookTicket",produces = "application/json", consumes = "application/json")
	public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger psg){
		Ticket ticket = ticketBooking.bookTicket(psg);
		return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
	}
}
