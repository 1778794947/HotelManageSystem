package com.ecjtu.hotel.dao;

import java.util.List;

import com.ecjtu.hotel.pojo.Reserve;


public interface ReserveMapper {

	int addReserve(Reserve reserve);

	int deleteReserveById(Integer id);

	int updateReserve(Reserve reserve);

	List<Reserve> getAllReserve();

	Reserve getReserveById(Integer id);
}
