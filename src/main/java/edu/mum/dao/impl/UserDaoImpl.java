package edu.mum.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.UserDao;
import edu.mum.domain.User;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {
	public User findByUsername(String username) {
		Query query = entityManager.createQuery("select u from User u where u.username = :username");
		return (User) query.setParameter("username", username).getSingleResult();
	}

	public Boolean existsByUsername(String username) {
		Query query = entityManager.createQuery("select u from User u where u.username = :username");
		return query.setParameter("username", username).getResultList().size() > 0;
	}

}
