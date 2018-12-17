package edu.mum.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.dao.CarDao;
import edu.mum.domain.Car;

@Repository
public class CarDaoImpl extends GenericDaoImpl<Car> implements CarDao {
	public CarDaoImpl() {
		super.setDaoType(Car.class);
	}
}
