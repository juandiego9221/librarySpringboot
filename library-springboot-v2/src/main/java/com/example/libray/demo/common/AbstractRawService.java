package com.example.libray.demo.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public abstract class AbstractRawService<T> implements IRawService<T>{
	
	@Autowired
	protected ApplicationEventPublisher eventPublisher;
	
	public AbstractRawService() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T create(T resource) {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected abstract PagingAndSortingRepository<T, Long> getDao();
	protected abstract JpaSpecificationExecutor<T> getSpecificationExecutor();

}
