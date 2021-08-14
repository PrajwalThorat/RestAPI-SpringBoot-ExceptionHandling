package org.stackroute.services;

import java.util.List;

import org.stackroute.exception.ProductNotFoundException;
import org.stackroute.model.Computer;

public interface ComService {

	public Computer addModel(Computer computer) throws ProductNotFoundException;
	public List<Computer> getListAllComputer();
	public Computer getComputerById(int id);
}
