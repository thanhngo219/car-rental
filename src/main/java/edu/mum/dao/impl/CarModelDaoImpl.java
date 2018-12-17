package edu.mum.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.dao.CarModelDao;
import edu.mum.domain.CarModel;

@Repository
public class CarModelDaoImpl extends GenericDaoImpl<CarModel> implements CarModelDao {
	public CarModelDaoImpl() {
		super.setDaoType(CarModel.class);
	}
}
