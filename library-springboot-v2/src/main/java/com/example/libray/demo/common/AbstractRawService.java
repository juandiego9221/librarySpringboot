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
		super();
	}

	@Override
	public List<T> findAll() {
		return  (List<T>) getDao().findAll();
	}

	@Override
	public T create(T resource) {
		final T entidadPersistida = getDao().save(resource);
		return entidadPersistida;
	}
	
	protected abstract PagingAndSortingRepository<T, Long> getDao();
	protected abstract JpaSpecificationExecutor<T> getSpecificationExecutor();

}
