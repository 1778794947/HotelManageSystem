package com.ecjtu.hotel.pojo;

public class Room {
	private Integer roomnum;
	private String roomtype;
	private Double price;
	private Integer status;
	@Override
	public String toString() {
		return "Room [roomnum=" + roomnum + ", roomtype=" + roomtype + ", price=" + price + ", status=" + status + "]";
	}
	public Room() {
		super();
	}
	public Integer getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(Integer roomnum) {
		this.roomnum = roomnum;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Room(Integer roomnum, String roomtype, Double price, Integer status) {
		super();
		this.roomnum = roomnum;
		this.roomtype = roomtype;
		this.price = price;
		this.status = status;
	}
	
	

}
