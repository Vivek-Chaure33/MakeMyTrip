package com.bikkadit.MakeMyTrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.MakeMyTrip.entities.Person;
import com.bikkadit.MakeMyTrip.entities.ResponseData;
import com.bikkadit.MakeMyTrip.entities.Ticket;
import com.bikkadit.MakeMyTrip.services.PersonServiceI;

@RestController
@RequestMapping("/makemytrip")
public class PersonController {

	@Autowired
	private PersonServiceI personService;
	
	
	@PostMapping("/bookTicket")
	public ResponseEntity<ResponseData> bookTicket(@RequestBody Person person){
	
		ResponseData response = new ResponseData(); 
		
		
		Ticket ticket = personService.bookTicket(person);

		response.setTicket(ticket);
		response.setPerson(person);
		
		return new ResponseEntity<ResponseData>(response,HttpStatus.CREATED);
		
	}
	
	
}
