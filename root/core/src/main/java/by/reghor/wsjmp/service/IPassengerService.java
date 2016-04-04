package by.reghor.wsjmp.service;

import by.reghor.wsjmp.entity.Passenger;

public interface IPassengerService {
	int createPassenger(Passenger passenger);
	Passenger getPassenger(int passengerId);
}
