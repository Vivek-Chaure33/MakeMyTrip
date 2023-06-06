package com.bikkadit.MakeMyTrip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadit.MakeMyTrip.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Long>{

}
