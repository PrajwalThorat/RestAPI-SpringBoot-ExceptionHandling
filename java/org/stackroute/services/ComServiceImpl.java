package org.stackroute.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stackroute.exception.ProductNotFoundException;
import org.stackroute.model.Computer;
import org.stackroute.repository.ComRepository;

@Service
public class ComServiceImpl implements ComService {
	
	private ComRepository comRepository;
	
	@Autowired
	 public ComServiceImpl(ComRepository comRepository) {
		this.comRepository = comRepository;
	}

	@Override
	public Computer addModel(Computer computer) throws ProductNotFoundException {
		if (comRepository.existsById(computer.getComputerId())) {
			throw new ProductNotFoundException();	
		}
		Computer saveCom = comRepository.save(computer);
		return saveCom;
	}

	@Override
	public List<Computer> getListAllComputer() {
		return comRepository.findAll();
	}

	@Override
	public Computer getComputerById(int id) {
		return comRepository.getById(id);
	}
}
