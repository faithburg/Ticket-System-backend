package com.revature.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ticket.model.Ticket;
import com.revature.ticket.repo.TicketRepo;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepo ticketrepo;
	
	public List<Ticket> fetchAllTickets(){
		return ticketrepo.findAll();
	}
}
