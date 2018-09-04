package com.ecjtu.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecjtu.hotel.dao.ExpendMapper;
import com.ecjtu.hotel.pojo.Expend;
import com.ecjtu.hotel.service.IExpendService;
@Service
public class ExpendService implements IExpendService {

	@Autowired
	ExpendMapper expendMapper;

	@Override
	public Expend getExpendById(Integer id) {
		// TODO Auto-generated method stub
		return expendMapper.getExpendById(id);
	}

	@Override
	public int deleteExpendById(Integer id) {
		// TODO Auto-generated method stub
		return expendMapper.deleteExpendById(id);
	}

	@Override
	public int addExpend(Expend expend) {
		// TODO Auto-generated method stub
		return expendMapper.addExpend(expend);
	}

	@Override
	public List<Expend> getExpends() {
		// TODO Auto-generated method stub
		return expendMapper.getExpends();
	}

	@Override
	public int updateExpend(Expend expend) {
		// TODO Auto-generated method stub
		return expendMapper.updateExpend(expend);
	}

}
