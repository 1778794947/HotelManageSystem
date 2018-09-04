package com.ecjtu.hotel.service;

import java.util.List;

import com.ecjtu.hotel.pojo.Expend;

public interface IExpendService {

	Expend getExpendById(Integer id);

	int deleteExpendById(Integer id);

	int addExpend(Expend expend);

	List<Expend> getExpends();

	int updateExpend(Expend expend);
}
