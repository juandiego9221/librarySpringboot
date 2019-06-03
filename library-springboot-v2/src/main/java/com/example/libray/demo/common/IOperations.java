package com.example.libray.demo.common;

import java.util.List;

public interface IOperations<T> {
	
	List<T> findAll();
	
	T create(final T resource);
	
	

}
