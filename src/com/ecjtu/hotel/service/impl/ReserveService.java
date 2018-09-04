package com.ecjtu.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecjtu.hotel.dao.ReserveMapper;
import com.ecjtu.hotel.pojo.Reserve;
import com.ecjtu.hotel.service.IReserveService;

@Service
public class ReserveService implements IReserveService {

	@Autowired
	ReserveMapper reserveMapper;
	
	public ReserveService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addReserve(Reserve reserve) {
		// TODO Auto-generated method stub
		return reserveMapper.addReserve(reserve);
	}

	@Override
	public int deleteReserveById(Integer id) {
		// TODO Auto-generated method stub
		return reserveMapper.deleteReserveById(id);
	}

	@Override
	public int updateReserve(Reserve reserve) {
		// TODO Auto-generated method stub
		return reserveMapper.updateReserve(reserve);
	}

	@Override
	public List<Reserve> getAllReserve() {
		// TODO Auto-generated method stub
		return reserveMapper.getAllReserve();
	}

	@Override
	public Reserve getReserveById(Integer id) {
		// TODO Auto-generated method stub
		return reserveMapper.getReserveById(id);
	}

}
