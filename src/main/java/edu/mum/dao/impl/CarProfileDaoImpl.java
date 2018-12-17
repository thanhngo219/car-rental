package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.CarProfileDao;
import edu.mum.domain.AnalysisStatus;
import edu.mum.domain.CarOwnerProfile;
import edu.mum.domain.CarProfile;

@Repository
public class CarProfileDaoImpl extends GenericDaoImpl<CarProfile> implements CarProfileDao {

	public Boolean existsByPlate(String plate) {
		Query query = entityManager.createQuery("select c from CarProfile c where c.plate = :plate");
		return query.setParameter("plate", plate).getResultList().size() > 0;
	}

	public Boolean existsByPlateAndIdNot(String plate, Long id) {
		Query query = entityManager.createQuery("select c from CarProfile c where c.plate = :plate and c.id != :id");
		return query.setParameter("plate", plate).setParameter("id", id).getResultList().size() > 0;
	}

	public List<CarProfile> findByCarOwnerProfile(CarOwnerProfile carOwnerProfile) {
		Query query = entityManager
				.createQuery("select c from CarProfile c where c.carOwnerProfile = :carOwnerProfile");
		return (List<CarProfile>) query.setParameter("carOwnerProfile", carOwnerProfile).getResultList();
	}

	public List<CarProfile> findByStatus(AnalysisStatus analysisStatus) {
		Query query = entityManager.createQuery("select c from CarProfile c where c.analysisStatus = :analysisStatus");
		return (List<CarProfile>) query.setParameter("analysisStatus", analysisStatus.name()).getResultList();
	}
}
