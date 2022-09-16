package com.revature.ticket.service;

import java.util.List;
import java.util.Optional;

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
	
	public Ticket saveTicketToSQL(Ticket ticket) {
		return ticketrepo.save(ticket);
	}
	
	public Optional<Ticket> fetchTicketById(int id) {
		return ticketrepo.findById(id);
	}
	
	public List<Ticket> fetchTicketByPriority(String priority){
		return ticketrepo.findAllByPriority(priority);
	}
	
	public String deleteTicketById(int id) {
		String result;
		try {
			ticketrepo.deleteById(id);
			result = "ticket successfully deleted";
		} catch (Exception e) {
			result = "ticket with ID " + id + " is not deleted";
		}
		return result;
	}
}
