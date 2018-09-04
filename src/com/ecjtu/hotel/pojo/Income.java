package com.ecjtu.hotel.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Income {

	private Integer id;
	private String incomename;
	private Integer money;
	
	private String detail;
	private String operator;
	private String remark;
	
	

	public Income(Integer id, String incomename, Integer money, String detail, String operator, String remark) {
		super();
		this.id = id;
		this.incomename = incomename;
		this.money = money;
		this.detail = detail;
		this.operator = operator;
		this.remark = remark;
	}



	@Override
	public String toString() {
		return "Income [id=" + id + ", incomename=" + incomename + ", money=" + money + ", detail=" + detail
				+ ", operator=" + operator + ", remark=" + remark + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getIncomename() {
		return incomename;
	}



	public void setIncomename(String incomename) {
		this.incomename = incomename;
	}



	public Integer getMoney() {
		return money;
	}



	public void setMoney(Integer money) {
		this.money = money;
	}



	public String getDetail() {
		return detail;
	}



	public void setDetail(String detail) {
		this.detail = detail;
	}



	public String getOperator() {
		return operator;
	}



	public void setOperator(String operator) {
		this.operator = operator;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	public Income() {
		// TODO Auto-generated constructor stub
	}

}
