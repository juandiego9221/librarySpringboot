package com.example.libray.demo.util;

import com.example.libray.demo.exception.BadRequestException;
import com.example.libray.demo.exception.ConflictException;
import com.example.libray.demo.exception.ResourceNotFoundException;

public class RestUtil {
	
	private RestUtil() {
		throw new AssertionError();
	}
	
	public static <T> T checkNotNull(final T reference) {
		return checkNotNull(reference, null);
	}
	
	public static <T> T checkRequestElementNotNull(final T reference) {
		return checkRequestElementNotNull(reference, null);
	}
	
	public static void checkRequestState(final boolean expression) {
		 checkRequestState(expression,null);	
	}
	
	public static void checkIfBadRequest(final boolean expression) {
		checkIfBadRequest(expression,null);
		
	}
		
	public static <T> T checkNotNull(final T reference, final String message) {
		if(reference == null) {
			throw new ResourceNotFoundException(message);
		}
		return reference;
	}
	
	public static <T> T checkRequestElementNotNull(final T reference, final String message) {
		if(reference == null) {
			throw new BadRequestException(message);
		}
		return reference;
	}
	
	public static void checkRequestState(final boolean expression, final String message) {
		if(!expression) {
			throw new ConflictException(message);
		}
	}
	
	public static void checkIfBadRequest(final boolean expression, final String message) {
		if(!expression) {
			throw new BadRequestException(message);
		}
	}
	
	

}
