package by.reghor.wsjmp.dao;

import by.reghor.wsjmp.entity.Passenger;

public interface IPassengerDao {
	int createPassenger (Passenger passenger);
	Passenger getPassenger(int passengerId);
}
