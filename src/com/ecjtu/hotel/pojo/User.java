package com.ecjtu.hotel.pojo;

public class User {
	private Integer id;
	private String name;
	private String password;
	private String idcard;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", idcard=" + idcard + "]";
	}

	public User(Integer id, String name, String password, String idcard) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.idcard = idcard;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

}
