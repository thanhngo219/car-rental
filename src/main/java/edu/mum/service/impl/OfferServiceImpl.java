package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.OfferDao;
import edu.mum.domain.AnalysisStatus;
import edu.mum.domain.CarBrand;
import edu.mum.domain.CarModel;
import edu.mum.domain.CarProfile;
import edu.mum.domain.Offer;
import edu.mum.service.OfferService;
import edu.mum.validation.ValidationException;

@Service
@Transactional
public class OfferServiceImpl implements OfferService {
	@Autowired
	private OfferDao repository;

	@Override
	public List<Offer> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Offer> findAll(String orderingProperty) {
		return repository.findAll(orderingProperty);
	}

	@Override
	public Offer findById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void save(Offer offer) throws ValidationException {
		if (offer.getCarProfile().getStatus() != AnalysisStatus.APPROVED) {
			throw new ValidationException("Car Profile must be approved to register or alter any offer to it!");
		}
		repository.save(offer);
	}

	@Override
	public void deleteById(Long id) {
		repository.delete(id);
	}

	public List<Offer> findByCarProfile(CarProfile carProfile) {
		return repository.findByCarProfileOrderByIdAsc(carProfile);
	}

	public List<Offer> findAllAvailables() {
		return repository.findByPublicationStatusAndAnalysisStatusCarProfile(true, AnalysisStatus.APPROVED);
	}

	public List<Offer> findAllAvailableByCarBrand(CarBrand carBrand) {
		return repository.findByBrandCarProfileAndAnalysisStatusCarProfile(true, carBrand, AnalysisStatus.APPROVED);
	}

	public List<Offer> findAllAvailablesByCarModel(CarModel carModel) {
		return repository.findByModelCarProfileAndAnalysisStatusCarProfile(true, carModel, AnalysisStatus.APPROVED);
	}

	public List<Offer> findAllAvailablesByYear(Integer year) {
		return repository.findByYearCarProfileAndAnalysisStatusCarProfile(true, year, AnalysisStatus.APPROVED);
	}

	public List<Offer> findAllAvailablesByYearAndModel(Integer year, CarModel carModel) {
		return repository.findByYearAndModelCarProfileAndAnalysisStatusCarProfile(true, year, carModel,
				AnalysisStatus.APPROVED);
	}

	public List<Offer> findAllAvailableByYearAndBrand(Integer year, CarBrand carBrand) {
		return repository.findByYearAndBrandCarProfileAndAnalysisStatusCarProfile(true, year, carBrand,
				AnalysisStatus.APPROVED);
	}

//    public List<Offer> filterOffers(int brandId, int modelId , int year){
//    public List<Offer> findByAvailablesByCarBrandCarBrand(CarBrand carBrand, CarModel carModel, Integer year){

//        if(carBrand==null && )

	/*
	 * List<Offer> offers = findAll().stream() // .filter(x ->
	 * x.getStatus().getValue() == CarStatus.APPROVED.getValue()) // .filter(x ->
	 * x.getStatus() == AnalysisStatus.APPROVED) .filter(x ->
	 * x.getCarProfile().getModel().getId() == modelId || modelId == 0 ) .filter(x
	 * -> x.getCarProfile().getModel().getBrand().getId() == brandId || brandId ==
	 * 0) .filter(x -> x.getCarProfile().getYear() == year || year == 0)
	 * .collect(Collectors.toList()); return offers;
	 */
//    }
}
