package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.mum.service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

//    private List<Car> cars;
//
//    private Car car;
//
//    @PostConstruct
//    private void init() {
//        car = new Car();
//    }
//
//    public List<Car> getCars() {
//        if (cars == null || cars.size() == 0) {
//            cars = service.findAll();
//        }
//        return cars;
//    }
//
//    public Car getCar() {
//        return car;
//    }
//
//    public void setCar(Car car) {
//        this.car = car;
//    }
//
//    public String save() {
//        String message = new String();
//        if(car.getId()==null){
//            message="The Car was registered successfully!";
//        }else{
//            message="The Car was edited successfully!";
//        }
//        service.save(car);
//        car = new Car();
//        cars = new ArrayList<>();
//        showMessage(message,null, InformationType.INFORMATION);
//        return "carProfile?faces-redirect:true";
//    }
//
//    public void select(Long id){
//        car = service.findById(id);
//    }
//
//    public void delete(Long id){
//        service.deleteById(id);
//        cars = new ArrayList<>();
//        showMessage("Car was deleted successfully", null, InformationType.INFORMATION);
//    }
}
