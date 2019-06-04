package com.example.libray.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

import com.example.libray.demo.bean.Book;
import com.example.libray.demo.common.AbstractService;
import com.example.libray.demo.dao.BookJpaDao;

@Service
@Transactional
public class BookServiceImpl extends AbstractService<Book> implements BookService{
    protected final Logger logger = LoggerFactory.getLogger(getClass());

	
	@Autowired
	private BookJpaDao dao;
	
	public void actualizar() {
		
	}

	@Override
	protected final BookJpaDao getDao() {
		return dao;
	}

	@Override
	protected JpaSpecificationExecutor<Book> getSpecificationExecutor() {
		return dao;
	}

	@Override
	public void updateResource(Book book, long id) {
		// TODO Auto-generated method stub
		
	}
	
}
