package com.example.libray.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

import com.example.libray.demo.bean.Book;
import com.example.libray.demo.common.AbstractService;
import com.example.libray.demo.dao.BookJpaDao;

@Service
@Transactional
public class BookServiceImpl extends AbstractService<Book> implements BookService{
	
	@Autowired
	private BookJpaDao dao;

	@Override
	public List<Book> findAll() {
		return getDao().findAll();
	}

	@Override
	public Book create(Book resource) {
		return getDao().save(resource);
	}

	@Override
	protected final BookJpaDao getDao() {
		return dao;
	}

	@Override
	protected JpaSpecificationExecutor<Book> getSpecificationExecutor() {
		return dao;
	}

	
}
