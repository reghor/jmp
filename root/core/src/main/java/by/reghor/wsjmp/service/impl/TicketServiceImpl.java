package by.reghor.wsjmp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.reghor.wsjmp.dao.IPassengerDao;
import by.reghor.wsjmp.dao.ITicketDao;
import by.reghor.wsjmp.entity.Passenger;
import by.reghor.wsjmp.entity.Ticket;
import by.reghor.wsjmp.entity.TicketStatus;
import by.reghor.wsjmp.service.ITicketService;

@Service
@Transactional
public class TicketServiceImpl implements ITicketService {

	@Autowired
	ITicketDao ticketDao;
	@Autowired
	IPassengerDao passengerDao;

	@Override
	public Ticket getTicket(int ticketId) {
		return ticketDao.getTicket(ticketId);
	}

	@Override
	public void payTicket(int ticketId) {

		Ticket ticketToUpdate = ticketDao.getTicket(ticketId);
		if (ticketToUpdate != null && ticketToUpdate.getStatus().equals(TicketStatus.BOOKED)) {
			ticketToUpdate.setStatus(TicketStatus.PAID);
		}
	}

	@Override
	public void returnTicket(int ticketId) {
		ticketDao.deleteTicket(ticketId);
	}

	@Override
	public int bookTicket(int passengerId, Ticket ticket) {
		ticket.setStatus(TicketStatus.BOOKED);
		int ticketId = ticketDao.createTicket(ticket);
		Passenger passengerToAssign = passengerDao.getPassenger(passengerId);
		ticket.setPassenger(passengerToAssign);
		passengerToAssign.getTickets().add(ticket);
		return ticketId;
	}

}
