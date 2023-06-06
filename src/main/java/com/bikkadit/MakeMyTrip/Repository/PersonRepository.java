package com.bikkadit.MakeMyTrip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadit.MakeMyTrip.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>
{

	
}
