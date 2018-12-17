package edu.mum.service;

import java.util.List;

import edu.mum.validation.ValidationException;

public interface GenericService<T> {
	List<T> findAll();

	List<T> findAll(String orderingProperty);

	T findById(Long id);

	void save(T t) throws ValidationException;

	void deleteById(Long id);
}
