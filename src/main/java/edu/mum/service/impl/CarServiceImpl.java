package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.CarDao;
import edu.mum.domain.Car;
import edu.mum.service.CarService;

@Service
@Transactional
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDao repository;

	public List<Car> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Car> findAll(String orderingProperty) {
		return repository.findAll(orderingProperty);
	}

	@Override
	public Car findById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void save(Car car) {
		repository.save(car);
	}

	@Override
	public void deleteById(Long id) {
		repository.delete(id);
	}
}
