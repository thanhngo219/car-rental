package edu.mum.service;

import java.util.List;

import edu.mum.domain.CarOwnerProfile;
import edu.mum.validation.ValidationException;

public interface CarOwnerProfileService extends GenericService<CarOwnerProfile> {
	public abstract List<CarOwnerProfile> findPendingApproveProfiles();

	public abstract void create(CarOwnerProfile profile) throws ValidationException;

	public abstract void approveProfile(CarOwnerProfile profile) throws ValidationException;
}
