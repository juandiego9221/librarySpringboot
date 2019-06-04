package com.example.libray.demo.common;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public abstract class AbstractRawService<T> implements IRawService<T>{
	
    protected final Logger logger = LoggerFactory.getLogger(getClass());

	
	@Autowired
	protected ApplicationEventPublisher eventPublisher;
	
	public AbstractRawService() {
		super();
	}

	@Override
	public Optional<T> findOne(long id) {
		return getDao().findById(id);
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
	
	@Override
	public void update(T resource) {
		getDao().save(resource);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void delete(long id) {
		final Optional<T> entidadObtenida = getDao().findById(id);
		if(entidadObtenida ==null) {
			logger.info("xxxxxx1");
		}else {
			logger.info("xxxxxx2");
		}
		logger.info("xxxxxx3");

		getDao().delete(entidadObtenida.get());
	}
	
	
	
	protected abstract PagingAndSortingRepository<T, Long> getDao();
	protected abstract JpaSpecificationExecutor<T> getSpecificationExecutor();

}
