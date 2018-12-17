package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.mum.service.CarOwnerProfileService;
import edu.mum.service.UserService;

@Controller
public class CarOwnerApplicationController {

	@Autowired
	private CarOwnerProfileService service;
	
	@Autowired
	private UserService userService;
//
//	private CarOwnerProfile carOwnerProfile;
//
//	@PostConstruct
//	void init() {
//		resetForm();
//	}
//
//	public void resetForm() {
//		carOwnerProfile = new CarOwnerProfile();
//		carOwnerProfile.setUser(new User());
//		carOwnerProfile.setBankAccount(new BankAccount());
//	}
//
//	public CarOwnerProfile getCarOwnerProfile() {
//		return carOwnerProfile;
//	}
//
//	public void setCarOwnerProfile(CarOwnerProfile carOwnerProfile) {
//		this.carOwnerProfile = carOwnerProfile;
//	}
//
//	public void checkUsernameAvailability() {
//		if (userService.verifyExistsAnyByUsername(carOwnerProfile.getUser().getUsername())) {
//			showMessage("username", "Username already taken!", null, InformationType.WARNING);
//		}
//	}
//
//	public void save() {
//		try {
//
//			String password = new BCryptPasswordEncoder().encode(carOwnerProfile.getUser().getPassword());
//			carOwnerProfile.getUser().setPassword(password);
//			User user = userService.save(carOwnerProfile.getUser());
//
//			if (user.getId() != null) {
//				carOwnerProfile.setBankAccount(null);
//				carOwnerProfile.setStatus(ProfileStatus.PENDING);
//				carOwnerProfile.setUser(user);
//				carOwnerProfile = service.save(carOwnerProfile);
//				resetForm();
//				showMessage("Application registered successfully!", null, InformationType.INFORMATION);
//			}
//
//		} catch (ValidationException e) {
//			showMessage(e.getMessage(), null, InformationType.ERROR);
//		}
//	}
}
