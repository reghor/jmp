package by.reghor.wsjmp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;

@Entity
public class Ticket {

	private int ticketId;
	private String departureCountry;
	private String arrivalCountry;
	private Date departureDate;
	private Date arrivalDate;
	private int price;
	@Enumerated(EnumType.STRING)
	private TicketStatus status;
	@OneToOne
	private Passenger passenger;

	public Ticket() {
		super();
	}

	public Ticket(int ticketId, String departureCountry, String arrivalCountry, Date departureDate, Date arrivalDate,
			int price, TicketStatus status, Passenger passenger) {
		super();
		this.ticketId = ticketId;
		this.departureCountry = departureCountry;
		this.arrivalCountry = arrivalCountry;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.price = price;
		this.status = status;
		this.passenger = passenger;
	}

	public Ticket(int ticketId) {
		super();
		this.ticketId = ticketId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getDepartureCountry() {
		return departureCountry;
	}

	public void setDepartureCountry(String departureCountry) {
		this.departureCountry = departureCountry;
	}

	public String getArrivalCountry() {
		return arrivalCountry;
	}

	public void setArrivalCountry(String arrivalCountry) {
		this.arrivalCountry = arrivalCountry;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public TicketStatus getStatus() {
		return status;
	}

	public void setStatus(TicketStatus status) {
		this.status = status;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalCountry == null) ? 0 : arrivalCountry.hashCode());
		result = prime * result + ((arrivalDate == null) ? 0 : arrivalDate.hashCode());
		result = prime * result + ((departureCountry == null) ? 0 : departureCountry.hashCode());
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + ((passenger == null) ? 0 : passenger.hashCode());
		result = prime * result + price;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ticketId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (arrivalCountry == null) {
			if (other.arrivalCountry != null)
				return false;
		} else if (!arrivalCountry.equals(other.arrivalCountry))
			return false;
		if (arrivalDate == null) {
			if (other.arrivalDate != null)
				return false;
		} else if (!arrivalDate.equals(other.arrivalDate))
			return false;
		if (departureCountry == null) {
			if (other.departureCountry != null)
				return false;
		} else if (!departureCountry.equals(other.departureCountry))
			return false;
		if (departureDate == null) {
			if (other.departureDate != null)
				return false;
		} else if (!departureDate.equals(other.departureDate))
			return false;
		if (passenger == null) {
			if (other.passenger != null)
				return false;
		} else if (!passenger.equals(other.passenger))
			return false;
		if (price != other.price)
			return false;
		if (status != other.status)
			return false;
		if (ticketId != other.ticketId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", departureCountry=" + departureCountry + ", arrivalCountry="
				+ arrivalCountry + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate + ", price="
				+ price + ", status=" + status + ", passenger=" + passenger + "]";
	}

}
