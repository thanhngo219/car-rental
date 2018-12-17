package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.CarModelDao;
import edu.mum.domain.CarModel;
import edu.mum.service.CarModelService;

@Service
@Transactional
public class CarModelServiceImpl implements CarModelService {
	@Autowired
	private CarModelDao repository;

	@Override
	public List<CarModel> findAll() {
		return repository.findAll();
	}

	@Override
	public List<CarModel> findAll(String orderingProperty) {
		return repository.findAll(orderingProperty);
	}

	@Override
	public CarModel findById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void save(CarModel carModel) {
		repository.save(carModel);
	}

	@Override
	public void deleteById(Long id) {
		repository.delete(id);
	}
}
