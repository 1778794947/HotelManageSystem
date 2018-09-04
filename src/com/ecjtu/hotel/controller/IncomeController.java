package com.ecjtu.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecjtu.hotel.pojo.Income;
import com.ecjtu.hotel.service.IIncomeService;


@Controller
public class IncomeController {

	@Autowired
	private IIncomeService incomeService;

	@RequestMapping("/addIncome")
	@ResponseBody
	public String addIncome(@ModelAttribute Income income) {

		return incomeService.addIncome(income) != 0 ? "ok" : "error";

	}

	@RequestMapping("/deleteIncome")
	@ResponseBody
	public String deleteIncome(Integer id) {

		return incomeService.deleteIncomeById(id) != 0 ? "ok" : "error";

	}

	@RequestMapping("/updateIncome")
	@ResponseBody
	public String updateIncome(@ModelAttribute Income income) {

		return incomeService.updateIncomeById(income) != 0 ? "ok" : "error";

	}

	@RequestMapping("/listIncome")
	public String listIncome(Model model) {
		List<Income> incomes = incomeService.getAllIncomes();
		model.addAttribute("incomes", incomes);
		return "WEB-INF/app/showincome";
	}

	@RequestMapping("/editIncome")
	@ResponseBody
	public Income editIncome(Model model, Integer id) {
		Income income = incomeService.getIncomeById(id);
		model.addAttribute("income", income);
		return income;
	}
}
