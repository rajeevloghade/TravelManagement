package com.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.entity.Travels;

public interface ITravelsDao extends JpaRepository<Travels,Integer>{
	
}
