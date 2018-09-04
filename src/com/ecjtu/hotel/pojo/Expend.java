package com.ecjtu.hotel.pojo;

public class Expend {

	private Integer id;
	private String incomename;
	private String detail;
	private Integer money;
	private String opreator;
	private String remark;

	public Expend(Integer id, String incomename, String detail, Integer money, String opreator, String remark) {
		super();
		this.id = id;
		this.incomename = incomename;
		this.detail = detail;
		this.money = money;
		this.opreator = opreator;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Expend [id=" + id + ", incomename=" + incomename + ", detail=" + detail + ", money=" + money
				+ ", opreator=" + opreator + ", remark=" + remark + "]";
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getOpreator() {
		return opreator;
	}

	public void setOpreator(String opreator) {
		this.opreator = opreator;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Expend() {
		// TODO Auto-generated constructor stub
	}

}
