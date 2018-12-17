package edu.mum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "carprofile")
public class CarProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne
	private CarModel model;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "color")
	private Color color;
	
	@Column(name = "year")
	private Integer year;
	
	@Enumerated
	@Column(name = "status")
	private AnalysisStatus status = AnalysisStatus.PENDING;
	
	@ManyToOne
	private CarOwnerProfile carOwnerProfile;
	
	@Column(name = "plate")
	private String plate;
	
	@OneToMany(mappedBy = "carProfile")
	private List<Offer> offers = new ArrayList<>();

	@Transient
	private CarBrand carBrandSelected;

	public CarProfile() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CarModel getModel() {
		return model;
	}

	public void setModel(CarModel model) {
		this.model = model;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public AnalysisStatus getStatus() {
		return status;
	}

	public void setStatus(AnalysisStatus status) {
		this.status = status;
	}

	public CarOwnerProfile getCarOwnerProfile() {
		return carOwnerProfile;
	}

	public void setCarOwnerProfile(CarOwnerProfile carOwnerProfile) {
		this.carOwnerProfile = carOwnerProfile;
	}

	public List<Offer> getOffers() {
		return offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public CarBrand getCarBrandSelected() {
		return carBrandSelected;
	}

	public void setCarBrandSelected(CarBrand carBrandSelected) {
		this.carBrandSelected = carBrandSelected;
	}
}
