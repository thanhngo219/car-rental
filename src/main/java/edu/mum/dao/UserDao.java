package edu.mum.dao;

import org.springframework.stereotype.Repository;

import edu.mum.domain.User;

@Repository
public interface UserDao extends GenericDao<User> {
	public User findByUsername(String username);

	public Boolean existsByUsername(String username);
}
