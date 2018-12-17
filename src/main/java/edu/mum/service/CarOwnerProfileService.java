package edu.mum.service;

import java.util.List;

import edu.mum.domain.CarOwnerProfile;
import edu.mum.validation.ValidationException;

public interface CarOwnerProfileService extends GenericService<CarOwnerProfile> {
	public abstract List<CarOwnerProfile> findPendingApproveProfiles();

	public abstract List<CarOwnerProfile> findAll();

	public abstract CarOwnerProfile create(CarOwnerProfile profile) throws ValidationException;

	public abstract CarOwnerProfile findById(long id);

	public abstract CarOwnerProfile approveProfile(CarOwnerProfile profile) throws ValidationException;
}
