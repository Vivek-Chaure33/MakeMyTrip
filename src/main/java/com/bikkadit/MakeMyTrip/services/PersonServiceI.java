package com.bikkadit.MakeMyTrip.services;

import com.bikkadit.MakeMyTrip.entities.Person;
import com.bikkadit.MakeMyTrip.entities.Ticket;

public interface PersonServiceI {

	
	//book Ticket
	Ticket bookTicket(Person person);
	
}
