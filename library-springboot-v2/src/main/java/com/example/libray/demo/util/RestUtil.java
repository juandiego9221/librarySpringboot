package com.example.libray.demo.util;

import com.example.libray.demo.exception.ResourceNotFoundException;

public class RestUtil {
	
	private RestUtil() {
		throw new AssertionError();
	}
	
	public static <T> T checkNotNull(final T reference) {
		return checkNotNull(reference, null);
	}
	
	public static <T> T checkNotNull(final T reference, final String message) {
		if(reference == null) {
			throw new ResourceNotFoundException(message);
		}
		return reference;
	}

}
