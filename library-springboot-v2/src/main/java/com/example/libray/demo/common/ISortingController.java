package com.example.libray.demo.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public interface ISortingController<T> {
	
	public List<T> findAll(final HttpServletRequest request);

}
