package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.mum.service.CarProfileService;

@Controller
public class CarProfileAnalysisController {

    @Autowired
    private CarProfileService carProfileService;

//    private List<CarProfile> carProfiles;
//
//    public List<CarProfile> getCarProfiles() {
//        if(carProfiles==null || carProfiles.size()==0){
//            carProfiles=service.findByStatus(AnalysisStatus.PENDING);
//        }
//        return carProfiles;
//    }
//
//
//    public void resetForm(){
//        carProfiles = new ArrayList<>();
//    }
//
//    @PostConstruct
//    void init(){
//        resetForm();
//    }
//
//    public void approve(CarProfile carProfile){
//        carProfile.setStatus(AnalysisStatus.APPROVED);
//        save(carProfile,"Approved");
//    }
//
//    public void reject(CarProfile carProfile){
//        carProfile.setStatus(AnalysisStatus.REJECTED);
//        save(carProfile,"Rejected");
//    }
//
//    public void save(CarProfile carProfile, String action){
//        try{
//            carProfile = service.save(carProfile);
//            resetForm();
//            showMessage("Car Profile "+action+" Successfully",null,InformationType.INFORMATION);
//        }catch (ValidationException e){
//            showMessage(e.getMessage(),null,InformationType.ERROR);
//        }
//    }
}
