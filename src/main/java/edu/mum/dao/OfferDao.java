package edu.mum.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.domain.AnalysisStatus;
import edu.mum.domain.CarBrand;
import edu.mum.domain.CarModel;
import edu.mum.domain.CarProfile;
import edu.mum.domain.Offer;

@Repository
public interface OfferDao extends GenericDao<Offer> {

	List<Offer> findByCarProfileOrderByIdAsc(CarProfile carProfile);

	List<Offer> findByPublicationStatusAndAnalysisStatusCarProfile(Boolean publicationStatus,
			AnalysisStatus analysisStatus);

	List<Offer> findByYearCarProfileAndAnalysisStatusCarProfile(Boolean publicationStatus, Integer year,
			AnalysisStatus analysisStatus);

	List<Offer> findByModelCarProfileAndAnalysisStatusCarProfile(Boolean publicationStatus, CarModel carModel,
			AnalysisStatus analysisStatus);

	List<Offer> findByBrandCarProfileAndAnalysisStatusCarProfile(Boolean publicationStatus, CarBrand carBrand,
			AnalysisStatus analysisStatus);

	List<Offer> findByYearAndModelCarProfileAndAnalysisStatusCarProfile(Boolean publicationStatus, Integer year,
			CarModel carModel, AnalysisStatus analysisStatus);

	List<Offer> findByYearAndBrandCarProfileAndAnalysisStatusCarProfile(Boolean publicationStatus, Integer year,
			CarBrand carBrand, AnalysisStatus analysisStatus);

}
