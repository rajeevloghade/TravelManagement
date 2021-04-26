
package com.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.entity.Booking;

public interface IBookingDao extends JpaRepository<Booking,Integer>{

}