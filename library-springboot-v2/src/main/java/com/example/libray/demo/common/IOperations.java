package com.example.libray.demo.common;

import java.util.List;
import java.util.Optional;

public interface IOperations<T> {
	
	Optional<T> findOne(final long id);
	
	List<T> findAll();
	
	T create(final T resource);
	
	void update(final T resource);
	
	void delete(final long id);
	
	

}
