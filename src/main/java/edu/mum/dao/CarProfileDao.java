package edu.mum.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.domain.AnalysisStatus;
import edu.mum.domain.CarOwnerProfile;
import edu.mum.domain.CarProfile;

@Repository
public interface CarProfileDao extends GenericDao<CarProfile> {

	Boolean existsByPlate(String plate);

	Boolean existsByPlateAndIdNot(String plate, Long id);

	List<CarProfile> findByCarOwnerProfile(CarOwnerProfile carOwnerProfile);

	List<CarProfile> findByStatus(AnalysisStatus analysisStatus);
}
