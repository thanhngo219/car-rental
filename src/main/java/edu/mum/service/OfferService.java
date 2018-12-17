package edu.mum.service;

import java.util.List;

import edu.mum.domain.CarBrand;
import edu.mum.domain.CarModel;
import edu.mum.domain.CarProfile;
import edu.mum.domain.Offer;

public interface OfferService extends GenericService<Offer> {

	List<Offer> findByCarProfile(CarProfile carProfile);

	List<Offer> findAllAvailables();

	List<Offer> findAllAvailableByCarBrand(CarBrand carBrand);

	List<Offer> findAllAvailablesByCarModel(CarModel carModel);

	List<Offer> findAllAvailablesByYear(Integer year);

	List<Offer> findAllAvailablesByYearAndModel(Integer year, CarModel carModel);

	List<Offer> findAllAvailableByYearAndBrand(Integer year, CarBrand carBrand);

}
