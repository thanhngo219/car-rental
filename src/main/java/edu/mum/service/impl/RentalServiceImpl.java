package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.RentalDao;
import edu.mum.domain.Rental;
import edu.mum.service.RentalService;

@Service
@Transactional
public class RentalServiceImpl implements RentalService {
	@Autowired
	private RentalDao repository;

	@Override
	public List<Rental> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Rental> findAll(String orderingProperty) {
		return repository.findAll(orderingProperty);
	}

	@Override
	public Rental findById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void save(Rental rental) {
		repository.save(rental);
	}

	@Override
	public void deleteById(Long id) {
		repository.delete(id);
	}

}
