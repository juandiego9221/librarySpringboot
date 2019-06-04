package com.example.libray.demo.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.libray.demo.util.RestUtil;

public abstract class AbstractController<T> extends AbstractReadOnlyController<T>{
	
    protected final Logger logger = LoggerFactory.getLogger(getClass());

	
	protected final void createInternal(final T resource) {
		RestUtil.checkRequestElementNotNull(resource);
		getService().create(resource);		
	}
	
	protected final void updateInternal(final long id,final T resource) {
		RestUtil.checkNotNull(resource);
		RestUtil.checkRequestElementNotNull(resource);
		getService().update(resource);
	}
	
	protected final void deleteByIdInternal(final long id) {
		getService().delete(id);
	}

}
