package org.stackroute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.stackroute.model.Computer;


@Repository
public interface ComRepository extends JpaRepository<Computer, Integer>{
	
}