package com.ecjtu.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecjtu.hotel.dao.IncomeMapper;
import com.ecjtu.hotel.pojo.Income;
import com.ecjtu.hotel.service.IIncomeService;
@Service
public class IncomeService implements IIncomeService {

	@Autowired
	IncomeMapper incomeMapper;

	@Override
	public int addIncome(Income income) {
		// TODO Auto-generated method stub
		return incomeMapper.addIncome(income);
	}

	@Override
	public int deleteIncomeById(Integer id) {
		// TODO Auto-generated method stub
		return incomeMapper.deleteIncomeById(id);
	}

	@Override
	public int updateIncomeById(Income income) {
		// TODO Auto-generated method stub
		return incomeMapper.updateIncomeById(income);
	}

	@Override
	public List<Income> getAllIncomes() {
		// TODO Auto-generated method stub
		return incomeMapper.getAllIncomes();
	}

	@Override
	public Income getIncomeById(Integer id) {
		// TODO Auto-generated method stub
		return incomeMapper.getIncomeById(id);
	}

}
