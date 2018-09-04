package com.ecjtu.hotel.dao;

import java.util.List;

import com.ecjtu.hotel.pojo.Expend;

public interface ExpendMapper {
	//
	Expend getExpendById(Integer id);

	int deleteExpendById(Integer id);

	int addExpend(Expend expend);

	List<Expend> getExpends();

	int updateExpend(Expend expend);
}
