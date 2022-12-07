package com.Bit.IRCTC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bit.IRCTC.model.Ticket;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
