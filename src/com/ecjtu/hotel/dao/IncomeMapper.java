package com.ecjtu.hotel.dao;

import java.util.List;

import com.ecjtu.hotel.pojo.Income;

public interface IncomeMapper {

	int addIncome(Income income);

	int deleteIncomeById(Integer id);

	int updateIncomeById(Income income);

	List<Income> getAllIncomes();

	Income getIncomeById(Integer id);
}
