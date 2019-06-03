package com.example.libray.demo.common;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.libray.demo.exception.ResourceNotFoundException;


public abstract class AbstractReadOnlyController<T> {
	
	protected final List<T> findAllInterna(final HttpServletRequest request){
		if(request.getParameterNames().hasMoreElements() ) {
			throw new ResourceNotFoundException();
		}
		
		return Collections.emptyList();
	}
	
	
	protected abstract IRawService<T> getService();

}
