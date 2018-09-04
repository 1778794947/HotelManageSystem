package com.ecjtu.hotel.service;

import java.util.List;

import com.ecjtu.hotel.pojo.Income;

public interface IIncomeService {

	int addIncome(Income income);

	int deleteIncomeById(Integer id);

	int updateIncomeById(Income income);

	List<Income> getAllIncomes();
	
	Income getIncomeById(Integer id);
}
