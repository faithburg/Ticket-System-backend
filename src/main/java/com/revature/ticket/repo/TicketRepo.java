package com.revature.ticket.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ticket.model.Ticket;
import com.revature.ticket.model.User;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {

	public List<Ticket> findAllByPriority(String priority);
	
}
