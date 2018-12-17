package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.OfferDao;
import edu.mum.domain.AnalysisStatus;
import edu.mum.domain.CarBrand;
import edu.mum.domain.CarModel;
import edu.mum.domain.CarProfile;
import edu.mum.domain.Offer;

@Repository
public class OfferDaoImpl extends GenericDaoImpl<Offer> implements OfferDao {

	public List<Offer> findByCarProfileOrderByIdAsc(CarProfile carProfile) {
		Query query = entityManager.createQuery("select o from Offer o where o.carProfile=:carProfile order by o.id");
		return query.setParameter("carProfile", carProfile).getResultList();
	}

	public List<Offer> findByPublicationStatusAndAnalysisStatusCarProfile(Boolean publicationStatus,
			AnalysisStatus analysisStatus) {
		Query query = entityManager.createQuery(
				"select o from Offer o where o.publicationStatus=:publicationStatus and o.carProfile.status=:analysisStatus");
		return query.setParameter("publicationStatus", publicationStatus).setParameter("analysisStatus", analysisStatus)
				.getResultList();
	}

	public List<Offer> findByYearCarProfileAndAnalysisStatusCarProfile(Boolean publicationStatus, Integer year,
			AnalysisStatus analysisStatus) {
		Query query = entityManager.createQuery(
				"select o from Offer o where o.publicationStatus=:publicationStatus and o.carProfile.year=:year and o.carProfile.status=:analysisStatus");
		return query.setParameter("publicationStatus", publicationStatus).setParameter("year", year)
				.setParameter("analysisStatus", analysisStatus).getResultList();
	}

	public List<Offer> findByModelCarProfileAndAnalysisStatusCarProfile(Boolean publicationStatus, CarModel carModel,
			AnalysisStatus analysisStatus) {
		Query query = entityManager.createQuery(
				"select o from Offer o where o.publicationStatus=:publicationStatus and o.carProfile.model=:carModel and o.carProfile.status=:analysisStatus");
		return query.setParameter("publicationStatus", publicationStatus).setParameter("carModel", carModel)
				.setParameter("analysisStatus", analysisStatus).getResultList();
	}

	public List<Offer> findByBrandCarProfileAndAnalysisStatusCarProfile(Boolean publicationStatus, CarBrand carBrand,
			AnalysisStatus analysisStatus) {
		Query query = entityManager.createQuery(
				"select o from Offer o where o.publicationStatus=:publicationStatus and o.carProfile.model.brand=:carBrand and o.carProfile.status=:analysisStatus");
		return query.setParameter("publicationStatus", publicationStatus).setParameter("carBrand", carBrand)
				.setParameter("analysisStatus", analysisStatus).getResultList();
	}

	public List<Offer> findByYearAndModelCarProfileAndAnalysisStatusCarProfile(Boolean publicationStatus, Integer year,
			CarModel carModel, AnalysisStatus analysisStatus) {
		Query query = entityManager.createQuery(
				"select o from Offer  o where o.publicationStatus=:publicationStatus and o.carProfile.year=:year and o.carProfile.model=:carModel and o.carProfile.status=:analysisStatus");
		return query.setParameter("publicationStatus", publicationStatus).setParameter("year", year)
				.setParameter("carModel", carModel).setParameter("analysisStatus", analysisStatus).getResultList();
	}

	public List<Offer> findByYearAndBrandCarProfileAndAnalysisStatusCarProfile(Boolean publicationStatus, Integer year,
			CarBrand carBrand, AnalysisStatus analysisStatus) {
		Query query = entityManager.createQuery(
				"select o from Offer  o where o.publicationStatus=:publicationStatus and o.carProfile.year=:year and o.carProfile.model.brand=:carBrand and o.carProfile.status=:analysisStatus");
		return query.setParameter("publicationStatus", publicationStatus).setParameter("year", year)
				.setParameter("carBrand", carBrand).setParameter("analysisStatus", analysisStatus).getResultList();
	}

}
