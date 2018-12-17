package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.mum.service.RentalService;

@Controller
public class RentController {

	@Autowired
	private RentalService rentalService;
//
//	private Rental rental;
//
//	private double totalRent;
//
//	private String calcDetails;
//
//	@PostConstruct
//	void init() {
//		rental = (Rental) getAttributeFromTheSession(Property.SESSION_SELECTED_OFFER);
//		rental.setCreditCardInfo(new CreditCardInfo());
//		totalRent = CalcUtil.calculateTotalRent(rental);
//	}
//
//	public double getTotalRent() {
//		return totalRent;
//	}
//
//	public void setTotalRent(double totalRent) {
//		this.totalRent = totalRent;
//	}
//
//	public Rental getRental() {
//		return rental;
//	}
//
//	public void setRental(Rental rental) {
//		this.rental = rental;
//	}
//
//	public String getCalcDetails() {
//		calcDetails = "(" + (rental.getOffer().getPrice() - rental.getOffer().getDiscount()) + " x "
//				+ CalcUtil.getDifferenceDays(rental.getStartDate(), rental.getEndDate()) + ")";
//		return calcDetails;
//	}
//
//	public void setCalcDetails(String calcDetails) {
//		this.calcDetails = calcDetails;
//	}
//
//	public void save() {
//		Customer c = new Customer();
//		c.setId(1l);
//		rental.setCustomer(c);
//		rental.getCreditCardInfo().setRental(rental);
//		service.save(rental);
//
//		try {
//			FacesContext.getCurrentInstance().getExternalContext().redirect("/system/static/success.xhtml");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
