package com.example.libray.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.libray.demo.bean.Book;
import com.example.libray.demo.common.AbstractController;
import com.example.libray.demo.common.ISortingController;

public class BookController extends AbstractController<Book> implements ISortingController<Book>{

	@Override
	@ResponseBody
	@GetMapping
	public List<Book> findAll(HttpServletRequest request) {
		return findAllInterna(request);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public void create(@RequestBody @Valid final Book resource) {
		createInternal(resource);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public void update(@PathVariable("id") final Long id,@RequestBody @Valid final Book resource) {
		updateInternal(id, resource);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping
	public void delete(@PathVariable("id") final Long id) {
		deleteByIdInternal(id);
	}
	
	

}
