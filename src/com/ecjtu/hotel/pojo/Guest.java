package com.ecjtu.hotel.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Guest {
	private Long id;
	private String name;
	private String idnum;
	private Integer roomnum;
	private String phone;
	
	private Date arraytime;

	private Date leavetime;
	private Integer receivable;
	private Integer deposit;
	private Integer status;
	public Guest(Long id, String name, String idnum, Integer roomnum, String phone, Date arraytime, Date leavetime,
			Integer receivable, Integer deposit, Integer status, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.idnum = idnum;
		this.roomnum = roomnum;
		this.phone = phone;
		this.arraytime = arraytime;
		this.leavetime = leavetime;
		this.receivable = receivable;
		this.deposit = deposit;
		this.status = status;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Guest [id=" + id + ", name=" + name + ", idnum=" + idnum + ", roomnum=" + roomnum + ", phone=" + phone
				+ ", arraytime=" + arraytime + ", leavetime=" + leavetime + ", receivable=" + receivable + ", deposit="
				+ deposit + ", status=" + status + ", remark=" + remark + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdnum() {
		return idnum;
	}
	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}
	public Integer getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(Integer roomnum) {
		this.roomnum = roomnum;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getArraytime() {
		return arraytime;
	}
	public void setArraytime(Date arraytime) {
		this.arraytime = arraytime;
	}
	public Date getLeavetime() {
		return leavetime;
	}
	public void setLeavetime(Date leavetime) {
		this.leavetime = leavetime;
	}
	public Integer getReceivable() {
		return receivable;
	}
	public void setReceivable(Integer receivable) {
		this.receivable = receivable;
	}
	public Integer getDeposit() {
		return deposit;
	}
	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	private String remark;
	public Guest() {
		// TODO Auto-generated constructor stub
	}

}
