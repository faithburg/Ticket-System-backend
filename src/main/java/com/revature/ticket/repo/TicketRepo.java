package com.revature.ticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ticket.model.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
