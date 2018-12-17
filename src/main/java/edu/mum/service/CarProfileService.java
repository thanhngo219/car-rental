package edu.mum.service;

import java.util.List;

import edu.mum.domain.AnalysisStatus;
import edu.mum.domain.CarOwnerProfile;
import edu.mum.domain.CarProfile;

public interface CarProfileService extends GenericService<CarProfile> {

	List<CarProfile> findByCarOwnerProfile(CarOwnerProfile carOwnerProfile);

	List<CarProfile> findByStatus(AnalysisStatus analysisStatus);

	Boolean verifyIfPlateIsAlreadyRegistered(String plate, Long id);

}
