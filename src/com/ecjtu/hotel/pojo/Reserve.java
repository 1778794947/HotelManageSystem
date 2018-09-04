package com.ecjtu.hotel.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Reserve {

	private Integer id;
	private String name;
	private Long phone;
	private String roomtype;
	
	private Date arraytime;
	
	private Date leavetime;
	
	@Override
	public String toString() {
		return "Reserve [id=" + id + ", name=" + name + ", phone=" + phone + ", roomtype=" + roomtype + ", arraytime="
				+ arraytime + ", leavetime=" + leavetime + "]";
	}

	public Reserve(Integer id, String name, Long phone, String roomtype, Date arraytime, Date leavetime) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.roomtype = roomtype;
		this.arraytime = arraytime;
		this.leavetime = leavetime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
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

	public Reserve() {
		// TODO Auto-generated constructor stub
	}
	

}
