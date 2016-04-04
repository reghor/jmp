package by.reghor.wsjmp.dao;

import by.reghor.wsjmp.entity.Passenger;
import by.reghor.wsjmp.entity.Ticket;

public interface ITicketDao {

	int createTicket(Ticket ticket);

	Ticket getTicket(int ticketId);

	void updateTicket(Ticket ticket);
	
	void deleteTicket(int  ticketId);
	
	void updateTicketStatus(Ticket ticket);



}
