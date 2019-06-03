package com.example.libray.demo.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.libray.demo.exception.ResourceNotFoundException;


public abstract class AbstractReadOnlyController<T> {
	
	protected final List<T> findAllInternal(final HttpServletRequest request){
		if(request.getParameterNames().hasMoreElements() ) {
			throw new ResourceNotFoundException();
		}
		
		return getService().findAll();
	}
	
	
	protected abstract IRawService<T> getService();

}
