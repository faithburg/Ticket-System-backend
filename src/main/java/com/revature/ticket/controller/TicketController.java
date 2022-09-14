package com.revature.ticket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<Ticket> displayAllTickets() {
		List<Ticket> tickets = new ArrayList<Ticket> ();
		//logic to fetch ALL tickets from database
		tickets = ticketservice.fetchAllTickets();
		return tickets;
	}
	
}
