package com.example.libray.demo.common;

import com.example.libray.demo.util.RestUtil;

public abstract class AbstractController<T> extends AbstractReadOnlyController<T>{
	
	protected final void createInternal(final T resource) {
		RestUtil.checkRequestElementNotNull(resource);
		getService().create(resource);
		
	}
	
	protected final void updateInternal(final long id,final T resource) {
		RestUtil.checkNotNull(resource);
	}
	
	protected final void deleteByIdInternal(final long id) {
		
	}

}
