package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.UserDao;
import edu.mum.domain.User;
import edu.mum.service.UserService;
import edu.mum.validation.ValidationException;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao repository;

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public List<User> findAll(String orderingProperty) {
		return repository.findAll(orderingProperty);
	}

	@Override
	public User findById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void save(User user) throws ValidationException {
		if (verifyExistsAnyByUsername(user.getUsername())) {
			throw new ValidationException("The informed username is already taken!");
		}
		repository.save(user);
	}

	@Override
	public void deleteById(Long id) {
		repository.delete(id);
	}

	@Override
	public boolean verifyExistsAnyByUsername(String username) {
		return repository.existsByUsername(username);
	}
}
