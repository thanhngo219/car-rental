package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.CarProfileDao;
import edu.mum.domain.AnalysisStatus;
import edu.mum.domain.CarOwnerProfile;
import edu.mum.domain.CarProfile;
import edu.mum.service.CarProfileService;
import edu.mum.validation.ValidationException;

@Service
@Transactional
public class CarProfileServiceImpl implements CarProfileService {
	@Autowired
	private CarProfileDao repository;

	public List<CarProfile> findAll() {
		return repository.findAll();
	}

	@Override
	public List<CarProfile> findAll(String orderingProperty) {
		return repository.findAll(orderingProperty);
	}

	public List<CarProfile> findByCarOwnerProfile(CarOwnerProfile carOwnerProfile) {
		return repository.findByCarOwnerProfile(carOwnerProfile);
	}

	public List<CarProfile> findByStatus(AnalysisStatus analysisStatus) {
		return repository.findByStatus(analysisStatus);
	}

	@Override
	public CarProfile findById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void save(CarProfile carProfile) throws ValidationException {
		if (verifyIfPlateIsAlreadyRegistered(carProfile.getPlate(), carProfile.getId())) {
			throw new ValidationException("Already there is a Car Profile registered with the informed plate");
		}
		repository.save(carProfile);
	}

	@Override
	public void deleteById(Long id) {
		repository.delete(id);
	}

	@Override
	public boolean verifyIfPlateIsAlreadyRegistered(String plate, Long id) {
		if (id == null) {
			return repository.existsByPlate(plate);
		} else {
			return repository.existsByPlateAndIdNot(plate, id);
		}
	}

}
