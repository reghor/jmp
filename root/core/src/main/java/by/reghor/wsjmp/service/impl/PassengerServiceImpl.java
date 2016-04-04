package by.reghor.wsjmp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.reghor.wsjmp.dao.IPassengerDao;
import by.reghor.wsjmp.entity.Passenger;
import by.reghor.wsjmp.service.IPassengerService;

@Service
@Transactional
public class PassengerServiceImpl implements IPassengerService{
	
	@Autowired
	IPassengerDao passengerDao;
	
	@Override
	public int createPassenger(Passenger passenger) {
		passengerDao.createPassenger(passenger);
		return passenger.getPassengerId();
	}

	@Override
	public Passenger getPassenger(int passengerId) {
		return passengerDao.getPassenger(passengerId);
	}

}
