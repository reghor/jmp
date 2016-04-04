package by.reghor.wsjmp.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.reghor.wsjmp.dao.IPassengerDao;
import by.reghor.wsjmp.entity.Passenger;

@Repository
public class PassengerDaoImpl implements IPassengerDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public int createPassenger(Passenger passenger) {
		entityManager.persist(passenger);
		return passenger.getPassengerId();
	}

	@Override
	public Passenger getPassenger(int passengerId) {
		return entityManager.find(Passenger.class, passengerId);
	}

}
