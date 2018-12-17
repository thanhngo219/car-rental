package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.CarOwnerProfileDao;
import edu.mum.domain.CarOwnerProfile;
import edu.mum.domain.ProfileStatus;
import edu.mum.service.CarOwnerProfileService;
import edu.mum.validation.ValidationException;

@Service
@Transactional
public class CarOwnerProfileServiceImpl implements CarOwnerProfileService {

	@Autowired
	private CarOwnerProfileDao repository;

	@Override
	public List<CarOwnerProfile> findAll() {
		return repository.findAll();
	}

	@Override
	public List<CarOwnerProfile> findAll(String orderingProperty) {
		return repository.findAll(orderingProperty);
	}

	@Override
	public CarOwnerProfile findById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void save(CarOwnerProfile carOwnerProfile) throws ValidationException {
		repository.save(carOwnerProfile);
	}

	@Override
	public void deleteById(Long id) {
		repository.delete(id);
	}

	@Override
	public List<CarOwnerProfile> findPendingApproveProfiles() {
		// TODO Auto-generated method stub
		return repository.findAll(); // .findPendingApplications();
	}

	@Override
	public void create(CarOwnerProfile profile) throws ValidationException {
//		if(findByUserId(profile.getUserId())) {
//			throw new ValidationException("The user id '" + profile.getUserId() + "' is already used by other. Please choose another.");
//		}
//		if(findByUserId(profile.getUser().getUsername())) {
//			throw new ValidationException("The user id '" + profile.getUser().getUsername() + "' is already used by other. Please choose another.");
//		}
		profile.setStatus(ProfileStatus.PENDING);
		repository.save(profile);
	}

	@Override
	public void approveProfile(CarOwnerProfile profile) {
		// TODO Auto-generated method stub
		profile.setStatus(ProfileStatus.APPROVED);
		repository.save(profile);
	}

}
