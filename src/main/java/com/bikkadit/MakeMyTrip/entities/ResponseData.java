package com.bikkadit.MakeMyTrip.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {
	private Ticket ticket;
	private Person person;
}
