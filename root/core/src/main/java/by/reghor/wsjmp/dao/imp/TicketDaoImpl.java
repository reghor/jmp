package by.reghor.wsjmp.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.reghor.wsjmp.dao.ITicketDao;
import by.reghor.wsjmp.entity.Passenger;
import by.reghor.wsjmp.entity.Ticket;

@Repository
public class TicketDaoImpl implements ITicketDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Ticket getTicket(int ticketId) {
		Ticket ticket = entityManager.find(Ticket.class, ticketId);
		return ticket;
	}

	@Override
	public int createTicket(Ticket ticket) {
		entityManager.persist(ticket);
		return ticket.getTicketId();
	}

	@Override
	public void updateTicket(Ticket ticket) {
		entityManager.merge(ticket);

	}

	@Override
	public void deleteTicket(int ticketId) {
		Ticket ticketToDelete = new Ticket(ticketId);
		entityManager.remove(ticketToDelete);
	}

	@Override
	public void updateTicketStatus(Ticket ticket) {
		Ticket ticketToUpdateStatus = entityManager.find(Ticket.class, ticket.getTicketId());
		if (ticketToUpdateStatus != null) {
			ticketToUpdateStatus.setStatus(ticket.getStatus());
		}
	}

}
