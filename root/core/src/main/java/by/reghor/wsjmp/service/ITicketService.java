package by.reghor.wsjmp.service;

import by.reghor.wsjmp.entity.Passenger;
import by.reghor.wsjmp.entity.Ticket;

public interface ITicketService {
	int bookTicket(int passengerId, Ticket ticket);

	Ticket getTicket(int ticketId);

	void payTicket(int ticketId);

	void returnTicket(int ticketId);
}
