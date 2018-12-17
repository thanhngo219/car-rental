package edu.mum.service;

import java.util.List;

import edu.mum.validation.ValidationException;

public interface GenericService<T> {
	public abstract List<T> findAll();

	public abstract List<T> findAll(String orderingProperty);

	public abstract T findById(Long id);

	public abstract void save(T t) throws ValidationException;

	public abstract void deleteById(Long id);
}
