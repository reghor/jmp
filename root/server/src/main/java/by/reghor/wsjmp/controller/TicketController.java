package by.reghor.wsjmp.controller;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import by.reghor.wsjmp.entity.Ticket;
import by.reghor.wsjmp.service.ITicketService;

@Path(value = "/tickets")
public class TicketController {

	@Autowired
	ITicketService ticketService;

	@Path("{id}")
	@Produces(value = "text/plain")
	public Ticket getTicket(@PathParam("id") int ticketId) {
		return ticketService.getTicket(ticketId);
	}
	@PUT
	public int bookTicket(Ticket ticket, int passengerId){
		return ticketService.bookTicket(passengerId, ticket);
	}
	public  payTicket(int ticketId){
		
	}
	
	public returnTicket 
}
