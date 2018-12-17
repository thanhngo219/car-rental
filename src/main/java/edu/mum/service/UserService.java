package edu.mum.service;

import edu.mum.domain.User;

public interface UserService extends GenericService<User> {
	boolean verifyExistsAnyByUsername(String username);
}
