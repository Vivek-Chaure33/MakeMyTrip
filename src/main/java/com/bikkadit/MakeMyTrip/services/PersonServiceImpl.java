package com.bikkadit.MakeMyTrip.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.bikkadit.MakeMyTrip.Repository.PersonRepository;
import com.bikkadit.MakeMyTrip.Repository.TicketRepository;
import com.bikkadit.MakeMyTrip.entities.Person;
import com.bikkadit.MakeMyTrip.entities.Ticket;

@Service
public class PersonServiceImpl implements PersonServiceI{

	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	private TicketRepository ticketRepo;
	
	@Autowired
	private WebClient.Builder webClient;
	
	@Override
	public Ticket bookTicket(Person person) {
		
		Person save = personRepo.save(person);
		
		Ticket t1 = webClient.build()
							.get()
							.uri("http://localhost:8989/irctc/"+save.getPersonId())
							.retrieve()
							.bodyToMono(Ticket.class)
							.block();
		
		Ticket saveTicket = ticketRepo.save(t1);
		
		return saveTicket;
	}

	

}
