package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.CarOwnerProfileDao;
import edu.mum.domain.CarOwnerProfile;
import edu.mum.domain.ProfileStatus;

@Repository
public class CarOwnerProfileDaoImpl extends GenericDaoImpl<CarOwnerProfile> implements CarOwnerProfileDao {
	public List<CarOwnerProfile> existsByStatus(ProfileStatus status) {
		Query query = entityManager.createQuery("select c from CarOwnerProfile c where c.status = :status");
		return (List<CarOwnerProfile>) query.setParameter("status", status.name()).getResultList();
	}
}
