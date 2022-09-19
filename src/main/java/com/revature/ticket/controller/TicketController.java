package com.revature.ticket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ticket.model.Ticket;
import com.revature.ticket.service.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService ticketservice;

	@GetMapping (path = "/admin/tickets")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Ticket> displayAllTickets() {
		List<Ticket> tickets = new ArrayList<Ticket> ();
		//logic to fetch ALL tickets from database
		tickets = ticketservice.fetchAllTickets();
		return tickets;
	}
	
	@PostMapping (path = "/createticket")
	@CrossOrigin(origins = "http://localhost:4200")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		return ticketservice.saveTicketToSQL(ticket);
	}
	
	@GetMapping (path = "/admin/tickets/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Ticket displayTicketById(@PathVariable int id) {
		return ticketservice.fetchTicketById(id).get();
	}
	
	@GetMapping (path = "/admin/priority/{priority}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Ticket> displayTicketById(@PathVariable String priority) {
		return ticketservice.fetchTicketByPriority(priority);
	}
	
	@DeleteMapping (path = "/admin/deleteticket/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String deleteTicketById(@PathVariable int id) {
		return ticketservice.deleteTicketById(id);
	}
}
