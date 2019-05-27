package com.example.libray.demo.common;

import java.util.Collections;
import java.util.List;

public abstract class AbstractReadOnlyController<T> {
	
	protected final List<T> findAllInterna(){
		return Collections.emptyList();
	}

}
