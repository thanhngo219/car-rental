package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.service.CarOwnerProfileService;

public class CarOwnerProfileController {

	@Autowired
	private CarOwnerProfileService carOwnerProfileService;

//	private List<CarOwnerProfile> profiles;
//
//	// placeholder variable for creating new profile
//	private CarOwnerProfile newProfile;
//
//	private CarOwnerProfile selectedProfile;
//	private ProfileStatus selectedStatus;
//
//	public List<CarOwnerProfile> getProfiles() {
//		profiles = carOwnerProfileService.findPendingApproveProfiles();
//		return profiles;
//	}
//
//	public void setProfiles(List<CarOwnerProfile> profiles) {
//		this.profiles = profiles;
//	}
//
//	public CarOwnerProfile getNewProfile() {
//		if (newProfile == null) {
//			newProfile = new CarOwnerProfile();
//			Calendar cal = Calendar.getInstance();
//			cal.set(1988, Calendar.JANUARY, 10);
//
////			newProfile.setUserId("user1");
////			newProfile.setPassword("123");
//			newProfile.setFirstName("FirstName");
//			newProfile.setLastName("LastName");
//			newProfile.setDob(cal.getTime());
//			newProfile.setEmailAddress("test@mail.com");
//			newProfile.setPhone("111-111-1111");
//			newProfile.setAddress("1000 N 4th St. Fairfield, IA 52557");
////			newProfile.setStatus(ProfileStatus.PENDING);
//		}
//
//		return newProfile;
//	}
//
//	public void setNewProfile(CarOwnerProfile newProfile) {
//		this.newProfile = newProfile;
//	}
//
//	public CarOwnerProfile getSelectedProfile() {
//		return selectedProfile;
//	}
//
//	public void setSelectedProfile(CarOwnerProfile selectedProfile) {
//		this.selectedProfile = selectedProfile;
//	}
//
//	public ProfileStatus[] getStatuses() {
//		return ProfileStatus.values();
//	}
//
//	public ProfileStatus getSelectedStatus() {
//		return selectedStatus;
//	}
//
//	public void setSelectedStatus(ProfileStatus selectedStatus) {
//		this.selectedStatus = selectedStatus;
//	}
//
//	@PostConstruct
//	private void postConstruct() {
////		newProfile = new CarOwnerProfile();
////		profiles = carOwnerProfileService.findPendingApproveProfiles();
//	}
//
//	public void checkAvailableUserId() {
////		if(carOwnerProfileService.findByUserId(newProfile.getUserId())) {
////			String message = "The user id '" + newProfile.getUserId() + "' is already used by other. Please choose another.";
////			showMessage(message, message, InformationType.ERROR);
////		}
////		if(carOwnerProfileService.findByUserId(newProfile.getUser().getUsername())) {
////			String message = "The user id '" + newProfile.getUser().getUsername() + "' is already used by other. Please choose another.";
////			showMessage(message, message, InformationType.ERROR);
////		}
//	}
//
//	public String createNewProfile() {
//		System.out.println(newProfile.toString());
//		try {
//			carOwnerProfileService.create(newProfile);
//			newProfile = null;
//			setProfiles(carOwnerProfileService.findPendingApproveProfiles());
//		} catch (ValidationException e) {
//			// TODO: handle exception
//			showMessage(e.getMessage(), e.getMessage(), InformationType.ERROR);
//		}
//		return "/system/car_owner/browse?faces-redirect=true";
//	}
//
//	public String viewProfile() {
//		if (selectedProfile == null || selectedProfile.getId() == null) {
//			String message = "Please select a profile";
//			showMessage(message, null, InformationType.INFORMATION);
//			return null;
//		}
//		setSelectedStatus(selectedProfile.getStatus());
//		return "/system/car_owner/approve?faces-redirect=true";
//	}
//
//	public Boolean approvedStatus() {
//		return selectedStatus == ProfileStatus.APPROVED;
//	}
//
//	public Boolean isSelectedProfileApproved() {
//		return selectedProfile != null && selectedProfile.getStatus() == ProfileStatus.APPROVED;
//	}
//
//	public String approveProfile() {
//		System.out.println(selectedProfile.toString());
//		if (selectedStatus != ProfileStatus.APPROVED) {
//			return null;
//		}
//		try {
//			carOwnerProfileService.approveProfile(selectedProfile);
//			setProfiles(carOwnerProfileService.findPendingApproveProfiles());
//		} catch (ValidationException e) {
//			// TODO: handle exception
//			System.out.println(e.toString());
//		}
//		return "/system/car_owner/browse?faces-redirect=true";
//	}

}
