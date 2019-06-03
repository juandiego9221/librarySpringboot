package com.example.libray.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.libray.demo.bean.Book;

public interface BookJpaDao extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book>{

}
