package com.ecjtu.hotel.service;

import java.util.List;

import com.ecjtu.hotel.pojo.Reserve;

public interface IReserveService {


	int addReserve(Reserve reserve);

	int deleteReserveById(Integer id);

	int updateReserve(Reserve reserve);

	List<Reserve> getAllReserve();

	Reserve getReserveById(Integer id);
}
