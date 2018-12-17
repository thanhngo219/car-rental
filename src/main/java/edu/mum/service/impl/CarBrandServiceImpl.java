package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.CarBrandDao;
import edu.mum.domain.CarBrand;
import edu.mum.service.CarBrandService;

@Service
@Transactional
public class CarBrandServiceImpl implements CarBrandService {
	@Autowired
	private CarBrandDao repository;

	@Override
	public List<CarBrand> findAll() {
		return repository.findAll();
	}

	@Override
	public List<CarBrand> findAll(String orderingProperty) {
		return repository.findAll(orderingProperty);
	}

	@Override
	public CarBrand findById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void save(CarBrand carBrand) {
		repository.save(carBrand);
	}

	@Override
	public void deleteById(Long id) {
		repository.delete(id);
	}
}
